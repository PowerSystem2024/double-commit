from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from FiguraGeometrica import FiguraGeometrica

print("Creación de objeto clase Cuadrado".center(50, "_"))
cuadrado1 = Cuadrado(8, "Azul")
cuadrado1.alto = 7
cuadrado1.ancho = 7
# print(cuadrado1.alto)
# print(cuadrado1.ancho)
# print(cuadrado1.color)
print(f"Cálculo del área del cuadrado: {cuadrado1.calcular_area()}")

# Método MRO (Method Resolution Order)
# print(Cuadrado.mro())

print(cuadrado1)
print("Creación objeto CLASE Rectángulo".center(50, "_"))
reactangulo = Rectangulo(3, 9, "Rojo")
reactangulo.ancho = 8
print(f"Cálculo del área del rectángulo: {reactangulo.calcular_area()}")
print(reactangulo)

# figura1 = FiguraGeometrica() # No se puede instanciar, es abstracta
print(Cuadrado.mro())
