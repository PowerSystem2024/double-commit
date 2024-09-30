"""
Ejercicio 10: No repetir caracteres
Hacer un programa que pida una cadena por teclado, luego meter
los caracteres en un lista sin repetir caracteres
"""

lista = []
cadena = input("Ingrese una cadena de texto: ")
for i in cadena:
    if i not in lista:
        lista.append(i)
print(lista)
