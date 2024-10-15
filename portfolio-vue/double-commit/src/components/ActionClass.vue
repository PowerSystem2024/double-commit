<script lang="js">
import { supabase } from '@/lib/supabaseClient'
import { z } from 'zod'

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

  static async sendComment(schema, data, errors) {
    try {
      schema.parse(data)

      const { error } = await supabase.from('portfolio_comments').insert([data])

      if (error) {
        console.error(`Error submitting form: ${error.message}`)
      } else {
        errors = {}
      }
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

  static async getVisitsCount() {
    const { data, error } = await supabase
      .from('double_commit_visits')
      .select('*')
      .order('id', { ascending: false })
      .limit(1)

    if (error) return console.error('Error al recibir los datos de la visita: ', error.message)
    return data
  }

  static async delete(id) {
    const { error } = await supabase.from('portfolio_comments').delete().eq('id', id)

    if (error) {
      console.error('Error al borrar comentario: ', error.message)
      return
    }

    location.reload()
    await this.getComment()
  }
}
</script>
