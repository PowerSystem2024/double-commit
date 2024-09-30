"""
Ejercico 5: Factorial de un número positivo
Hacer un programa para determinar el factorial 
de un número positivo
"""

print("\n|---------|")
print("|FACTORIAL|")
print("|---------|\n")
num = int(input("Ingrese un número positivo para determinar su factorial: "))


def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n - 1)


if num < 0:
    print(f"No se puede calcular el factorial de un número negativo: {num}")
else:
    print(f"El factorial de {num} es {factorial(num)}")
