# Lista original con duplicados
lista = [
    "Juan Pablo",
    "🎈",
    "Juan Pablo",
    "Gabriel",
    "Franco",
    "Maximiliano",
    "Maximiliano",
    "Agustín",
    "Elias",
    "🎈",
    38,
    28,
    38,
]

# Mostrar la lista con duplicados
print(f"Lista con integrantes repetidos: {lista}")
print(f"Cantidad de integrantes: {len(lista)}\n")

# Eliminar duplicados manteniendo el orden
lista_sin_duplicados = list(dict.fromkeys(lista))

# Mostrar la lista sin duplicados
print(f"Lista sin integrantes repetidos: {lista_sin_duplicados}")
print(f"Cantidad de integrantes sin duplicados: {len(lista_sin_duplicados)}")
