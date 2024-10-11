<script lang="js" setup>
import { ref } from 'vue'

const timer = ref({ days: '', hours: '', minutes: '', seconds: '' })

/**
 * Fuente Stack Overflow: https://es.stackoverflow.com/questions/332347/contador-regresivo-de-tiempo-entre-2-fechas-php
 */

const fechaObjetivo = new Date('November 2, 2024 00:00:00').getTime()

// Función para calcular la diferencia y actualizar el contador
function actualizarContador() {
  const ahora = new Date().getTime()
  const diferencia = fechaObjetivo - ahora

  // Cálculos de días, horas, minutos y segundos
  const dias = Math.floor(diferencia / (1000 * 60 * 60 * 24))
  const horas = Math.floor((diferencia % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60))
  const minutos = Math.floor((diferencia % (1000 * 60 * 60)) / (1000 * 60))
  const segundos = Math.floor((diferencia % (1000 * 60)) / 1000)

  // Asegurarse de que siempre haya dos dígitos usando padStart
  timer.value = {
    // Extraemos valores del hook de vue.js
    days: dias.toString().padStart(2, '0'),
    hours: horas.toString().padStart(2, '0'),
    minutes: minutos.toString().padStart(2, '0'),
    seconds: segundos.toString().padStart(2, '0')
  }

  // Detener el contador si se alcanza la fecha objetivo
  if (diferencia < 0) {
    clearInterval(intervalo)
  }
}

// Actualizar el contador cada segundo
const intervalo = setInterval(actualizarContador, 1000)
</script>

<template>
  <div class="contador">
    <div class="bloque">
      <span>{{ timer.days }}</span>
      <small>Días</small>
    </div>
    <div class="separador">:</div>
    <div class="bloque">
      <span>{{ timer.hours }}</span>
      <small>Horas</small>
    </div>
    <div class="separador">:</div>
    <div class="bloque">
      <span>{{ timer.minutes }}</span>
      <small>Minutos</small>
    </div>
    <div class="separador">:</div>
    <div class="bloque">
      <span>{{ timer.seconds }}</span>
      <small>Segundos</small>
    </div>
  </div>
</template>

<style lang="css" scoped>
.contador {
  display: flex;
  justify-content: center;
  margin: 100px auto;
  align-items: center;
  font-family: 'Arial', sans-serif;
  gap: 10px;
}

.bloque {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
  border-radius: 10px;
  border: 1px solid var(--color-border);
  padding: 10px;
  width: 60px;
}

.bloque span {
  font-size: 2rem;
  font-weight: bold;
  color: var(--color-heading);
}

.bloque small {
  font-size: 0.8rem;
  color: var(--color-heading);
}

.separador {
  font-size: 2rem;
  font-weight: bold;
  color: #fff;
}
</style>
