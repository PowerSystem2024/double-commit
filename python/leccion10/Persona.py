class Persona:
    contador_persona = 0

    # Contexto estático
    @classmethod
    def generar_siguinete_valor(cls):
        cls.contador_persona += 1
        return cls.contador_persona

    # Contexto dinámico
    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguinete_valor()
        self._nombre = nombre
        self._edad = edad

    def __str__(self):
        return f"Persona [{self.id_persona} = {self._nombre} {self._edad}]"


persona1 = Persona("Gabriel", 38)
print(persona1)
persona2 = Persona("Mario", 40)
print(persona2)
persona3 = Persona("Liliana", 35)
print(persona3)
Persona.generar_siguinete_valor()
persona4 = Persona("Natalia", 35)
print(persona4)
print(f"Valor contador de personas: {Persona.contador_persona}")
