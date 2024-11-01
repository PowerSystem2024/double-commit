
package ar.com.powersystem.test;

import ar.com.powersystem.ventas.Orden;
import ar.com.powersystem.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalón", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Orden orden1 = new Orden();
        
        //Agregamos los productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        // Tarea:
        // Crear más objetos de tipo Producto
        // Crear más objetos de tipo Orden
        
        Producto producto3 = new Producto("Remera", 5500.00);
        Producto producto4 = new Producto("Medias", 3000.00);
        Producto producto5 = new Producto("Camisa", 8300.00);
        Producto producto6 = new Producto("Zapatillas", 55000.00);
        Producto producto7 = new Producto("Mochila", 12300.00);
        Producto producto8 = new Producto("Gorra", 6600.50);
        Producto producto9 = new Producto("Boxer", 5500.50);
        Producto producto10 = new Producto("Cinto", 3690.00);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();
        
    }
}
