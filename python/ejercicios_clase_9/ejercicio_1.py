# Diseñar un programa que ingresado un año, mos devuelva por
# consola si es bisiesto o no.'''
print("Programa para determinar si el año es bisiesto.")


def ano_bisiesto(num):
    if (num % 4 == 0 and num % 100 != 0) or (num % 400 == 0):
        print(f"El año {num} es bisiesto.")
    else:
        print(f"El año {num} no es bisiesto.")

opcion = 1
while opcion == 1:
    num = int(input("Ingrese un año: "))
    ano_bisiesto(num)
    opcion = int(
        input(
            "Para seguir adelante digite la opción 1, para salir digite cualquier otro número: "
        )
    )
