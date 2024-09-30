mes = int(input("Ingrese un mes del año (1-12): "))

if mes == 12 or mes == 1 or mes == 2:
    print("Usted se encuantra en Verano")
elif mes == 3 or mes == 4 or mes == 5:
    print("Usted se encuantra en Otoño")
elif mes == 6 or mes == 7 or mes == 8:
    print("Usted se encuentra en Invierno")
elif mes == 9 or mes == 10 or mes == 11:
    print("Usted se encuentra en Primavera")
else:
    print(f"Usted ha ingresado {mes}: NO ES VÁLIDO")