from colorama import init, Fore

init()

nombres = ["Juan Pablo", "Franco", "Maximiliano", "Elias", "Agustín", "Gabriel"]
# print(nombres[-3])

# print(nombres[0:2])  # Solo muestra el índice 0, 1 sin mostrar el 2
# Ir al índice de la lista (sin incluirlo)
# print(nombres[:3])  # Indices a mostrar 0, 1, 2
# Desde el índice indicado hasta el final
# print(nombres[1:])
# Modificamos un valor
nombres[0] = "El Beto Alonso"
nombres[4] = "Chikita López"

for nombre in nombres:
    if nombre == "Chikita López":
        print(f"{nombre} vs MANDINGO!! 🤣")
    else:
        print(f"{nombre}: alumno del Perla Negra")


print(len(nombres))  # Longitud de una lista

# Agregamos un elemento
nombres.append("Juan Carlo")
print(nombres)

# Insertar elemento en el indice indicado
nombres.insert(3, "El Freni")
nombres.insert(1, "Débora")
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append(7)
print(nombres)


# Eliminamos un elemento de la lista
nombres.remove("El Freni")
print(nombres)

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminar un índice específico

del nombres[1]
print(nombres)

# Limpiar la lista
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres)  # Esto nos dará error

# Tuplas (inmutables)
cocina = ("🥄", "🍴", "🔪")
print(cocina)
print(len(cocina))

# Acceder a un elemento
print(cocina[2])
# De manera inversa
print(cocina[-1])
# Acceder a un rango
print(cocina[:1])
# Una tupla siempre debe contener más de un elemento y se muestra entre paréntisis, ejemplo: la coma ,
verduras = ("🥔",)
# De lo contario sería un str

# Recorremos los elementos de una tupla
for el in cocina:
    print(el, end=" ")  # Evita la impresión en consola con salto de línea (\n)

# Para modificar una tupla se debe usar una conversión
cocina_lista = list(cocina)
cocina_lista[0] = "🍳"
cocina = tuple(cocina_lista)
print("\n", cocina)

# Eliminamos la tupla
# del cocina
# print(cocina)

# Tipo Set
planetas = {"Marte", "Júpiter", "Venus"}
print(len(planetas))

# Revisar si un elemente existe dentro de un set
print("Marte" not in planetas)

# Agregar a un set
planetas.add("Tierra")
print(planetas)

# Eliminar elementos
planetas.remove(
    "Júpiter"
)  # esta función alerta el error de tipeo o si no existe ele elemento
print(planetas)
planetas.discard("Tierra")  # Esta función no presenta error
print(planetas)

# Limpoar Set o Conjunto
planetas.clear()
print(planetas)

# Eliminar el set
del planetas

# 'Maradona': 10 Un diccionario esta compuesto por dos elementos
# Una Llave y un Valor
diccionario = {
    "IDE": "Itegrated Development Envirioment",
    "POO": "Programación Orientada a Objetos",
    "SABD": "Sistema de Administración de Base de Datos",
}

print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave key
print(diccionario.get("IDE"))
print(diccionario["IDE"])

# Modificamos los elementos
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como recorre los elementos

for termino in diccionario:  # Recorremos solo mostrando las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(f"{termino}: {valor}")

# Otra manera de recorrer a un diccionario
for termino in diccionario.keys():
    print(termino)

for termino in (
    diccionario.keys() and diccionario.values()
):  # Función para acceder al valor
    print(termino)

# Comprobar la exixstencia em algún elemento
print("IDE" in diccionario)  # devuelve booleano

# Agregar un elemento
diccionario["PK"] = "Primary Key"
print(diccionario)

# Eliminar elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eleminar diccionario
del diccionario

# Concatenar listas
lista_1 = [1, 2, 3, 1]
lista_2 = [4, 5, 6, 1]
lista_3 = lista_1 + lista_2
print(lista_3)

lista_3.extend([7, 8, 9, 1])  # Función para agregar varios elementos a una lista
print(lista_3)

print(lista_3.index(5))  # Función para ubicar el índice
# print(lista_3.index(0)) # Error por no ser el elemento parte de la lista

# Como saber cuantos valores hay repetidos en una lista
print(lista_3.count(1))

# Para poner al revés una lista
print(lista_3.reverse())

# Para que una lista se multiplique repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

lista_3 = lista_3 * 2
print(lista_3)

# Métodos de ordenamientos
lista_3.sort()  # Ascendente
print(lista_3)
lista_3.sort(reverse=True)  # Descendente
print(lista_3)

tupla = (4, "Hola", 6.78, [1, 2, 3], 4, "HOLA")
print(tupla)
# Lo que podemos usar en las listas son: index, count, len
# En tuplas podemos convertir de tupla a lista y de lista a tupla
print()
conjunto2 = set()
conjunto1 = {
    "bye",
}
conjunto2.add(7)
print(conjunto2)
conjunto1.add("Hola")
print(conjunto1)
conjunto1.add("hola")
print(3 not in conjunto1)

# Como hacer la igualdad en dos conjuntos
print(conjunto2 == conjunto1)  # Devuelve booleano

# Operaciones en conjuntos
conjunto3 = conjunto2 | conjunto1  # Une los dos conjuntos
print(conjunto3)

# Intersección
conjunto3 = conjunto2 & conjunto1  # Ver elementos en común
print(conjunto3)

conjunto3 = (
    conjunto1 - conjunto2
)  # Asigna el valor que está en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1  # Vemos el conjunto2
print(conjunto3)

conjunto3 = (
    conjunto1 ^ conjunto2
)  # Elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(
    conjunto1.issubset(conjunto3)
)  # Preguntamos si un conjunto es un subconjunto de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

