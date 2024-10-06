<script lang="js" setup>
defineProps({
  children: String
})
</script>

<template>
  <h2>{{ children }}</h2>
</template>

<style scoped>
h2 {
  text-align: center;
  font-size: 2.5rem;
  font-weight: 700;
  color: var(--color-heading);
  margin-top: 200px;
}
</style>
