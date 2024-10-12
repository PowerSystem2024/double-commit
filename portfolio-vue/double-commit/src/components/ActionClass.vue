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
}
</script>
