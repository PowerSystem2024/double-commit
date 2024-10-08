<script setup lang="js">

</script>



<template>
    <div class="contact-form">
      <h2>Formulario de Contacto</h2>
      <form @submit.prevent="submitForm">
        <!-- Campo de Nombre -->
        <div class="form-group">
          <label for="name">Nombre</label>
          <input
            type="text"
            id="name"
            v-model="form.name"
            :class="{'is-invalid': errors.name}"
            placeholder="Tu nombre"
          />
          <span v-if="errors.name" class="error">{{ errors.name }}</span>
        </div>
  
        <!-- Campo de Correo Electrónico -->
        <div class="form-group">
          <label for="email">Correo Electrónico</label>
          <input
            type="email"
            id="email"
            v-model="form.email"
            :class="{'is-invalid': errors.email}"
            placeholder="Tu correo electrónico"
          />
          <span v-if="errors.email" class="error">{{ errors.email }}</span>
        </div>
  
        <!-- Campo de Mensaje -->
        <div class="form-group">
          <label for="message">Mensaje</label>
          <textarea
            id="message"
            v-model="form.message"
            :class="{'is-invalid': errors.message}"
            placeholder="Tu mensaje"
          ></textarea>
          <span v-if="errors.message" class="error">{{ errors.message }}</span>
        </div>
  
        <!-- Botón de Enviar -->
        <button type="submit">Enviar</button>
      </form>
    </div>
  </template>

  
  <style scoped>
  .contact-form {
    max-width: 500px;
    margin: 0 auto;
  }
  
  .form-group {
    margin-bottom: 15px;
  }
  
  input, textarea {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }
  
  .is-invalid {
    border-color: red;
  }
  
  .error {
    color: red;
    font-size: 0.875rem;
  }
  
  button {
    padding: 10px 20px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  
  button:hover {
    background-color: #45a049;
  }
  </style>