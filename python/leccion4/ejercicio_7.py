"""
Ejercicio 7: Adivinar un número
Realizar un juego para adivinar un número. Para ello
se debe generar un número aleatorio entre 1 - 100, y luego ir pidiendo
números indicando "es mayor" o "es menor" según sea menor o mayor
con respecto a N. El proceso termina cuando el usuario acierta
y allí se debe el número de intentos 
"""

import random

numero_secreto = random.randint(1, 100)

intentos = 0

print("\n|-------------------------------------------------|")
print("|Adivina el número que tengo para ti del 1 al 100.|")
print("|-------------------------------------------------|\n")
while True:
    intentos += 1

    num = int(input("Ingresa un número: "))

    if num < numero_secreto:
        print("Es mayor.")
    elif num > numero_secreto:
        print("Es menor.")
    else:
        print(
            f"\n¡Felicitaciones! Adivinaste el número es {numero_secreto} en {intentos} intentos.\n"
        )
        break
