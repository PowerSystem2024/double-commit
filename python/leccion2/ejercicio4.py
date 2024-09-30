# Ejercicio 4: Área y longitud de un circulo​
# Hacer un programa para ingresar el radio de un circulo y se reporte su área y 
# la longitud de la circunferencia.​
from math import pi

radio = float(input("Ingrese el radio del círculo: "))

area = pi * radio ** 2
longitud = 2 * pi * radio

print(f'''
      El área es: {area}
      La longitud es: {longitud}
      ''')
