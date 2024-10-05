class Cubo:
    """
    Creamos la clase Cubo con los atributos: ancho, alto y profundidad.
    con un método calcular_volumen que tendrá la fórmula:
    volumen = ancho * altura * profundidad
    El usuario ingresa los valores
    """

    def __init__(self, ancho, altura, profundidad) -> int:
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad


print("Calcular el volumen del cubo")
ancho = int(input("Digite la ancho: "))
altura = int(input("Digite la altura: "))
profundidad = int(input("Digite la profundidad: "))

cubo = Cubo(ancho, altura, profundidad)
print(f"El volumen total del cubo es: {cubo.calcular_volumen()}")
