class Persona { // clase padre
  constructor(nombre, apellido, edad) {
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
  }

  get nombre() {
    return this._nombre;
  }
  get apellido() {
    return this._apellido;
  }
  /**
   * @param {string} nombre
   */
  set nombre(nombre) {
    this._nombre = nombre;
  }
  /**
   * @param {string} apellido
   */
  set apellido(apellido) {
    this._apellido = apellido;
  }
  /**
   * @param {number} edad
   */
  set edad(edad) {
    this._edad = edad;
  }
}
// Herencias de clases
class Empleado extends Persona { // clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido)
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    return (this._departamento = departamento);
  }
}

let persona1 = new Persona("Martín", "Demichelis", 45); // llamado al constructor
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = "Juan Carlo";
console.log(persona1._nombre);
let persona2 = new Persona("Carlos", "Agustin", 30);
console.log(persona2);
persona2.nombre = "Maria Laura";
console.log(persona2.nombre);
console.log(persona1.apellido);
persona2.edad = 38;
console.log(persona2._edad);

let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas")
console.log(empleado1.nombre)