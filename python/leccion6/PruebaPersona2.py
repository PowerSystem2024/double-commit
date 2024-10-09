from Persona2 import Person2

print("Creación de Objetos".center(50, "-"))
if __name__ == "__main__":
    persona5 = Person2(
        "Juan Manuel",
        "Calavera",
        78,
        "manuel.juan@yahoo.es",
        "Brazil",
        "Av. La Calle de los Muertos 369",
    )

    print(persona5.mostrar_detalle())

print("Elimincación de objetos".center(30, "-"))
del Person2
