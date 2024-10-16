class Persona {
  static contadorPersonas = 0;

  constructor(nombre, apellido, edad) {
    this._idPersona = ++Persona.contadorPersonas;
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
  }

  get idPersona() {
    return this._idPersona;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get apellido() {
    return this._apellido;
  }

  set apellido(apellido) {
    this._apellido = apellido;
  }

  get edad() {
    return this._edad;
  }

  set edad(edad) {
    this._edad = edad;
  }

  toString() {
    return `Persona ${this._idPersona}: Nombre: ${this._nombre}, Apellido: ${this._apellido}, Edad: ${this._edad}`;
  }
}

class Empleado extends Persona {
  static contadorEmpleados = 0;

  constructor(nombre, apellido, edad, sueldo) {
    super(nombre, apellido, edad);
    this._idEmpleado = ++Empleado.contadorEmpleados;
    this._sueldo = sueldo;
  }

  get idEmpleado() {
    return this._idEmpleado;
  }

  get sueldo() {
    return this._sueldo;
  }

  set sueldo(sueldo) {
    this._sueldo = sueldo;
  }

  toString() {
    return `${super.toString()} Empleado ID: ${this._idEmpleado}, Sueldo: ${
      this._sueldo
    }`;
  }
}

class Cliente extends Persona {
  static contadorClientes = 0;

  constructor(nombre, apellido, edad, fechaRegistro) {
    super(nombre, apellido, edad);
    this._idCliente = ++Cliente.contadorClientes;
    this._fechaRegistro = fechaRegistro;
  }

  get idCliente() {
    return this._idCliente;
  }

  get fechaRegistro() {
    return this._fechaRegistro;
  }

  set fechaRegistro(fecha) {
    this._fechaRegistro = fecha;
  }

  static formatearFecha(date) {
    const fecha = new Date(date).toLocaleDateString("es-Es", {
      year: "numeric",
      month: "long",
      day: "2-digit",
      hour: "2-digit",
      minute: "2-digit",
      second: "2-digit",
    });
    return fecha;
  }

  toString() {
    return `${super.toString()} Cliente ID: ${
      this._idCliente
    }, Fecha de Registro: ${this._fechaRegistro}`;
  }
}

const persona1 = new Persona("Gabriel", "Calcagni", 38);
console.log(persona1.toString());
const persona2 = new Persona("Carlos", "Meza", 69);
console.log(persona2.toString());
const empleado = new Empleado("Agustín", "Calcagni", 30, 369000);
console.log(empleado.toString());
const cliente = new Cliente("Juan Carlos", "Meza", 69, new Date());
console.log(cliente.toString());
const cliente1 = new Cliente("Norma", "Leandro", 123, new Date());
console.log(cliente1.toString());
