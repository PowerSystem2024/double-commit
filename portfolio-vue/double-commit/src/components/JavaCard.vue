<script lang="js" setup></script>

<template>
  <article>
    <div class="text-container">
      <h2>Proyecto Java en Construcción</h2>
      <p>
        Pronto podrán disfrutar del proyecto integrador final en Java para la facultad de la mano
        del grupo Double Commit de la Organización Power System 2024 UTN-FRSR.
      </p>
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
  transition: all 0.3s ease;
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
