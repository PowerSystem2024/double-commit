<script setup lang="js">
import { AlignRight, X } from 'lucide-vue-next'
import { ref } from 'vue'

const items = ref([])
const navItems = [
  {
    name: 'Inicio',
    path: '/'
  },
  {
    name: 'Acerca',
    path: '/about'
  },
  {
    name: 'Contacto',
    path: '/contact'
  },
  {
    name: 'Proyectos',
    path: '#proyects'
  }
]
items.value = navItems

const isMenuOpen = ref(false)

const toggleMenu = () => {
  isMenuOpen.value = !isMenuOpen.value
}
</script>

<template>
  <nav>
    <div class="logo-container">
      <img
        alt="Logo Double Commit"
        class="logo"
        src="@/assets/double-commit-removebg.png"
        width="50"
        height="40"
      />
    </div>
    <button class="menu-btn" @click="toggleMenu">
      <AlignRight v-if="!isMenuOpen" class="menu-icon" />
      <X v-if="isMenuOpen" class="x-icon" />
    </button>

    <aside :class="{ open: isMenuOpen }">
      <li v-for="(item, index) in navItems" :key="index">
        <a class="link" :href="item.path">{{ item.name }}</a>
      </li>
      <footer v-if="isMenuOpen">
        <p>&copy;Double Commit - UTN-FRSR {{ new Date().getFullYear() }}</p>
      </footer>
    </aside>
  </nav>
</template>

<style scoped>
nav {
  position: fixed;
  display: flex;
  top: 0;
  left: 0;
  width: 100%;
  height: 60px;
  background-color: var(--color-nav);
  backdrop-filter: blur(8px);
  border-bottom: 1px solid var(--color-border);
  font-size: 12px;
  text-align: center;
  align-items: center;
  justify-content: space-between;
  padding: 0 1rem 0 0;
  z-index: 99;
}

.logo-container {
  display: flex;
  padding-left: 1rem;
}

.logo:hover {
  transform: scale(1.1);
  transition: transform 0.3s ease-in-out;
}

.logo-container span {
  background-color: var(--green-light);
  border: 1px solid var(--green);
  padding: 2px 6px;
  border-radius: 10px;
  font-weight: 700;
  font-size: 10px;
  color: var(--color-text);
}

aside {
  display: flex;
  margin-right: 2rem;
  gap: 12px;
}

aside li {
  list-style: none;
}

a {
  color: var(--color-text);
  text-decoration: none;
  font-size: 1rem;
  font-weight: 600;
  padding: 2px 8px 3px 8px;
}

a:hover {
  background-color: rgba(97, 97, 97, 0.5);
  border-radius: 8px;
  transition: 0.3s ease-in-out;
  color: #3285b9;
  text-shadow: 0 0 5px #3285b9;
}

.menu-btn {
  display: none;
  border: none;
  background-color: transparent;
  z-index: 99;
}

.menu-icon,
.x-icon {
  color: var(--color-text);
}

.x-icon {
  transform: rotate(-45deg);
  animation: spin 0.4s linear both;
  transition: transform 0.3s;
}

footer {
  padding-top: 25px;
}

@keyframes spin {
  to {
    transform: rotate(90deg);
  }
}

@media (max-width: 700px) {
  .menu-btn {
    display: flex;
  }

  aside {
    position: absolute;
    top: 0px;
    left: 0;
    width: 100%;
    height: 100dvh;
    place-content: center;
    background-color: rgba(28, 27, 27, 0.941);
    flex-direction: column;
    padding: 1rem;
    display: none;
  }

  aside.open {
    display: flex;
  }

  aside.open .link {
    font-size: 1.5rem;
    font-weight: 600;
  }

  aside.open footer p {
    font-size: 1rem;
    font-weight: 600;
    color: #3285b9;
  }

  aside li {
    margin-bottom: 1rem;
  }
}
</style>
