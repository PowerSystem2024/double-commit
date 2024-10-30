<script lang="js" setup>
import { ref, onMounted } from 'vue'
import { Data } from './DataFetch.vue'
//import { Persona } from './PersonaComponent.vue'

const datos = ref({})

onMounted(async () => {
  datos.value = await Data.get()
})
</script>

<template>
  <article v-for="(dato, index) in datos" :key="index">
    <div
      v-for="(el, index) in dato"
      :key="index"
      :style="index % 2 === 0 ? 'background: #222' : ''"
    >
      <h3>Persona: {{ el.persona.idPersona }}</h3>
      <p>Nombre: {{ el.persona.nombre }}</p>
      <p>Apellido: {{ el.persona.apellido }}</p>
      <p>Edad: {{ el.persona.edad }}</p>
      <h3>Contacto:</h3>
      <p>Teléfono: {{ el.persona.contacto.telefono }}</p>
      <p>Correo: {{ el.persona.contacto.correo }}</p>
      <h3>Residencia:</h3>
      <p>País: {{ el.persona.residencia.pais }}</p>
      <p>Provincia: {{ el.persona.residencia.provincia }}</p>
      <p>Ciudad: {{ el.persona.residencia.ciudad }}</p>
    </div>
  </article>
</template>

<style lang="css" scoped>
article {
  max-width: 500px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  margin: 12px auto;
  gap: 4px;
}
div {
  display: flex;
  flex-wrap: wrap;
  flex-direction: column;
  flex-grow: 1;
  padding: 16px;
  border: 1px solid var(--color-border);
}
</style>
