"""
Definir una clase padre llamada Vehiculo y dos clases hijas llamadas
Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo. La clase padre debe tener los siguientes atributos y métodos:
Vehiculo (clase padre)
-Atributos (color, ruedas)
-Métodos(____init__(color, ruedas) y ___str__())
Auto(clase hija de Vehiculo)
-Atributos(velocidad (km/hr))
-Métodos(__init__(color, ruedas, velocidad) y __str__())
Bicicleta (clase hija de Vehiculo)
-Atributos (tipo(urbana/montaña/etc.)
I
-Métodos(__init__(color, ruedas, tipo) y __str__()
Crear un objeto de cada clase
"""


class Vehiculo:
    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas

    def __str__(self) -> str:
        return f"Vehículo:[ Color: {self._color}, {str(self._ruedas)} ruedas ]"


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velocidad = velocidad

    def __str__(self) -> str:
        return f"{super().__str__()} Auto: [ Velocidad: {self._velocidad}km/h ]"


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo

    def __str__(self) -> str:
        return f"{super().__str__()} Bicicleta: [ {self._tipo} ]"
