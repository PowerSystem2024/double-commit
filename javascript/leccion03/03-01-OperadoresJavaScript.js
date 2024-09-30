// Ejercicio número 1 (Buscar números pares o impares)
var num1 = 3;
var num2 = 6;
var num3 = 9;

function parImpar(num) {
  if (num % 2 === 0) {
    console.log(`El número (${num}) es Par.`);
  } else {
    console.log(`El número (${num}) es Impar.`);
  }
}

parImpar(num1);

// Ejercicio número 2 (Verificar si es mayor de edad)
var miEdad = 38;
const mayor = 18;

function mayorDeEdad(edad) {
  if (edad >= mayor) {
    console.log(`Usted tiene ${edad} años, es mayor de edad.`);
  } else {
    console.log(`Usted tiene ${edad} años, no es mayor de edad.`);
  }
}

mayorDeEdad(miEdad);

// Ejercicio número 3 (Dentro de un rango)
let dentroDeRango = 5;
let valMin = 0,
  valMax = 10;

function verificarRango(rango) {
  if (dentroDeRango >= valMin && dentroDeRango <= valMax) {
    console.log(`El valor ${rango} está dentro del rango.`);
  } else {
    console.log(`El valor ${rango} no está dentro del rango`);
  }
}

verificarRango(dentroDeRango);

// Ejercicio número 4 (Ver si el padre puede asistir a un evento del hijo)

const diaLibre = false;
const vacaciones = true;

function verificarSiPuedeAsistir() {
  if (diaLibre || vacaciones) {
    console.log("El padre puede asistir al evento de su hijo.");
  } else {
    console.log("El padre No puede asistir al evento de su hijo.");
  }
}

verificarSiPuedeAsistir();

// Ejercicio númer 5: Operador ternario (Par / Impar)
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const grupo = {
  Par: [],
  Impar: [],
};

numeros.forEach((num) => {
  let key;
  num % 2 === 0 ? (key = "Par") : (key = "Impar");
  grupo[key].push(num);
});

console.log(grupo);

// Ejercicio número 6: Es mayor de edad (Convertir a Sring)
let edad = "38",
  mayorEdad = "18";
console.log(typeof edad);

let edad2 = Number(edad);
let mayorEdad2 = Number(mayorEdad);

console.log(typeof edad2);

function verificamosEdad(edad2) {
  if (edad2 >= mayorEdad2) {
    console.log(`Tiene ${edad2} años, puede votar.`);
  } else {
    console.log(`Tiene ${edad2} años, no puede votar.`);
  }
}
verificamosEdad(edad2);

// Ejercicio número 7: Función isNaN (Is not a number)
function noEsUnNumero() {
  if (isNaN(edad2)) {
    console.log("Esta variable no solo contiene números");
  }
}
noEsUnNumero();
