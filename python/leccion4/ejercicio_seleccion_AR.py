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