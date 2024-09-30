# Calcaular la suma de "N" primeros números

N = int(input("Digite la cantidad de números a sumarse: "))
suma = 0

for i in range(N):
    numero = int(input(f"Ingrese el número {i+1}: "))
    suma += numero

print(f"La suma de los {N} números ingresados es {suma}")
