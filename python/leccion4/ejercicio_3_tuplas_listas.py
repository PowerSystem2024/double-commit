import math

# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
# Creamos una listaque solo incluya los números menores a 5
# e imprima por consola [1, 2, 3]

lista = []
for num in tupla:
    if num < 5:
        lista.append(num)
print(lista)

# Ejercicio clase 4
# Sacar la raíz cuadrada de un número positivo

num = int(input("Ingrese un número: "))

if num < 0:
    print(f"No es posible sacar la raíz cuadrada de un número negativo: {num}")
else:

    def sacar_raiz_cuadrada(n):
        raiz_cuadrada = math.sqrt(n)
        return raiz_cuadrada

    raiz_cuadrada = sacar_raiz_cuadrada(num)
    print(f"La raiz cuadrada de {num} es {raiz_cuadrada:.3f}")
