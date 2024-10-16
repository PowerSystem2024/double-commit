class Persona:
    def __init__(self, nombre, edad) -> None:
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self) -> str:  # Override / Sobreescribir
        return f"Persona: [ Nombre: {self._nombre}, Edad: {self._edad} ]"


class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo) -> None:
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self) -> str:
        return f"Empleado: [ Sueldo: {self._sueldo} {super().__str__()}]"


empleado1 = Empleado("Gabriel", 38, 7500)
print(empleado1._nombre)
print(empleado1._edad)
print(empleado1.sueldo)
empleado1.edad = 40
empleado1.nombre = "Mario"
empleado1.sueldo = 369000
print(empleado1._nombre)
print(empleado1._edad)
print(empleado1.sueldo)
