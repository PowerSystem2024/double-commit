<script setup lang="js"></script>

<template>
  <footer>
    <small>&copy;Power System/double-commit UTN-FRSR • {{ new Date().getFullYear() }}</small>
  </footer>
</template>

<style lang="css" scoped>
footer {
  display: flex;
  width: 100%;
  justify-content: center;
  padding-top: 60px;
  z-index: 99;
}
small {
  font-weight: 700;
}
</style>
