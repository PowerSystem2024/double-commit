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

  nombreCompleto() {
    return this._nombre + " " + this._apellido;
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

  //Sobreescritura
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento;
  }
  //Sobreescribiendo el metodo de la clase padre (Objet)
  //Se aplica el polimorfismo que significa = multiples formas en tiempos de ejecución
  //El metodo se ejecuta depende si es una referencia de tipo  padre o hijo
  toString() {
    //Regresa un String
    return this.nombreCompleto();
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
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manera de acceder a un metodo de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());