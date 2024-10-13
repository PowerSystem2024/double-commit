<script setup lang="js">
import { MapPin } from 'lucide-vue-next'
import { GetLocation } from './CurrentPosition.vue'
import { ref, onMounted } from 'vue'
import { Terminal } from 'lucide-vue-next'
import { Model } from './ActionClass.vue'

const location = ref({ city: '', country: '' })
const ip = ref([])

onMounted(async () => {
  const currentPosition = {
    city: await GetLocation.city(),
    country: await GetLocation.country()
  }
  location.value = currentPosition

  ip.value = await Model.getVisitsCount()

  const actualIP = await GetLocation.ip()
  const previousIPs = ip.value.map((v) => v.ip)

  if (!previousIPs.includes(actualIP)) {
    await Model.sendVisit({ ip: actualIP })
  } else {
    return null
  }
})
</script>

<template>
  <header>
    <h1>
      Bienvenidos al portafolio
      <span><Terminal class="terminal-icon" /> Double-Commit</span>
    </h1>
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
  font-weight: 800;
  text-wrap: pretty;
  line-height: 1.4;
}

span {
  font-size: 4rem;
  font-weight: 800;
  color: var(--second-color-text);
}

aside {
  display: flex;
  justify-content: center;
  margin: 16px auto;
}

.loading {
  padding: 2px 8px;
}

.terminal-icon {
  width: 64px;
  height: 64px;
  transform: translateY(11px);
  font-weight: 900;
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
  .terminal-icon {
    display: none;
  }
  p {
    font-size: 14px;
  }
}
</style>
