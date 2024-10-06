<script setup lang="js">
import { MapPin } from 'lucide-vue-next'
import { getLocation } from './CurrentPosition.vue'
import { ref, onMounted } from 'vue'

const location = ref({ city: '', country: '' })

onMounted(async () => {
  const currentPosition = {
    city: await getLocation.city(),
    country: await getLocation.country()
  }
  location.value = currentPosition
})
</script>

<template>
  <header>
    <h1>Bienvenidos al portafolio <span>Double-Commit</span></h1>
  </header>
  <aside>
    <p>
      Es un placer recibirte desde
      <b v-if="location.city === ''" class="loading">Cargando...</b>
      <b v-else
        ><MapPin width="15" height="15" style="transform: translateY(2px)" /> {{ location.city }},
        {{ location.country }}!
      </b>
    </p>
  </aside>
</template>

<style lang="css" scoped>
header {
  max-width: 800px;
  display: flex;
  justify-content: center;
  margin: 0 auto;
  z-index: 99;
}

h1 {
  color: var(--color-heading);
  font-size: 4rem;
  text-align: center;
  font-weight: 700;
  text-wrap: pretty;
}

span {
  font-size: 4rem;
  font-weight: 700;
  color: var(--second-color-text);
  margin-left: 4px;
}

aside {
  display: flex;
  justify-content: center;
  margin: 0 auto;
}

.loading {
  padding: 2px 8px;
}

p {
  padding: 6px 12px;
  border: 1px solid var(--color-border);
  border-radius: 99px;
  background-color: #02284a;
  color: var(--color-heading);
}

b {
  background-color: #0099ff9d;
  border-radius: 99px;
  padding: 2px 6px;
  color: var(--color-heading);
  align-items: center;
}

@media (width <= 700px) {
  h1,
  span {
    font-size: 2.5rem;
  }
}
</style>
