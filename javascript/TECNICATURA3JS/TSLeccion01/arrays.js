// Dado el siguiente array
const lista = [13, 1, 8, 3, 2, 5, 8];
// Creamos una lista que solo incluya los números menores a 5
// e imprima por consola [1, 3, 2]

let listaMenoresA5 = [];

for (let n of lista) {
    if (n < 5) listaMenoresA5.push(n);
}

console.log(listaMenoresA5);