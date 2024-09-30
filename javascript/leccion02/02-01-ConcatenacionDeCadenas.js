var nombre = "Pedro";
var apellido = " Montes";
var nombreCompleto = nombre + " " + apellido; // Primera concatenación
console.log(nombreCompleto);

var nombreCompleto2 = "Diego" + " " + "De la Vega"; // Segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219;
console.log(juntos);
juntos = nombre + 78 + 17; // Aquí se puede diferenciar a través de los paréntisis
console.log(juntos);
juntos = 78 + 17 + nombre; // Primero se resuleve de izquierda a derecha (Va a sumar primero y después concatenar)
console.log(juntos);

nombre += apellido; // Operador simplificado
console.log(nombre);

// Let y const
let nombre2 = "Pedro";
console.log(nombre2);
// Una constante no puede ser modificada
const apellido2 = "Picapiedras";
console.log(nombre2, apellido2);

let x, y; // Se pueden crear varias variables dentro de una misma línea
(x = 17), (y = 21); // Se puede hacer asignación de varias variables dentro de la misma línea
let z = x + y;
console.log(z);

let _1num = 31; // No utilizar números para inicializar el nombre de una variable
let romper = "break"; // No usar palabras reservadas


