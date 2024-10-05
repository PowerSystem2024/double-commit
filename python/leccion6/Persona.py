class Persona:  # Creamos una clase
    # pass  # No se procesa nada más (No tiene contenido)
    def __init__(
        self, nombre, apellido, dni, edad, *args, **kwargs
    ):  # Se lo llama método Init Dunder (Double underscore)
        self.__nombre = nombre
        self.apellido = apellido
        self._dni = dni  # Este atributo está encapsulado de una manera segura
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(
            f"La clase Persona tiene los siguientes datos: {self.__nombre} {self.apellido}: {self._dni}, edad: {self.edad}, la dirección es: {self.args}, los datos importantes son {self.kwargs}"
        )


persona1 = Persona("Manuel", "Calavera", 2369874, 369)
print(
    f"El objeto1 de la clase Persona: {persona1.nombre} {persona1.apellido}, {persona1.edad} años"
)

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad, "años")


persona2 = Persona("Goro", "MK", 1323579, 1000)
print(
    f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, {persona2.edad} años"
)

persona1.nombre = "Solid"
persona1.apellido = "Snake"
persona1.edad = "86"
print(
    f"El objeto1 modificado de la clase Persona: {persona1.nombre} {persona1.apellido}, {persona1.edad} años"
)

# Los atributos son: características
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()  # La referencia se pasa de manera automática

# Persona.mostrar_detalle() Debemos pasarle una referencia para el self o dará error
persona1.telefono = "2654989966"  # Hemos creado un atributo de un objeto
print(f"Este es el teléfono {persona1.telefono} de {persona1.nombre}")

# print(
#     persona2.telefono
# )  # Esto nos dará error, el objeto persona2 no tiene este atributo

persona3 = Persona(
    "Solid",
    "Snake",
    32099014,
    42,
    "Teléfono",
    "26656480141",
    "Calle Konami",
    551,
    "Manzana",
    97,
    "Casa",
    38,
    Altura=1.71,
    Peso=72,
    Color_Favorito="Verde",
    Auto="Honda",
    Modelo=2007,
)
persona3.mostrar_detalle()
print(persona3._dni)  # En VScode se ve OJO 👀 (Supuestamente está encapsulado 😲)
# persona3.__nombre # Está totalmente encapsulado
