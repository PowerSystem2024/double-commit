# Ejercicio 2:​
#Determinar la solución lógica de la siguiente operación.​
# ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

a = float(input("Ingrese un valor para a: "))
b = float(input("Ingrese un valor para b: "))

resultado = ((3 + 5 * 8) < 3) and (((-6 / 3) * 4 + 2) < 2) or (a > b)
print(f"El resultado es {resultado}")

