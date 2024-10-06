<script setup lang="js"></script>

<template>
  <footer>
    <span>&copy;Double-Commit • {{ new Date().getFullYear() }}</span>
  </footer>
</template>

<style lang="css" scoped>
footer {
  display: flex;
  margin: 0 auto;
  justify-content: center;
  width: 100%;
  height: 200px;
  border-top: 1px solid var(--border);
}
</style>
