from Persona import *

persona1 = Persona("Batman", 78)

print(persona1)

empleado2 = Empleado("Mario", 88, 800000)
print(empleado2)


class Cliente(Persona):
    def __init__(self, nombre, edad) -> None:
        super().__init__(nombre, edad)
