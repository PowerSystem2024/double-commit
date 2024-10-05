class Aritmetica:
    """
    Vamos hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más
    """

    def __init__(self, a, b) -> None:
        self.a = a
        self.b = b

    # Método para sumar
    def sumar(self):
        return self.a + self.b

    # Método para restar
    def restar(self):
        return self.a - self.b

    # Método para dividir
    def dividir(self):
        return self.a / self.b

    # Método para multiplicar
    def multiplicar(self):
        return self.a * self.b


aritmetica1 = Aritmetica(7, 9)  # Le pasamos los argumentos para el operandos
print(f"La suma es {aritmetica1.sumar()}")
print(f"La resta es {aritmetica1.restar()}")
print(f"La división es {aritmetica1.dividir():.2f}")
print(f"La multiplicación es {aritmetica1.multiplicar()}")
