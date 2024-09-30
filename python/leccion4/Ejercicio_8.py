"""
Ejercicio 8: Menú interactivo - Cajero automático
Hacer un programa que simule un cajero automático con un saldo
inicial de $1000 y tendrá el siguiente menú de opciones:
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Ver dinero disponible
4. Salir
"""

from colorama import init, Fore

init()

dinero_banco = 1000


def menu():
    print(f"\n{Fore.LIGHTYELLOW_EX}|---- Menú Cajero Automático ----|")
    print("|1. Ingresar dinero en la cuenta |")
    print("|2. Retirar dinero de la cuenta  |")
    print("|3. Ver dinero disponible\t |")
    print("|4. Salir\t\t\t |")
    print(f"|--------------------------------|{Fore.RESET}")


def cajero():
    global dinero_banco
    while True:
        menu()
        opcion = int(input(f"\n{Fore.BLUE}Selecciona una opción: {Fore.RESET}"))

        if opcion == 1:
            cantidad = float(input("\n¿Cuánto dinero deseas ingresar? $"))
            dinero_banco += cantidad
            print(
                f"\n{Fore.LIGHTGREEN_EX}Has ingresado ${cantidad}{Fore.WHITE}. Saldo actual: ${dinero_banco}"
            )

        elif opcion == 2:
            cantidad = float(input("\n¿Cuánto dinero deseas retirar? $"))
            if cantidad > dinero_banco:
                print(f"\n{Fore.RED}Saldo insuficiente.{Fore.WHITE}")
            else:
                dinero_banco -= cantidad
                print(
                    f"\nHas retirado {Fore.LIGHTYELLOW_EX}${cantidad}{Fore.WHITE} Saldo actual: {Fore.LIGHTYELLOW_EX}${dinero_banco}{Fore.RESET}\n"
                )

        elif opcion == 3:
            print(f"\nSaldo disponible: {Fore.BLUE}${dinero_banco}{Fore.RESET}")

        elif opcion == 4:
            print(
                f"\n{Fore.GREEN}Saliendo del cajero automático. ¡Gracias!{Fore.RESET}\n"
            )
            break

        else:
            print("\nOpción no válida. Por favor, elige una opción correcta.\n")


cajero()
