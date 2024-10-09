//let persona3 = new Persona('Inti', 'Vallejos') #No se puede hacer hosting

class Persona {
  //Clase Padre

  static contadorObjetosPersona = 0; //Atributo estatico
  //email = 'Valor default email'; //Atributo no estatico

  static get MAX_OBJ() {
    //Este metodo simula una constante
    return 5;
  }

  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    if(Persona.contadorPersonas < Persona.MAX_OBJ){
        this.idPersona = ++Persona.contadorPersonas;
    }
    //Persona.contadorObjetosPersona++;
    //console.log("Se incrementa el contador: " + Persona.contadorObjetosPersona);
  }
  else{
    console.log('Se ha superado el máximo de objetos permítidos');
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
    return this.idPersona + " " + this._nombre + " " + this._apellido;
  }

  static saludar() {
    console.log("Saludos desde este método estatic");
  }

  static saludar2(persona){
    console.log(persona.nombre + " " + persona.apellido);
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

//persona1.saludar(); no se utiliza desde el objeto, pero si de la clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

///console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); //No se puede acceder desde la clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorObjetosPersona);
let persona4 = new Persona("Manolo", "Garea");
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ =10;//No se puede modificar, ni alterar
console.log(Persona.MAX_OBJ);

let persona5 = new Persona('Franco', 'Diaz')
console.log(persona4.toString());
let persona6 = new Persona('Liliana', 'Paz');
console.log(persona5.toString());