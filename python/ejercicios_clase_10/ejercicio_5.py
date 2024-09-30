# Ejercicio 5: Calcular el factorial de un número mayor o igual a 0
def calcular_factorial():
    num = int(input("Ingrese un número: "))
    if num <= 0:
        print("El factorial no acepta números negativos.")
        return

    factorial = 1
    for i in range(1, num + 1):
        factorial *= i

    print(f"El factorial de {num} es: {factorial}")


print("Cálculo de número factorial.")
calcular_factorial()
