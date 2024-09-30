"""
Ejercicio 3: Insertar elementos y ordenarlos
Pedir números y meterlos en una lista, cuando el usuario
introduzca un número 0, nuestro programa dejaría de insertar.
Por último mostrar los números ordenados de menor a mayor
"""

lista = []
salir = False
while not salir:
    num = int(input("Ingrese un número: "))
    if num == 0:
        salir = True
    else:
        lista.append(num)
lista.sort()
print(f"\nLista ordenada: \n{lista}")
