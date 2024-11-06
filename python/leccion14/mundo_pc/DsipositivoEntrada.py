class DispositivoEntrada:
    def __init__(self, marca, tipo_entrada):
        self._marca = marca
        self._tipo_entrada = tipo_entrada

    @property
    def marca(self) -> str:
        return self._marca

    @marca.setter
    def marca(self, marca) -> str:
        self._marca = marca

    def __str__(self) -> str:
        return f"Dispositivo de Entrada: {self._marca}, Tipo: {self._tipo_entrada}"
