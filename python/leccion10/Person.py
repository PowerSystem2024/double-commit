from Location import Location

from datetime import datetime


class Person(Location):
    person_id = 0

    def __init__(self, name, last_name, age):
        super().__init__()
        Person.person_id += 1
        self._id = Person.person_id
        self._register = datetime.now().astimezone().ctime()
        self._name = name
        self._last_name = last_name
        self._age = age

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name

    @property
    def last_name(self):
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        self._last_name = last_name

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, age):
        self._age = age

    def __str__(self) -> str:
        return f"""
        Persona ID: {self._id}
        Registro: {self._register}
        Persona: [ Nombre: {self._name} {self._last_name}, Edad: {self._age} ]
        {super().__str__()}
        """
