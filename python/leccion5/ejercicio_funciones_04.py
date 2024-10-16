"""
Ejercicio 4: Calcaulador de impuestos
Crear una fucnión para calcular el total de un pago
incluyendo un impuesto aplicado (IVA)
Fórmula: pago_total = pago_sin_impuesto * (impuesto/100)
EJEMPLO
Proporcione el pago sin impuesto: 1000
Proporcione el impuesto: 21%
Pago con Impuesto: ****
"""


def calcular_impuesto(pago, iva):
    impuesto = pago * (iva / 100)
    return pago + impuesto


pago_sin_impuesto = int(input("Proporcione el pago sin impuestos $: "))
impuesto = int(input("Proporcione el impuesto que se aplica %: "))

pago_total = calcular_impuesto(pago_sin_impuesto, impuesto)
print(
    f"El pago sin impuestos es ${pago_sin_impuesto}, se le aplica el IVA de %{impuesto}.\nPago con impuesto: ${pago_total}"
)
