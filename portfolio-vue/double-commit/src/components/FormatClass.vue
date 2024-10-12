<script lang="js">
export class Format {
  static dateAndTime(d) {
    const date = new Date(d).toLocaleDateString('es-ES', {
      year: 'numeric',
      month: 'long',
      day: '2-digit',
      hour: '2-digit',
      minute: '2-digit'
    })
    return date
  }

  static date(d) {
    const date = new Date(d).toLocaleDateString('es-Es', {
      year: 'numeric',
      month: 'short',
      day: '2-digit'
    })
    return date
  }

  static time(t) {
    const time = new Date(t).toLocaleTimeString('es-Es', {
      hour: '2-digit',
      minute: '2-digit',
      second: '2-digit'
    })
    return time
  }
}
</script>
