from abc import ABC, abstractmethod


# ABC: significa Abstract Base Class, convierte una clase a abstracta
class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f"El valor es erróneo para el ancho {ancho}.")
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f"El valor es erróneo para el alto {alto}.")

    @property
    def ancho(self):
        return self._ancho

    # Para que sea un atributo Read-Only se deberían eliminar los métodos setters
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f"Valor erróneo ancho {ancho}.")

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f"Valor erróneo alto {alto}.")

    @abstractmethod
    def calcular_area(self):
        pass

    def __str__(self) -> str:
        return f"Figura Geométrica: [Ancho {self._ancho}, Alto: {self._alto}]"

    def _validar_valores(self, valor):  # Método encapsulado
        return True if 0 < valor < 10 else False
