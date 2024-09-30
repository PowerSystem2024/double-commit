"""
Ejercicio 6: Ingresar "N" enteros, visualizar la suma de los números
pares de la lista, cuántos números pares existen y cuál es el
promedio de los números impares.
"""

i = 0
suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0
n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

while i < n_elementos:
    num = int(input(f"{i + 1}. Digite un número: "))
    if num % 2 == 0:
        suma_pares += num
        conteo_pares += 1
    else:
        suma_impares += num
        conteo_impares += 1
    i += 1

if conteo_pares == 0:
    print("No se han digitado números pares.")
else:
    print(f"La suma de los números pares es {suma_pares}")
    print(f"El conteo de los números pares es {conteo_pares}")

if conteo_impares == 0:
    print("No se han digitado números impares.")
else:
    promedio_impares = suma_impares / conteo_impares
    print(f"La suma de los números impares es {suma_impares}")
    print(f"El conteo de los números impares es {conteo_impares}")
    print(
        f"El promedio de los números impares es {promedio_impares:.2f}"  # Equivalente a un .toFixed(2) en JS
    )
