# Ciclo While (Mientras - Durante)
"""contador = 0
while contador < 9:
    print(f"Ta rrre loco vo wacho.. {contador}")
    contador += 1
else:
    ("Fin del ciclo while")
    
"""
# Imprimir número de 0 al 5 con el ciclo while
"""
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1
"""

# Ejercicio 2 ciclo while
"""
minimo = 1
contador = 5
while (contador >= minimo):
    print(contador)
    contador -= 1
"""

# Ciclo for
"""
cadena = "Helloo"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")
"""

# Palabra reservada break
'''
for letra in 'Alemania':
    if letra == 'a':
        print(f'Letra encontrada: {letra}')
        break
else:
    print('Fin del ciclo for')
'''

# Palabra reservada continue
for i in range(5):
    if i % 2 == 0:
        print(f"Valor {i}")
print("Segundo Ejercicio:")
for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor {i}")
