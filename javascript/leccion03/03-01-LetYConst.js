// Ampliando el uso de let var y const

/**
 * Con var puedes reasignar en cualquier momento,
 * éste forma parte del ámbito global.
 * Un error es que se sobreescriba.
 */

var nombre = "Gabriel";
nombre = "Ariel";
console.log(nombre);

function saludar() {
  var nombre = "Natalia";
  console.log(nombre);
}

console.log(nombre); // Aquí no lee el dato de la función

if (true) {
  var edad = 38;
  console.log(edad);
}

console.log(edad); // En la función funcionó correctamente, en la estructura if falló

/**
 * let: ésta puede ser readsignada en cualquier momento,
 * la diferencia que su ámbito es de bloque de
 * llaves o dentro de una función
 */

function saludar() {
  let nombre2 = "Gabriel";
  console.log(nombre2);
}
// console.log(nombre2);

if (true) {
  let edad2 = 33;
  console.log(edad2);
}

// console.log(edad2); Edad no está definida

/**
 * const: se utiliza para valores constantes que no pueden
 * ser reasignadas.
 */

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
// fechaNacimiento = 2003; No se puede reasiganr el valor
// console.log(fechaNacimiento);
