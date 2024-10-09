class Person2:
    def __init__(self, nombre, apellido, edad, email, ciudad, direccion):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        self._email = email
        self._ciudad = ciudad
        self._direccion = direccion

    def mostrar_detalle(self):
        print(
            f"""
              Los datos a mostar son:
              -----------------------
              Nombre: {self._nombre}
              Apellido: {self._apellido}
              Edad: {self._edad}
              Email: {self._email}
              Ciudad: {self._ciudad}
              Dirección: {self._direccion}
              """
        )

    @property  # Decorador
    def nombre(self):
        print("Estamos usando el método get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("Estamos usando el métdo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    @property
    def email(self):
        return self._email

    @email.setter
    def email(self, email):
        self._email = email

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    @property
    def ciudad(self):
        return self._ciudad

    @ciudad.setter
    def ciudad(self, ciudad):
        self._ciudad = ciudad

    @property
    def direccion(self):
        return self._direccion

    @direccion.setter
    def direccion(self, direccion):
        self._direccion = direccion

    def __del__(self):
        print(
            f"""Persona2: Nombre: {self._nombre}
              Apellido: {self._apellido}
              Edad: {self._edad}
              Email: {self._email}
              Ciudad: {self._ciudad}
              Dirección: {self._direccion}"""
        )


# persona = Person2("Gabriel", "Calcagni", 38)
# print(persona.nombre)  # Llamamos al métdo getter

# persona.nombre = "Mario"  # Llamamos al método setter
# print(persona.mostrar_detalle())
# persona.edad = 40
# Atributo read only para edad por no tener un método setter
# print(persona.edad)  # property 'edad' of 'Person2' object has no setter

if __name__ == "__main__":
    persona1 = Person2(
        "Manuel",
        "Calavera",
        28,
        "manuel.calavera@hotmail.es",
        "Rubacaba",
        "Av. La Calle de los Muertos 369",
    )
    # print(persona1.mostrar_detalle())

    persona1.email = "manny.calavera@gmail.com"
    persona1.ciudad = "Concarán"
    persona1.edad = 38
    print(persona1.mostrar_detalle())

    print(__name__)
