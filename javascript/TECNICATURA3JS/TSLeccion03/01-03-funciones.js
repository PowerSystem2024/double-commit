miFunc(3, 6); // Esto se lo conoce como hosting

function miFunc(a, b) {
  return a + b;
}

let resultado = miFunc(3, 9);
console.log(`El resultado es ${resultado}`);

// Funciones de tipo expresión o función anónima
let x = function (a, b) {
  return a + b;
};
const resultado_2 = x(33, 5);
console.log(resultado);

// Funciones de tipo self invoking
(function (a, b) {
  console.log("Ejecutando función de autoinvocado: " + a + b);
})(9, 6);

console.log(typeof miFunc);
function miFunc_2(a, b) {
  console.log(arguments.length);
}

miFunc_2(2, 7, 9, 14, 4);

// toString
const miFuncionTexto = miFunc_2.toString();
console.log(miFuncionTexto);

// Funciones Flecha
const miFunc_3 = (a, b) => a + b;
resultado = miFunc_3(5, 5); // Asigamos valor a una variable

console.log(resultado);

// Función de tipo expresión
let sumar = function (a = 4, b = 8) {
  console.log(arguments[0]); // Muestra el parámetro de a:
  console.log(arguments[1]); // Muestra el parámetro de b:
  return a + b + arguments[2];
};
resultado = sumar(3, 5, 9);
console.log(resultado);

let respuesta = sumarTodo(5, 6, 8, 9, 12);
console.log(respuesta);
function sumarTodo() {
  let suma = 0;
  for (let i = 0; i < arguments.length; i++) {
    suma += arguments[i];
  }
  return suma;
}

// Tipos primitivos
let z = 10;
function cambiarValor(a) { // Paso por valor
  a = 20;
}

cambiarValor(z); // La variable no sufre un cambio la variable k
console.log(z);

// Paso por referencia
const persona = {
  nombre: "Juan Carlos",
  apellido: "Calabró"
}

console.log(persona)
function cambiarValorObjeto(p1) {
  p1.nombre = "Guillermo"
  p1.apellido = "Coppola"
}

cambiarValorObjeto(persona);
console.log(persona)