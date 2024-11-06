class Orden:
    contador_orden = 0

    def __init__(self, computadoras) -> None:
        Orden.contador_orden += 1
        self._id_orden = Orden.contador_orden
        self._computadoras = computadoras

    def agregar_computadora(self, computadoras):
        self._computadoras.append(computadoras)

    def __str__(self) -> str:
        computadoras_str = ""
        for computadora in self._computadoras:
            computadoras_str += computadora.__str__()
        return f"""
        Orden: {self._id_orden}
        Computadoras: {computadoras_str}
        """
