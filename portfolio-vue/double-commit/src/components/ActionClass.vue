<script lang="js">
import { supabase } from '@/lib/supabaseClient'
import { z } from 'zod'

/**
 * Clase para enviar y recibir datos de la base de datos
 * @class Model
 * @static {function} getComment - Obtiene los comentarios de la base de datos
 * @static {function} sendComment - Envia un comentario a la base de datos
 * @static {function} sendVisit - Envia una visita a la base de datos
 * @static {function} getVisits - Obtiene las visitas de la base de datos
 * @static {function} delete - Elimina un comentario de la base de datos
 */
export class Model {
  static async getComment() {
    const { data, error } = await supabase
      .from('portfolio_comments')
      .select('*')
      .limit(10)
      .order('created_at', { ascending: false })

    if (error) return console.error('Error al obtener los comentarios', error.message)
    return data
  }

  static async sendComment(schema, data, errors, onCreate) {
    try {
      schema.parse(data)

      const { error } = await supabase.from('portfolio_comments').insert([data])

      if (error) {
        console.error(`Error submitting form: ${error.message}`)
      } else {
        errors = {}
      }

      await onCreate()
    } catch (error) {
      if (error instanceof z.ZodError) {
        error.errors.forEach((err) => {
          errors.value[err.path[0]] = err.message
        })
      }
    }
  }

  static async sendVisit(obj) {
    const { data, error } = await supabase.from('double_commit_visits').insert([obj])
    if (error) {
      console.error('Error al enviar datos: ', error.message)
    }
    return data
  }

  static async getVisits({ column }, limit) {
    const { data, error } = await supabase
      .from('double_commit_visits')
      .select(column)
      .order('id', { ascending: false })
      .limit(limit)

    if (error) return console.error('Error al recibir los datos de la visita: ', error.message)
    return data
  }

  static async delete(id) {
    const { error } = await supabase.from('portfolio_comments').delete().eq('id', id)

    if (error) {
      console.error('Error al borrar comentario: ', error.message)
      return
    }

    return { success: true }
  }
}
</script>
