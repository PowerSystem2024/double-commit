class Persona {
  // clase padre (Object)
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

  nombreCompleto() {
    return this._nombre + " " + this._apellido;
  }

  toString() {
    // Se aplica el polimorfismo que significa: múltiples formas en tienpo de ejecución
    // El método que se ejecuta depende si es una referencia de tipo padre o hija
    return this.nombreCompleto();
  }
}
// Herencias de clases
class Empleado extends Persona {
  // clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    return (this._departamento = departamento);
  }

  // Sobreescritura del método de la clase padre
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this.departamento;
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

let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1.nombre);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString; Esta es la manera de acceder a los atributos y métodos de manera dinámica
console.log(empleado1.toString()); // Polimorfismo
console.log(persona1.toString());
