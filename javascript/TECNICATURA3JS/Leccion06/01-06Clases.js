//let persona3 = new Persona('Inti', 'Vallejos') #No se puede hacer hosting

class Persona {
  //Clase Padre
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
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
}

class Empleado extends Persona {
  //Clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }
  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = departamento;
  }
}

let persona1 = new Persona("Franco", "Morales");
console.log(persona1.nombre);
persona1.nombre = "Alma Marcela Gozo";
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona("Eva", "Vazquez");
console.log(persona2.nombre);
persona2.nombre = "Teniente Errada";
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado("Marta", "Cuba", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre);
