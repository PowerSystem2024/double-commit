"""
Ejercicio 3: Funciones recursivas
Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
Puede ser cualquier valor positivo, por ejemplo si pasamos el valor de 5
debe imprimir: 5 4 3 2 1
En caso de ser 3: 3 2 1
Si se ingresan números negativos no imprime nada
"""

num = int(input("Ingrese un número: "))


def num_descente(n):
    if n >= 1:
        print(n)
        num_descente(n - 1)
    elif n == 0:
        return
    elif n <= 0:
        print("Valor incorrecto")


num_descente(num)
