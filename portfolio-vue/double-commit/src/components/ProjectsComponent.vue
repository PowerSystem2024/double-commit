<script lang="js" setup>
import { Github } from 'lucide-vue-next'
import { projectsItems } from './constants.vue'
import { ArrowUpRight } from 'lucide-vue-next'
</script>

<template>
  <main>
    <section>
      <div class="project" v-for="(project, index) in projectsItems" :key="index">
        <img :src="project.img" :alt="project.name" width="100%" height="auto" />
        <article>
          <h3>{{ project.name }}</h3>
          <p>{{ project.description }}</p>
          <div class="links">
            <a :href="project.link" :title="`Ir al ${project.name}`"
              >Link <ArrowUpRight width="18"
            /></a>
            <a :href="project.code" :title="`Ir a ${project.code}`">Code <Github width="18" /></a>
          </div>
        </article>
      </div>
    </section>
  </main>
</template>

<style lang="css" scoped>
section {
  max-width: 872px;
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(130px, 1fr));
  justify-content: center;
  margin: 100px auto;
  gap: 16px;
}

.project {
  border-radius: 20px;
  overflow: hidden;
  padding: 0;
  margin: 0;
}

article {
  padding: 16px;
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
}

h3 {
  font-size: 1.5rem;
  font-weight: 600;
  color: var(--color-heading);
}

p {
  color: var(--color-heading);
}

.links {
  display: flex;
  justify-content: space-between;
  margin-top: 12px;
}

a {
  display: flex;
  color: var(--second-color-text);
  background: #ffffff;
  border-radius: 8px;
  padding: 4px 8px;
  align-items: center;
  gap: 4px;
  text-decoration: none;
  font-weight: 500;
  box-shadow: 0 0 1px #2f3a419d;
}

a:hover {
  transform: scale(1.1);
  transition: transform 0.3s ease;
  filter: drop-shadow(0 0 10px #2f3a419d);
}

@media (width <= 700px) {
  section {
    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
    max-width: 100%;
    padding: 40px;
  }
}
</style>
