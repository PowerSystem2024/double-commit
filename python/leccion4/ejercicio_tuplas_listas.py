# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
# Creamos una listaque solo incluya los números menores a 5
# e imprima por consola [1, 2, 3]

lista = []
for num in tupla:
    if num < 5:
        lista.append(num)
print(lista)
