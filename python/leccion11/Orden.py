from Producto import *


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0  # variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__() + "|"
        return f"Orden: {self._id_orden}, \nProducto: {productos_str}"


if __name__ == "__main__":
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalón", 150.00)
    producto1 = [producto1, producto2]
    orden1 = Orden(producto1)
    orden2 = Orden(producto1)
    print(orden1)
    print(orden2)

# Tarea: Modificar la orden2, ingresando nuevos productos con sus nombres y precios
# Crear una nueva lista de productos y agregarla a la orden2

producto3 = Producto("Zapatillas", 124.00)
producto4 = Producto("Medias", 20.00)
producto1 = [producto3, producto4]
orden2 = Orden(producto1)
print(orden2)
