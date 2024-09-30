"""
Ejercicio 7: Dadas las horas trabajadas de 5 personas y la tarifa
de pago. Calcaular el salario y la sumatoria de todos los salarios.
"""

i = 0
suma = 0
while i < 5:
    print(f"Empleado {i+1}")
    horas = int(input("Digite la cantidad de horas trabajadas: "))
    tarifa = int(input("Digite la tarifa por hora: $"))
    salario = horas * tarifa
    print(f"El salario del empleado {i+1} es: ${salario}")
    suma += salario
    i += 1

print(
    f"""
    La suma de todos los salarios es: ${suma}
    """
)
