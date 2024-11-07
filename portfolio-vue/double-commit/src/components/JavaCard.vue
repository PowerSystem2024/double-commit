<script lang="js" setup>
const targetDay = new Date('November 10, 2024 00:00:00').getTime()
const currentDay = Date.now()
const difference = targetDay - currentDay

setInterval(difference, 1000)
</script>

<template>
  <article v-if="difference > 0">
    <div class="text-container">
      <h2>Proyecto Java en Construcción</h2>
      <p>
        Pronto podrán ver el proyecto integrador final en Java para la facultad de la mano del grupo
        Double Commit de la Organización Power System 2024 UTN-FRSR.
      </p>
    </div>
    <div class="img-container">
      <div class="bg-left"></div>
      <img src="/rocket.png" alt="rocket image" />
    </div>
  </article>
  <article v-else>
    <div class="text-container">
      <h2>¡Proyecto Java Completado!</h2>
      <p>
        Hemos finalizado nuestro proyecto integrador en Java. Explora el código y la documentación
        en nuestro repositorio de GitHub.
      </p>
      <a
        href="https://github.com/DoubleCommit/Proyecto-Final-Java"
        target="_blank"
        class="btn-github"
        >Ver Proyecto <i class="fas fa-external-link-alt"></i
      ></a>
    </div>
    <div class="img-container">
      <div class="bg-left"></div>
      <img src="/rocket.png" alt="rocket image" />
    </div>
  </article>
</template>

<style lang="css" scoped>
article {
  position: relative;
  width: 90%;
  max-width: 872px;
  height: 500px;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  margin: 50px auto;
  border: 1px solid var(--color-border);
  border-radius: 20px;
  overflow: hidden;
  transition: all 0.8s ease;
  view-timeline-name: --javacard;
  view-timeline-axis: block;

  animation-timeline: --javacard;
  animation-name: vanish;

  animation-range: entry 50% cover 50%;
  animation-fill-mode: both;
}

@keyframes vanish {
  0% {
    opacity: 0.1;
    scale: 0.1;
    filter: contrast(115%);
  }
  1% {
    opacity: 0;
    scale: 0.6;
    filter: contrast(125%);
  }
}

.text-container {
  padding: 33px;
  width: 50%;
  max-width: 600px;
  display: flex;
  flex-direction: column;
  justify-content: start;
  z-index: 1;
  color: #ebf1e6;
}

h2 {
  font-size: 3.5rem;
  font-weight: 900;
  margin-bottom: 1rem;
}

p {
  font-weight: 600;
  font-size: 1.1rem;
}

.img-container {
  position: absolute;
  display: flex;
  width: 100%;
  height: 100%;
  z-index: 0;
  opacity: 0.7;
}

a {
  position: absolute;
  bottom: 33px;
  right: 33px;
  padding: 10px 20px;
  width: fit-content;
  margin-top: 1rem;
  border-radius: 10px;
  background-color: #232321;
  text-decoration: none;
  color: #ebf1e6;
}

a:hover {
  opacity: 0.8;
  transition: all 0.3s ease;
}

.bg-left {
  background-color: #232321;
  width: 30%;
  height: 100%;
}

img {
  object-fit: cover;
  width: 70%;
  height: 100%;
  flex-shrink: 0;
}

@media (max-width: 1024px) {
  article {
    height: auto;
    min-height: 400px;
  }

  .text-container {
    width: 60%;
    padding: 30px;
  }

  h2 {
    font-size: 2.8rem;
  }

  .bg-left {
    width: 60%;
  }

  img {
    width: 40%;
  }
}

@media (max-width: 768px) {
  article {
    flex-direction: column;
    height: auto;
  }

  .text-container {
    width: 100%;
    max-width: none;
    padding: 30px;
  }

  h2 {
    font-size: 2.2rem;
  }

  p {
    font-size: 1rem;
  }

  .img-container {
    height: 100%;
  }

  .bg-left {
    display: none;
  }

  img {
    width: 100%;
    height: 100%;
  }
}

@media (max-width: 480px) {
  article {
    width: 95%;
    margin: 30px auto;
  }

  .text-container {
    padding: 20px;
  }

  h2 {
    font-size: 1.8rem;
  }

  p {
    font-size: 0.9rem;
  }

  .img-container {
    height: 100%;
  }
}
</style>
