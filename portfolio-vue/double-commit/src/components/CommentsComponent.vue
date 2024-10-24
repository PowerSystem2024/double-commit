<script lang="js" setup>
import { Trash } from 'lucide-vue-next'
import { Format } from './FormatClass.vue'
import { ref, onMounted } from 'vue'
import { Model } from './ActionClass.vue'

defineProps({
  dataComments: Array
})

const ip = ref([])
const previousIP = ref([])
const comments = ref([])

onMounted(async () => {
  ip.value = await Model.getVisits('ip', 1)
  previousIP.value = ip.value.map((v) => v.ip)
  comments.value = await Model.getComment()
})
</script>

<template>
  <article>
    <div
      v-for="(data, index) in dataComments"
      :key="data.id"
      id="comment"
      :style="index % 2 === 0 ? 'background-color: #0099ff9d' : 'background-color: #00ccffe1;'"
      :title="
        'Mensaje enviado el ' +
        Format.dateAndTime(data.created_at) +
        ' IP: ' +
        data.ip +
        '. Desde ' +
        data.city +
        ', ' +
        data.country +
        '.'
      "
    >
      <header style="position: relative">
        <section>
          <img
            src="https://imgs.search.brave.com/XSWOLj7fomf5bDAAvbA5sS25Tqjgnc1QKEhIyXT2P0Q/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90My5m/dGNkbi5uZXQvanBn/LzAzLzA4LzA2Lzc2/LzM2MF9GXzMwODA2/NzY5NV91ZUVSVXBJ/eURlSXhIeWFGaEs2/NzBVUFNrUnNzNXpu/cC5qcGc"
            width="45"
            height="45"
            style="border-radius: 50%"
            :alt="data.name"
          />
          <aside>
            <span class="name">{{ data.name }}</span>
            <small>{{ data.city }}, {{ data.country }}</small>
          </aside>
        </section>
        <span v-if="data.id === data.id">
          <Trash id="trash" width="16" height="16" @click="Model.delete(data.id)" />
        </span>
        {{}}
        <span class="date">{{ Format.date(data.created_at) }}</span>
      </header>
      <p class="message">{{ data.message }}</p>
    </div>
  </article>
</template>

<style scoped>
article {
  position: relative;
  max-width: 430px;
  display: grid;
  gap: 8px;
  margin: 0 auto;
  padding: 10px;
}

section {
  display: flex;
  gap: 8px;
  align-items: center;
}

#trash {
  position: absolute;
  top: -6px;
  right: 0;
  cursor: pointer;
}

div {
  display: flex;
  flex-direction: column;
  padding: 16px;
  border: 1px solid var(--color-border);
  border-radius: 10px;
}

header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 8px;
  align-items: center;
}

aside {
  display: flex;
  flex-direction: column;
}

.name {
  color: var(--color-heading);
  font-weight: 600;
}

.date {
  font-size: 0.8em;
  color: var(--color-heading);
}

.message {
  color: var(--color-heading);
  margin: 0;
}
</style>
