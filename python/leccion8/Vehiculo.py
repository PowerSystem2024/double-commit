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
