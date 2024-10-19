<script lang="js">
export class Data {
  static get = async () => {
    const res = await fetch('http://localhost:1234/person', {
      method: 'GET',
      mode: 'cors',
      headers: {
        'Content-Type': 'application/json'
      }
    })
    const data = await res.json()
    return data
  }
}
</script>
