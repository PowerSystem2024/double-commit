"""
Ejercicio 1: Eliminar duplicados de una lista.
Crear un programa donde tenga una lista y que a continuación
elimine los elemnetos repetidos, por último mostrar la lista
"""

lista = [
    "Juan Pablo",
    "Gabriel",
    "Franco",
    "Maximiliano",
    "Agustín",
    "Elias",
    "Daniela",
    "Marina",
    "Cinthia",
    "Daniela",
    "Marina",
]

print(f"Integrantes: {lista}")
print(f"Cantidad de integrantes: {len(lista)}")


def eliminar_duplicados(lista):
    sin_duplicar = list(
        dict.fromkeys(lista)
    )  # Eliminación de duplicados manteniendo el orden de la lista
    return sin_duplicar


lista_sin_duplicados = eliminar_duplicados(lista)

print(f"Lista sin duplicados: {lista_sin_duplicados}")
print(f"Catidad de integrantes: {len(lista_sin_duplicados)}")
