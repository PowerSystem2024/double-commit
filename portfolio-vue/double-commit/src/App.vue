<script setup>
import AboutComponent from './components/AboutComponent.vue'
import FooterComponent from './components/FooterComponent.vue'
import HeroComponent from './components/HeroComponent.vue'
import NavComponent from './components/NavComponent.vue'
import ProjectsComponent from './components/ProjectsComponent.vue'
import SectionTitle from './components/SectionTitle.vue'
import RemainTime from './components/RemainTime.vue'
import CommentsForm from './components/CommentsForm.vue'
import MarqueeComponent from './components/MarqueeComponent.vue'
import JavaCard from './components/JavaCard.vue'
</script>

<template>
  <div class="bg-effect-0"></div>
  <div class="bg-effect-1"></div>
  <div class="bg-effect-2"></div>
  <NavComponent />
  <HeroComponent />
  <span id="about"></span>
  <SectionTitle children="Acerca" />
  <AboutComponent />
  <span id="projects"></span>
  <SectionTitle children="Proyectos" />
  <ProjectsComponent />
  <SectionTitle children="Tiempo Entrega Proyecto ☕ Java" />
  <RemainTime />
  <JavaCard />
  <span id="contact"></span>
  <SectionTitle children="Comentarios" />
  <CommentsForm />
  <MarqueeComponent />
  <FooterComponent />
</template>

<style scoped>
#app {
  width: 100%;
}
.development {
  width: fit-content;
  display: flex;
  justify-content: center;
  margin: 0 auto;
  padding: 8px 16px;
  border: 1px solid var(--color-border);
  border-radius: 20px;
}
</style>
