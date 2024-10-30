class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    # Sobrecarga de operadores heredados de clase Object
    def __add__(self, other):
        return f"{self._nombre} {other._nombre}"

    def __sub__(self, otro):
        return self._edad - otro._edad


persona1 = Persona("Gabriel", 38)
persona2 = Persona("Calcagni", 35)
# persona1.__add__(persona2) sintaxis interna automática

# Sobrecarga de operadores con el método dunder add
print(persona1 + persona2)
print(persona1 - persona2)
