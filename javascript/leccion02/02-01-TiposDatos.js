// Tipos de Datos en JavaScript
/*
La sintáxis en lo que es comentarios es
muy similar a la de Java
realmente diríamos que es idéntica
*/
var nombre = "Gabriel"; // Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log();
var numero = 3000; // Tipo Number
console.log(typeof numero);
nombre = 12.3;
console.log(typeof nombre);
var objeto = {
  nombre: "Manuel",
  apellido: "Calavera",
  telefono: "02656480445",
};

console.log(typeof objeto);

// Tipo de dato Boolean
var bandera = true;
console.log(bandera);

// Tipo de dato función
function miFuncion() {}
console.log(typeof miFuncion);

// Tipo de dato Symbol
var simbolo = Symbol("Mi símbolo");
console.log(typeof simbolo);

// Tipo de dato Clase
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
console.log(typeof Persona);

// Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de un valor
var y = null; // null no es un tipo de datos, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String
var autos = ["Citroen", "Audi", "BMW", "Ford"];
console.log(autos);
console.log(typeof autos); // Preguntamos que tipo de datos es:

var z = "";
console.log(z); // Empty string = (cadena vacía)
console.log(typeof z);

// Hoy ya no se usa var se trata de utilizar let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Picapiedras";
// apellido2 = "Meza"; Una constante no se puede modificar
console.log(apellido2);
