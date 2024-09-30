let contador = 0;

while (contador < 3) {
    console.log(contador)
    contador++
}
console.log("Fin del ciclo while");

// do while
let conteo = 0;
do {
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while");

// for
for (let count = 0; count < 7; count++) {
    console.log(count)
}
console.log("Fin ciclo for")

// Palabra reservada break
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 === 0) {
        console.log(contando);
        break;
    }
}
console.log("Termina el ciclo al encontrar los pares");

// La palabra continue y etiquetas labels
inicio:
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 !== 0) {
        continue inicio; // Ir a la siguiente iteración
    }
    console.log(contando)
}
console.log("Termina el ciclo al encontrar los pares");

