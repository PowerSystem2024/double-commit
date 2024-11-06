from DsipositivoEntrada import DispositivoEntrada


class Teclado(DispositivoEntrada):
    contador_teclado = 0

    def __init__(self, marca, tipo_entrada):
        super().__init__(marca, tipo_entrada)
        Teclado.contador_teclado += 1
        self._id_teclado = Teclado.contador_teclado

    @property
    def marca(self) -> str:
        return self._marca

    @marca.setter
    def marca(self, marca) -> str:
        self._marca = marca

    @property
    def tipo_entrada(self) -> str:
        return self._tipo_entrada

    @tipo_entrada.setter
    def tipo_entrada(self, tipo_entrada) -> str:
        self._tipo_entrada = tipo_entrada

    def __str__(self) -> str:
        return f"Id: {self._id_teclado}, Marca: {self._marca}, Tipo de Entrada: {self._tipo_entrada}"


if __name__ == "__main__":
    teclado1 = Teclado("Genius", "USB")
    print(teclado1)
    teclado2 = Teclado("HP", "Bluetooth")
    print(teclado2)
