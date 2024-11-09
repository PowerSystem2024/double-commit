class Monitor:
    contador_monitor = 0

    def __init__(self, marca, tamaño) -> None:
        Monitor.contador_monitor += 1
        self._id_monitor = Monitor.contador_monitor
        self._marca = marca
        self._tamaño = tamaño

    @property
    def marca(self) -> str:
        return self._marca

    @marca.setter
    def marca(self, marca) -> str:
        self._marca = marca

    @property
    def tamaño(self) -> str:
        return self._tamaño

    @tamaño.setter
    def tamaño(self, tamaño) -> str:
        self._tamaño = tamaño

    def __str__(self) -> str:
        return f"Id: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}"


if __name__ == "__main__":
    monitor1 = Monitor("Benq", "17 pulgadas")
    print(monitor1)
