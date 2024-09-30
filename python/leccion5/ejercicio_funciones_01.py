"""
Ejercicio 1: Crear una función para sumar los valores recibidos
de tipo numéricos, utilizando argumentos variables *args como parámetro
de la funcióny agregar como resultado la suma de todos los valores pasados
como argumentos
"""


def sumar_valores(*args):
    resultado = 0
    for arg in args:
        resultado += arg
    return resultado


valores = sumar_valores(1, 33, 66, 44, 77, 99, 123)
print(f"El resultado de todos los valores registrados es: {valores}")
