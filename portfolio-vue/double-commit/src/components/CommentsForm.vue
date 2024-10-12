<script lang="js" setup>
import { ref, computed, onMounted } from 'vue'
import { z } from 'zod'
import { Model } from './ActionClass.vue'
import CommentsComponent from './CommentsComponent.vue'
import { getLocation } from './CurrentPosition.vue'
import { resize } from './constants.vue'

// Hooks de vue.js
const dataForm = ref({
  ip: '',
  name: '',
  email: '',
  message: '',
  city: '',
  country: ''
})
const isSubmiting = ref(false)
const showDialog = ref(false)
const dialogMessage = ref('')
const errors = ref({})
const comments = ref([])

/**
 * Validación con zod, documentación: https://zod.dev/?id=introduction
 */
const formSchema = z.object({
  email: z.string().email({ message: 'Email no válido' }).trim(),
  message: z
    .string()
    .min(10, { message: 'El mesaje debe tener al menos 10 caracteres' })
    .max(160, { message: 'El mensaje no debe superar los 160 caracteres' })
})

const isFormValid = computed(() => {
  try {
    formSchema.parse(dataForm.value)
    return true
  } catch (error) {
    return false
  }
})

const validateField = (field) => {
  try {
    formSchema.pick({ [field]: true }).parse(dataForm.value)
    errors.value[field] = ''
  } catch (error) {
    if (error instanceof z.ZodError) {
      errors.value[field] = error.errors[0].message
    }
  }
}

const refreshComments = async () => {
  comments.value = await Model.getComment()
}
// Envío del formulario a la BD
const sendForm = async (e) => {
  e.preventDefault()
  isSubmiting.value = true
  dataForm.value.ip = await getLocation.ip()
  dataForm.value.city = await getLocation.city()
  dataForm.value.country = await getLocation.country()
  await Model.sendComment(formSchema, dataForm.value, errors.value)
  showDialog.value = true
  dialogMessage.value = `Muchas gracias por tu comentario ${dataForm.value.name}!`
  dataForm.value = { name: '', email: '', message: '' }
  await refreshComments()
  isSubmiting.value = false
}

const closeDialog = () => {
  showDialog.value = false
}

onMounted(refreshComments)
</script>

<template>
  <form @submit="sendForm">
    <p
      class="container-about"
      style="
        text-align: center;
        color: var(--color-heading);
        margin: 16px auto;
        text-shadow: 1px 2px 3px #222;
        font-weight: 600;
      "
    >
      Dejame un comentario si te ha gustado el portfolio! 😃
    </p>
    <input
      type="text"
      v-model="dataForm.name"
      @blur="validateField('name')"
      placeholder="Ingresa tu nombre"
    />
    <span v-if="errors.name" class="error">{{ errors.name }}</span>
    <input
      type="email"
      v-model="dataForm.email"
      @blur="validateField('email')"
      placeholder="Ingresa tu email"
    />
    <span v-if="errors.email" class="error">{{ errors.email }}</span>
    <textarea
      id="textarea"
      v-model="dataForm.message"
      @blur="validateField('message')"
      placeholder="Escribí tu mensaje aquí"
      @input="resize"
      maxlength="160"
    ></textarea>
    <span v-if="errors.message" class="error">{{ errors.message }}</span>

    <button type="submit" :disabled="!isFormValid">
      {{ isSubmiting ? 'Enviando..' : 'Enviar' }}
    </button>
  </form>

  <dialog :open="showDialog">
    <p>{{ dialogMessage }}</p>
    <button @click="closeDialog">Cerrar</button>
  </dialog>

  <div v-if="comments.length === 0"></div>
  <section v-else>
    <div v-if="comments.length > 1">
      <h3>Comentarios recientes:</h3>
      <CommentsComponent :data-comments="comments" />
    </div>
    <div v-else>
      <h3>Comentario reciente:</h3>
      <CommentsComponent :data-comments="comments" />
    </div>
  </section>
</template>

<style lang="css" scoped>
form {
  max-width: 400px;
  display: grid;
  justify-content: center;
  margin: 120px auto;
  gap: 12px;
}

input,
textarea {
  padding: 10px 18px;
  background-color: transparent;
  border: none;
  border-radius: 8px;
  border: 1px solid var(--color-border);
  color: var(--color-heading);
}

textarea {
  resize: none;
  overflow-y: hidden;
}

input:focus,
textarea:focus {
  outline: 1px solid var(--second-color-text);
}

form button {
  border: none;
  padding: 8px 12px;
  border-radius: 8px;
  border: 1px solid var(--color-border);
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
  cursor: pointer;
  color: var(--color-heading);
  font-weight: 700;
  transition: transform 0.3s ease;
}

form button:hover {
  outline: 2px solid #0099ff9d;
  outline-offset: 2px;
  transition: all 76ms;
}

form button:active {
  transform: scale(0.98);
}

dialog {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  padding: 16px;
  border-radius: 10px;
  border: none;
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
  border: 1px solid var(--color-border);
  color: var(--color-heading);
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}

dialog button {
  padding: 8px 12px;
  display: flex;
  justify-content: center;
  margin: 16px auto 0;
  border-radius: 8px;
  border: 1px solid var(--color-border);
  background: linear-gradient(to bottom, #0099ff9d, #00ccffe1);
  color: var(--color-heading);
  cursor: pointer;
}

dialog button:hover {
  transform: scale(1.03);
}

dialog buton:active {
  transform: scale(0.98);
}

dialog[open] {
  animation: fadeIn 0.3s ease;

  @starting-style {
    scale: 0;
    translate: 0 200px;
  }
}

.error {
  color: tomato;
  font-size: 11px;
  margin-top: 4px;
}

form > div {
  display: flex;
  flex-direction: column;
}

button:disabled {
  opacity: 0.5;
  cursor: not-allowed;
}

@keyframes fadeIn {
  from {
    opacity: 0;
    transform: translate(-50%, -60%);
  }
  to {
    opacity: 1;
    transform: translate(-50%, -50%);
  }
}

h3 {
  text-align: center;
  font-size: 1.7rem;
  font-weight: 700;
  color: var(--color-heading);
  margin: 16px auto;
}
</style>
