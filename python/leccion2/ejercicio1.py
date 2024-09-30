# Ejercicio 1
# Plasmar la expresión A³ x (b² - 2bc) / 2
A = float(input("Ingrese un valor para A: "))
b = float(input("Ingrese un valor para b: "))
c = float(input("Ingrese un valor para c: "))

resultado = (A ** 3 * (b ** 2 - 2 * A * c)) / (2 * b)
print(f"El resultado es: {resultado}")