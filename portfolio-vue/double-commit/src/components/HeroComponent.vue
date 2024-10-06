<script lang="js" setup></script>

<template>
  <header>
    <h1>Bienvenidos al portafolio<span>Double-Commit</span></h1>
  </header>
</template>

<style lang="css" scoped>
header {
  max-width: 800px;
  display: flex;
  justify-content: center;
  margin: 0 auto;
}
h1 {
  color: var(--color-heading);
  font-size: 4rem;
  text-align: center;
  font-weight: 700;
  text-wrap: pretty;
}
span {
  font-size: 4rem;
  font-weight: 700;
  color: #0099ff;
  margin-left: 4px;
}

@media (width <= 700px) {
  h1,
  span {
    font-size: 2.5rem;
  }
}
</style>
