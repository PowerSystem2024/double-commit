// let autos = new Array("Ferrari", "Reanult", "BMW"); // Esta el la sintaxis vieja

const autos = ["Ferrari", "Reanult", "BMW"];

// Recorremos los elementos del arreglo
console.log(autos[0])
console.log(autos[1])

for (let i = 0; i < autos.length; i++) {
    console.log(i+ ":", autos[i])
}

for (const auto of autos) {
    console.log(auto)
}

// Modificamos los elementos de un arreglo
autos[0] = "Mercedes Benz"
console.log(autos)

autos.push("Porsche")
console.log(autos)

// Otras formas de agregar elementos al arreglo
autos[autos.length] = "Volvo"
console.log(autos)

// Tercera forma de agregar
autos[6] = "Ford"
console.log(autos)

// Preguntamos si es un arreglo
console.log(Array.isArray(autos))

// Segunda forma
console.log(autos instanceof Array) // Preguntamos si la variable es una instancia de un arreglo