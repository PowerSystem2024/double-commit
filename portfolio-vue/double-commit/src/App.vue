<script setup>
import FooterComponent from './components/FooterComponent.vue'
import HeroComponent from './components/HeroComponent.vue'
import NavComponent from './components/NavComponent.vue'
</script>

<template>
  <div class="bg-effect-0"></div>
  <div class="bg-effect-1"></div>
  <div class="bg-effect-2"></div>
  <NavComponent />
  <HeroComponent />
  <FooterComponent />
</template>

<style scoped>
#app {
  width: 100%;
}
</style>
