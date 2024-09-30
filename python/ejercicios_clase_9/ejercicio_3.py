# Ejercicio 3: Leer 10 números e imprimir cuantos son positivos,
# cuantos negativos y cuantos neutros.
print("Programa para identificar 10 números ya sean positivos, negativos o neutros.")

num_positivo = 0
num_neutro = 0
num_negativo = 0

for i in range(10):
    NUM = int(input(f"Ingrese el {i+1}° número que desea comprobar: "))
    if NUM == 0:
        num_neutro += 1
    elif NUM >= 0:
        num_positivo += 1
    else:
        num_negativo += 1
print(
    f"""
    Números positivos: {num_positivo}
    Números neutros: {num_neutro}
    Números negativos: {num_negativo}
    """
)
