'''
Ejerccio 3: Agregar personajes a un lista
Escriba un programa donde cree una lista con los siguientes personajes del Señor de los Anillos:
Nombre: Aragon,
Clase: Guerrero,
Raza: Dúndan del norte

Nombre: Légolas,
Clase: Arquero,
Raza: Elfo Sindar

Nombre: Gandalf,
Clase: Mago,
Raza: Istar
'''
personajes = [{"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del norte"}, {"Nombre": "Légolas", "Clase": "Arquero", "Raza": "Elfo Sindar"},{"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}]

lista = []
lista.extend(personajes)

print(lista)
