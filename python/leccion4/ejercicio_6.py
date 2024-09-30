"""
Ejercicio 6: Tabla de multiplicar.
Hacer un programa que pida un número por teclado y
guarde en una lista su tabla de multiplicar hasta el 10.
por ejemplo: si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50
"""

print("\n|--------------------|")
print("|TABLA DE MULTIPLICAR|")
print("|--------------------|\n")
num = int(input("Digite un número para dar la tabla de multiplicación de ese número: "))


def tabla(n):
    lista = []
    for i in range(1, 11):
        lista.append(i * n)
    for j in lista:
        print(j, end=",")


tabla(num)
