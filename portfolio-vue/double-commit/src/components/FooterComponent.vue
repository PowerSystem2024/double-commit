<script setup lang="js">
import { ref, onMounted } from 'vue'
import { Model } from './ActionClass.vue'
import { Eye } from 'lucide-vue-next'

const visitsCount = ref([])

onMounted(async () => {
  visitsCount.value = await Model.getVisitsCount()
})
</script>

<template>
  <footer v-for="(visits, index) in visitsCount" :key="index">
    <small class="visits"
      ><Eye width="16" height="16" /> Visitas al portfolio: {{ visits.id }}</small
    >
    <small>&copy;Double Commit UTN-FRSR • {{ new Date().getFullYear() }}</small>
  </footer>
</template>

<style lang="css" scoped>
footer {
  display: grid;
  width: 100%;
  justify-content: center;
  padding-top: 60px;
  z-index: 99;
}
small {
  font-weight: 700;
}
.visits {
  display: flex;
  justify-content: center;
  padding: 8px 16px;
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
  border: 1px solid var(--color-border);
  border-radius: 8px;
  margin: 24px auto;
  color: var(--color-heading);
  align-items: center;
  gap: 4px;
}
</style>
