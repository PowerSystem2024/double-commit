class FiguraGeometrica:
    def __init__(self, ancho, alto):
        self._alto = alto
        self._ancho = ancho

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def set_alto(self, alto):
        self._alto = alto

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def set_ancho(self, ancho):
        self._ancho = ancho

    def __str__(self) -> str:
        return f"Figura Geométrica: [Ancho {self._ancho}, Alto: {self._alto}]"
