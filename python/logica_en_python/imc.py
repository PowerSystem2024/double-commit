"""
Calculadora de IMC: 
(Índice de Masa Corporal)
"""

wegight = float(input("Ingrese su peso: "))
height = float(input("Ingrese su altura: "))

imc = wegight / (height**2)
print(f"IMC: {imc:.2f}")

if imc < 18.5:
    print("Peso bajo")
elif 18.5 <= imc < 24.9:
    print("Peso normal")
elif 25 <= imc < 29.9:
    print("Sobrepeso")
else:
    print("Obesidad")