# Como saber si un conjunto son disconexos
print(
    conjunto3.issuperset(conjunto1)
)  # Preguntamos si los elementos del conjunto1 estan dentro del 3
print(
    conjunto3.issuperset(conjunto2)
)  # Si es verdadero quiere decir que el conjunto3 es un super conjunto
print(conjunto1.issuperset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en común
print(conjunto1.isdisjoint(conjunto2))  # No hay cosas em común

# Convertir un conjunto en totalmente inmutable
conjunto1 = frozenset  # Esto hace que el conjunto sea totalmenete inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto

# Repaso Diccinarios
diccionario_nuevo = {
    "Azul": "Blue",
    "Rojo": "Red",
    "Verde": "Green",
    "Amarillo": "Yellow",
}

print(f"Cómo se dice azul en inglés? {diccionario_nuevo['Azul']}")

# Eliminar elemento
del diccionario_nuevo["Azul"]
print(diccionario_nuevo)

# Los diccionarios pueden almacenar diferentes tipós de datos
diccionario2 = {
    "Gabriel": {"Edad": 38, "Altura": 1.70},
    "Agustin": [30, 1.86],
    "Natalia": [35, 1.67],
}
print(diccionario2["Gabriel"]["Edad"])

seleccion_argentina = {
    1: {
        "Nombre": "Emiliano Martínez",
        "Edad": 31,
        "Altura": 1.95,
        "Precio": "28 Millones",
        "Posición": "Portero",
        "Número": 23,
    },
    2: {
        "Nombre": "Nahuel Molina",
        "Edad": 26,
        "Altura": 1.75,
        "Precio": "25 Millones",
        "Posición": "Lateral Derecho",
        "Número": 4,
    },
    3: {
        "Nombre": "Nicolás Otamendi",
        "Edad": 36,
        "Altura": 1.83,
        "Precio": "5 Millones",
        "Posición": "Defensa Central",
        "Número": 19,
    },
    4: {
        "Nombre": "Cristian Romero",
        "Edad": 26,
        "Altura": 1.85,
        "Precio": "60 Millones",
        "Posición": "Defensa Central",
        "Número": 13,
    },
    5: {
        "Nombre": "Nicolás Tagliafico",
        "Edad": 31,
        "Altura": 1.72,
        "Precio": "12 Millones",
        "Posición": "Lateral Izquierdo",
        "Número": 3,
    },
}

# Recorrer los elementos
for key, value in seleccion_argentina.items():
    print(key, value)

# Cantidad de juadores
print()
print(f"Tenemos cargado la cantindad de jugadores: {len(seleccion_argentina)}")

# Agregamos juagadores
seleccion_argentina[6] = {
    "Nombre": "Rodrigo De Paul",
    "Edad": 30,
    "Altura": 1.80,
    "Precio": "45 Millones",
    "Posición": "Centrocampista",
    "Número": 7,
}

seleccion_argentina[7] = {
    "Nombre": "Enzo Fernández",
    "Edad": 23,
    "Altura": 1.78,
    "Precio": "100 Millones",
    "Posición": "Centrocampista",
    "Número": 24,
}


print()
print(f"Ahora están llegando más jugadores a la cancha: {len(seleccion_argentina)}")
print("Vamos a agregar de varios jugadores ahora!")

nuevos_jugadores = [
    {
        "Nombre": "Alexis Mac Allister",
        "Edad": 25,
        "Altura": 1.74,
        "Precio": "70 Millones",
        "Posición": "Centrocampista Ofensivo",
        "Número": 20,
    },
    {
        "Nombre": "Ángel Di María",
        "Edad": 36,
        "Altura": 1.80,
        "Precio": "10 Millones",
        "Posición": "Extremo Derecho",
        "Número": 11,
    },
    {
        "Nombre": "Lionel Messi",
        "Edad": 37,
        "Altura": 1.70,
        "Precio": "50 Millones",
        "Posición": "Extremo Derecho",
        "Número": 10,
    },
    {
        "Nombre": "Julián Álvarez",
        "Edad": 24,
        "Altura": 1.70,
        "Precio": "90 Millones",
        "Posición": "Delantero Centro",
        "Número": 9,
    },
]

for jugador in nuevos_jugadores:
    seleccion_argentina[len(seleccion_argentina) + 1] = jugador

print(seleccion_argentina)
print(
    "--------------------------------------------------------------------------------------------------"
)
print(
    f"Bien ahora tenemos el equipo completo Macalla!!: Tenenmos a los {len(seleccion_argentina)} jugadores de nuestra selección."
)

# Método con listas llamado PILAS

pila = [1, 2, 3]

# Agregar elementos en la fila por el final
pila.append(4)
print(pila)

# Sacando elementos por el final
elemento_borrado = pila.pop()  # Quita el último elemento de la lista
print(f"Sacamos el último elemento de la pila: {elemento_borrado}")
print(f"La pila quedó así: {pila}")

pila_nuevas = [4, 5, 6, 7, 8, 9]

for n in pila_nuevas:
    pila.append(n)

print(pila)

# Colas con listas
# Estructura de datos FIFO(First input / First output)
cola = ["Juan Pablo", "Franco"]
print(f"Ingrentes del grupo: {cola}")
# Agregamos un compis
cola.append("Maximiliano")
print(f"Ahora el grupo quedó así: {cola}")
compis_nuevos = ["Elias", "Agustín", "Gabriel"]

for compis in compis_nuevos:
    cola.append(compis)

print(f"{Fore.GREEN}Integrantes del grupo Terreneitor: {Fore.LIGHTYELLOW_EX}{cola}")
soldado_caido = cola.pop(0)
print(f"Un soldado caído: {Fore.BLUE}{soldado_caido}{Fore.WHITE}")
print(f"{Fore.GREEN}Soldados firmes: {Fore.MAGENTA}{cola}")
