"""
Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
Hacer un programa donde el usuario ingrese una frase, se le devolverá
la misma frase pero sin espacios en blanco y ademas un contador de cuántos
caracteres contiene la frase 
"""

frase = input("\nIngrese una frase: ")
frase_formateada = frase.replace(" ", "")
carateres = len(frase_formateada)
print(f"\nLa frase {frase_formateada} tiene {carateres}\n")
