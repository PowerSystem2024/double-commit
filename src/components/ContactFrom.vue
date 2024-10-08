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
  <script>
  export default {
    data() {
      return {
        form: {
          name: "",
          email: "",
          message: ""
        },
        errors: {}
      };
    },
    methods: {
      submitForm() {
        this.errors = {};
  
        // Validaciones básicas
        if (!this.form.name) {
          this.errors.name = "El nombre es requerido.";
        }
        if (!this.form.email) {
          this.errors.email = "El correo electrónico es requerido.";
        } else if (!this.validEmail(this.form.email)) {
          this.errors.email = "El correo electrónico no es válido.";
        }
        if (!this.form.message) {
          this.errors.message = "El mensaje es requerido.";
        }
  
        // Si no hay errores, puedes procesar el formulario (ej. enviarlo a un servidor)
        if (Object.keys(this.errors).length === 0) {
          alert("Formulario enviado con éxito!");
          // Aquí podrías enviar el formulario a una API
        }
      },
      validEmail(email) {
        const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
      }
    }
  };
  </script>
  
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