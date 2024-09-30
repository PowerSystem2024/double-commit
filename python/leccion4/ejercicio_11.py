"""
Ejercicio 11: Agenda telefónica
Hacer un programa que simule una agenda de contactos. Crear
un diccionario donde la clave sea el nombre del usuario y el valor
sea el teléfono, el programa tendrá el siguiente menú de opciones:
1. Nuevo Contacto
2. Borrar Contacto
3. Ver Contactos Existentes
4. Salir
"""

contactos = {}
i = 0


# En StackOverflow hay muchos ejemplos de como crear un menú en python!
def menu():
    print("+" + "-" * 30 + "+")
    print("|" + " " * 11 + "AGENDA" + " " * 13 + "|")
    print("+" + "-" * 30 + "+")
    print("|  1. Nuevo Contacto           |")
    print("|  2. Borrar Contacto          |")
    print("|  3. Ver Contactos Existentes |")
    print("|  4. Salir                    |")
    print("+" + "-" * 30 + "+")


def agenda():
    global contactos, i  # Indica que vamos a modificar las variables globales dentro de la fucnión
    while True:
        menu()
        num = int(input("Seleccione un ítem del menú: "))
        if num == 1:
            usuario = input("Ingrese el nombre de usuario: ")
            telefono = input("Ingrese el número de teléfono: ")
            contactos[usuario] = telefono
            print(f"¡Contacto agregado con éxito!")
        elif num == 2:
            if not contactos:
                print("No hay contactos que borrar en la agenda.")
            else:
                usuario_a_borrar = input(
                    "Ingrese el nombre del usuario que quiere borrar: "
                )
                if usuario_a_borrar in contactos:
                    del contactos[usuario_a_borrar]
                    print(f"Contacto '{usuario_a_borrar}' borrado.")
                else:
                    print(f"No se encontró el contacto '{usuario_a_borrar}'.")
        elif num == 3:
            if not contactos:
                print("No hay contactos en la agenda.")
            else:
                print("Contactos existentes:")
                for nombre, telefono in contactos.items():
                    i += 1
                    print(f"{i}. Nombre: {nombre}, Teléfono: {telefono}")
        elif num == 4:
            print("Salió de la agenda.")
            break
        else:
            print("Opción no válida. Por favor, seleccione una opción del menú.")


agenda()
