"""
Ejercicio 2: Modificar los elementos de una lista
Llenar la lista con los número del 1 al 10, luego modificar los elementos
de la lista multiplicándolos por un valor ingresado por el usuario
"""

lista = list(range(1, 11))
for i in lista:
    print(i, end="-")
num = int(input("\nIngrese un número a multiplicar: "))
for indice, i in enumerate(lista):  # Función para modificar los índices de la lista
    lista[indice] *= num
print(f"Lista final con los elementos multiplicados por {num}")
for i in lista:
    print(i, end="-")
