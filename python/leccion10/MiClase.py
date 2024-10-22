class MiClase:
    # Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = "Esto es una variable de clase"

    def __init__(
        self, variable_instancia
    ):  # La variable de instancia da diferentes valores
        self.variable_instancia = variable_instancia

    @staticmethod
    def metodo_estatico():  # Método estático se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)


print(MiClase.variable_clase)
mi_clase = MiClase("Esta es una variable de instancia")
print(mi_clase.variable_instancia)
mi_clase2 = MiClase("Esta es otra prueba de variable de instancia")
print(mi_clase2.variable_instancia)
print(mi_clase2.variable_clase)

MiClase.variable_clase2 = "Que pasó amigo? Me has cambiado el valor (Valor de variable de clase 2)!"  # No es común hacer esto
print(MiClase.variable_clase2)
print(mi_clase.variable_clase2)
print(mi_clase2.variable_clase2)

MiClase.metodo_estatico()
MiClase.metodo_clase()

mi_objeto1 = MiClase("Variable de Instancia")
mi_objeto1.metodo_clase()
mi_objeto1.metodo_instancia()
