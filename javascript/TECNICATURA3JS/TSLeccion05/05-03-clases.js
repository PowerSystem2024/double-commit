class Persona {
  static contadorPersonas = 0; // Atributo estático
  // Atributo no estático
  //email = "Valor default email";
  static get MAX_OBJ() {
    // Este método simula una constante
    return 5;
  }
  // clase padre (Object)
  constructor(nombre, apellido, edad) {
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
    Persona.contadorPersonas < Persona.MAX_OBJ
      ? (this.idPersona = ++Persona.contadorPersonas)
      : console.log("Se ha superado el máximo de objetos persona");
    // Persona.contadorObjetosPersona++;
    // console.log(
    //   `Se implementa el contador : ${Persona.contadorObjetosPersona}`
    // );
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
    return this.idPersona + " " + this._nombre + " " + this._apellido;
  }

  toString() {
    // Se aplica el polimorfismo que significa: múltiples formas en tienpo de ejecución
    // El método que se ejecuta depende si es una referencia de tipo padre o hija
    return this.nombreCompleto();
  }

  static saludar() {
    console.log(`Hola desde el método static`);
  }

  static saludar2(persona) {
    console.log(persona.nombre + " " + persona.apellido);
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

Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado1);

console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas);
console.log(persona1.email);
console.log(empleado1.email);
// console.log(Persona.email) NO se puede acceder desde la clase porque no es estático
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona("Carla", "Bruni");
console.log(persona3.toString());
console.log(Persona.contadorPersonas);
console.log(Persona.MAX_OBJ);

// Persona.MAX_OBJ = 10; No se puede modificar ni alterar

let persona4 = new Persona("Bruno", "Díaz");
console.log(persona4.toString());

let persona5 = new Persona("Leonardo", "Da Vinci");
console.log(persona5.toString());
