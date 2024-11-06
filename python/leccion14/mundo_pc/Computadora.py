from Teclado import Teclado
from Raton import Raton
from Monitor import Monitor


class Computadora:
    contador_computadora = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadora += 1
        self._id_computadora = Computadora.contador_computadora
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    @property
    def nombre(self) -> str:
        return self._nombre

    @nombre.setter
    def nombre(self, nombre) -> str:
        self._nombre = nombre

    @property
    def monitor(self) -> str:
        return self._monitor

    @monitor.setter
    def monitor(self, monitor) -> str:
        self._monitor = monitor

    def __str__(self):
        return f"""
        {self._nombre}: {self._id_computadora}
        Monitor: {self._monitor}
        Teclado: {self._teclado}
        Ratón: {self._raton}
        """
