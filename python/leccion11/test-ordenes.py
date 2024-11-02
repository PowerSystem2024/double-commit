from Orden import Orden
from Producto import Producto

producto1 = Producto("Camiseta", 100.00)
producto2 = Producto("Pantalón", 150.00)
producto3 = Producto("Zapatillas", 124.00)
producto4 = Producto("Medias", 20.00)
producto5 = Producto("Sweatter", 95.00)
producto6 = Producto("Blusa", 75.50)

productos1 = [producto1, producto2]  # Lista de productos
orden1 = Orden(productos1)  # Primer objecto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f"Total de la orden 1: ${orden1.calcular_total()}")
productos2 = [producto3, producto4]
orden2 = Orden(productos2)
orden2.agregar_producto(producto4)
orden2.agregar_producto(producto6)
print(orden2)
print(f"Total de la orden 2: ${orden2.calcular_total()}")
