<script lang="js" setup>
import { Github } from 'lucide-vue-next'
import { projectsItems } from './constants.vue'
import { ArrowUpRight } from 'lucide-vue-next'
</script>

<template>
  <h1>Sección Proyectos</h1>
  <section>
    <div class="project" v-for="(project, index) in projectsItems" :key="index">
      <img :src="project.img" :alt="project.name" width="100%" height="auto" />
      <article>
        <h3>{{ project.name }}</h3>
        <p>{{ project.description }}</p>
        <div class="links">
          <a :href="project.link">Link <ArrowUpRight width="18" /></a>
          <a :href="project.code">Code <Github width="18" /></a>
        </div>
      </article>
    </div>
  </section>
</template>

<style lang="css" scoped>
h1 {
  text-align: center;
  font-size: 2.5rem;
  font-weight: 700;
  color: var(--color-heading);
  margin-top: 190px;
}

section {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(130px, 1fr));
  padding: 80px;
  justify-content: center;
  margin: 0 auto;
  gap: 8px;
}

.project {
  border: 1px solid var(--color-border);
  border-radius: 20px;
  overflow: hidden;
}

article {
  padding: 16px;
}

h3 {
  font-size: 1.5rem;
  font-weight: 600;
}

.links {
  display: flex;
  justify-content: space-between;
  margin-top: 12px;
}

a {
  display: flex;
  color: var(--color-heading);
  border: 1px solid var(--color-border);
  border-radius: 8px;
  padding: 4px 8px;
  align-items: center;
  gap: 4px;
  text-decoration: none;
}

a:hover {
  background-color: var(--color-border);
}

@media (width <= 700px) {
  section {
    padding: 10px;
  }
}
</style>
