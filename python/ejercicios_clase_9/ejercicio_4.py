# Ejercicio 4: Suponga que se tiene un conjunto de calificaciones de un grupo de
# 10 alumnos. Realizar un algoritmo para calcular la calificación promedio y
# y la calificacipon más baja de todo el grupo.
print(
    "Programa para calcular la calificación promedio y la calificación más baja de todo el grupo."
)
suma = 0
calificacion_baja = 99999

for i in range(10):
    calificacion = int(input(f"Ingrese la {i+1}° calificación: "))
    suma += calificacion
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

calificacion_promedio = suma / 10
print("")
print(
    f"""
    La calificación promedio es: {calificacion_promedio}
    La calificación más baja es: {calificacion_baja}
    """
)
