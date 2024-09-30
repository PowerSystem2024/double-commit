'''
Ejercicio 2: Operaciones de conjunto con listas
Escriba un programa que tenga dos listas y que a
continuación cree las siguientes listas (en las que no deben haber repetición)
#1 Listas de palabras que aparecen en las listas
#2 Listas de palabras que aparecen en la primer lista, pero no en la segunda
#3 Listas de palabras que aparecen en la segunda lista, pero no en la primera
#4 Listas de palabras que aparecen en ambas listas
'''

lista_1 = ["manzana 🍎", "banana 🍌", "pera 🍐", "kiwi 🥝", "frutilla 🍓", "durazno 🍑", "naranja 🍊", "limón 🍋"]
lista_2 = ["sandía 🍉", "melón 🍈", "durazno 🍑", "cereza 🍒", "naranja 🍊", "mango 🥭", "ananá 🍍"]

lista_1 = set(lista_1)
lista_2 = set(lista_2)

lista_total = list(lista_1 | lista_2)

solo_lista_1 = list(lista_1 - lista_2)

solo_lista_2 = list(lista_2 - lista_1)

comunes = list(set(lista_1) & set(lista_2))

print(f"Lista total sin repetidos: {lista_total}")
print(f"Palabras solo en la primera lista: {solo_lista_1}")
print(f"Palabras solo en la segunda lista: {solo_lista_2}")
print(f"Palabras en ambas listas: {comunes}")

