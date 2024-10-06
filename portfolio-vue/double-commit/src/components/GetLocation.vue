<script lang="js">
import { apiKey } from './constants.vue'
let hook = {}
// Clase para obtener ubucación de la api
export class getLocation {
  static async getData() {
    const response = await fetch('https://geolocation.microlink.io/')
    const data = await response.json()
    return data
  }
  // Se obtiene la latitud y longitud de la api del navegador para inyectar en la api del clima
  static async currentPosition() {
    return new Promise((resolve, reject) => {
      if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
          (position) => {
            const latitude = position.coords.latitude
            const longitude = position.coords.longitude
            hook.lat = latitude
            hook.lon = longitude
            resolve(hook)
          },
          (error) => {
            reject(error)
          }
        )
      } else {
        reject(new Error('Geolocalización no está soportada por este navegador'))
      }
    })
  }
  // Obtengo los datos del clima según la latitud y longitud
  //  Con éste truquito me permite obtener una ubicación más precisa y también los datos del clima
  static async apiData() {
    const lat = await this.lat()
    const lon = await this.lon()
    const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${apiKey}`
    const res = await fetch(url)
    const data = res.json()
    return data
  }
  // Se obtiene la ip de la api de microlink
  static async ip() {
    const data = await this.getData()
    return data.ip.address
  }
  // Utilizo el operador nullish ?? para utilizar uno u otro
  // Según si el usuario permite la geolocalización
  static async city() {
    const data = (await this.apiData()) ?? (await this.getData())
    return data.name ?? data.city.name
  }

  static async country() {
    const data = await this.getData()
    return data.country.name
  }

  static async flag() {
    const data = await this.getData()
    return data.country.flag
  }

  static async lat() {
    const data = await this.currentPosition()
    return data.lat
  }

  static async lon() {
    const data = await this.currentPosition()
    return data.lon
  }
}
</script>
