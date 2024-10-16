"""
Ejercicio 5: Convertidor de temperaturas
Realizar dos funciones para convertir de grados celsius a fareheit
y viceversa
Investigar las fórmulas
"""


class Conversor:
    def celsius_to_farenheit(self):
        return (temp * 1.8) + 32

    def farenheit_to_celsius(self):
        return (temp - 32) / 1.8


def menu():
    print("\n+" + " -" * 5 + " Conversor de Temperatura " + "- " * 5 + "+")
    print("| 1. Convertir temperatura celsius a farenheit |")
    print("| 2. Convertir temperatura farenheit a celsius |")
    print("| 3. Salir" + "\t" * 4 + " " * 7 + "|")
    print("+----------------------------------------------+\n")


while True:
    menu()
    num = int(input("Digite una opción del menú: "))
    if num == 1:
        temp = float(
            input("Ingrese una temperatura para convertir de celsius a farenheit: ")
        )
        resultado = Conversor.celsius_to_farenheit(temp)
        print(f"\nLa temperatura {temp}°C es {resultado:.2f}°F")
    elif num == 2:
        temp = float(
            input("Ingrese una temperatura para convertir de farenheit a celsius: ")
        )
        resultado = Conversor.farenheit_to_celsius(temp)
        print(f"\nLa temperatura {temp}°F es {resultado:.2f}°C")
    elif num == 3:
        print("\nHa salido del conversor.")
        break
    else:
        print("\nOpción inválida, digite una opción válida")
