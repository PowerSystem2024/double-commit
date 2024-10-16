"""
Ejercicio 2: Función con * args para multiplicar
Crear una función para multiplicar los valores recibidos
de tipo numérico, utilizando argumentos variables *args
como parámetros de la función y resgresar como resultado
la multiplicación de todos los valores
"""


def multiplicar(*args) -> int:
    resultado = 1
    for arg in args:
        resultado *= arg
    return resultado


valores = multiplicar(2, 4, 6)
print(f"El resultado de la multiplicación de todos los valores es {valores}")
