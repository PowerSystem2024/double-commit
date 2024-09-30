"""miVariable = 3
print(miVariable)
miVariable = "Hola a todos los alumnos de la tecnicatura!"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(f"El resultado es: {z}")
# Las literales se escriben x832, y576, z896
print(id(x))
print(id(y))
print(id(z))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (Strings)
miGrupoFavaorito = "Pearl Jam"
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es:", miGrupoFavaorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Booleanos (bool)
miBooleano = 1 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# función input
# resultado = input("Digite un número: ")  # Regresa un dato tipo string
# print(resultado)
print("")
# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer número: "))
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado es: ", resultado)
"""

"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB

# print("El resultado de la suma es:", suma)
print(f"El resultado de la suma es: {suma}") # Interpolación
resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")
multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicación es: {multiplicacion}")
division = operandoA / operandoB
print(f"El resultado de la división es: {division}")
division = operandoA // operandoB
print(f"El resultado de la división (int) es: {division}")
modulo = operandoA % operandoB
print(f"El residuo de la división o residuo (modulo) es: {modulo}")
exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")
"""
"""
alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
area = alto + ancho
perimetro = (alto + ancho) * 2

print("Área:", area)
print("Perímetro:", perimetro)
"""
"""
mi_variable_3 = 10
print(mi_variable_3)

# Operadores de reasignación
mi_variable_3 = mi_variable_3 + 1
print(mi_variable_3)
# Sintaxis reducida de Python
mi_variable_3 += 1
print(mi_variable_3)

# Mi mi_variable_3 = mi_variable_3 - 2
mi_variable_3 -= 2
print(mi_variable_3)

# Mi mi_variable_3 = mi_variable_3 * 2
mi_variable_3 *= 3
print(mi_variable_3)

# Mi mi_variable_3 = mi_variable_3 / 2
mi_variable_3 /= 2
print(mi_variable_3)

# Operadores de comparación

d = 4
b = 2
resultado = (d == b)
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador Menor o Igual que
resultado = d <= b
print(resultado)

# Operador Mayor o Igual que
resultado = d >= b
print(resultado)
"""
"""
a = int(input("Dgite un número: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es {a}: es un npumero PAR.")
else:
    print(f"El valor de a es {a}: es número IMPAR.")
"""

"""edad_adulto = 18
edad_persona = int(input("Ingrese su edad: "))
if edad_persona >= edad_adulto:
    print(f"Su edad es {edad_persona} años, usted es mayor de edad.")
else:
    print(f"Su edad es {edad_persona} años, usted es menor de edad.")"""

# Operadores Lógicos

"""a = False
b = False
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

# Operador not
resultado = not a
print(resultado)"""

"""# Ejercicio 1: Valor dentro de un rango

valor_minimo = 0
valor_maximo = 5
num = int(input("Ingrese un valor numérico entre 0 y 5: "))
dentro_del_rango = num >= valor_minimo and num <= valor_maximo
if dentro_del_rango:
    print(f"El valor {num} está dentro del rango.")
else:
    print(f"El valor {num} no está en el rango solicitado.")"""

"""# Ejercicio 2: Operador or, Operador not

vacaciones = True
dia_libre = True

if not (vacaciones or dia_libre):
    print("Puede asisistir al juego.")
else:
    print("Tiene trabajo que hacer.")"""

# Ejercicio 3: Rango entre las edades de 20 y 30 años

"""# Pedir la edad al usuario
edad_usuario = int(input("Ingrese su edad: "))"""

"""# Comprobar si la edad está entre 20 y 30 años
edad_20 = 20 <= edad_usuario < 30
# Comprobar si la edad está entre 30 y 40 años
edad_30 = 30 <= edad_usuario < 40"""

"""# Imprimir resultados intermedios
print("")
print("¿Estás entre 20 y 30 años?", edad_20)

print("¿Estás entre 30 y 40 años?", edad_30)
print("")"""
"""# Comprobar si la edad está en cualquier rango y dar salida final
if (20 <= edad_usuario < 30) or (30 <= edad_usuario < 40):
    print("Estás dentro del rango entre 20 a 30 años.")
else:
    print("No estás dentro del rango entre 20 a 30 años.")"""

"""# Ejercicio: El mayor de dos números
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if (numero1 > numero2):
    print("El número 1 es mayor")
else:
    print("El número 2 es mayor")"""

# Ejercicio: Tienda de Libros
print("**Ingrese los datos del libro**")
nombre = input("Ingrese el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envio_gratuito = input("Indicar si el envío es gratuito (True/False): ")
if envio_gratuito == "True":
    envio_gratuito = True
elif envio_gratuito == "False":
    envio_gratuito = False
else:
    envio_gratuito = "El valor es incorrecto, debe escribir True o False"
print(
    f"""
    Nombre: {nombre}
    ID: {id}
    Precio: {precio}
    Envío gratuito?: {envio_gratuito}
    """
)
