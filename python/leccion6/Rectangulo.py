class Rectangulo:
    """
    Creamos una clase llamada rectángulo, debe tener 2 atributos: altura y base.
    el nombre del método será calcular área utilizando la fórmula:
    area = base * altura
    Pero la base y la altura deben ser ingresadas por el usuario
    """

    def __init__(self, base, altura) -> None:
        self.base = base
        self.altura = altura

    def calcular(self):
        return self.base * self.altura


base = int(input("Ingrese la base del rectángulo: "))
altura = int(input("Dgite el altura del rectángulo: "))

rectangulo = Rectangulo(base, altura)

print(f"El área del rectángulo es {rectangulo.calcular()}")
