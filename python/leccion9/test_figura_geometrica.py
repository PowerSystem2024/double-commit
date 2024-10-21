from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, "azul")
print(cuadrado1._alto)
print(cuadrado1._ancho)
print(cuadrado1._color)
print(f"Cálculo del área {cuadrado1.calcular_area()}")

# Método MRO
print(Cuadrado.mro())

print(cuadrado1)

reactangulo = Rectangulo(3, 8, "Rojo")
print(f"Calculo del área del rectángulo: {reactangulo.calcular_area()}")
print(reactangulo)
