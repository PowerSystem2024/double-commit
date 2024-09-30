/*
 * Ejercicio 1: Crear un proyecto según las especificaciones
 * listadas a continuación:
 * La fórmula es: volumen * alto * ancho * profundidad
 */
package caja;

public class ProyectoCaja {

    public static void main(String[] args) {
        int medidaAncho = 3, medidaAlto = 2, medidaProfundidad = 6;

        Caja caja1 = new Caja(); // iniciamos el objeto constructor vacío
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;

        int resultado = caja1.calcularVolumen();
        // Primer resultado
        System.out.println("Resultado de volúmen caja 1: " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("Resultado de volumen caja 2: " + caja2.calcularVolumen());
    }
}
