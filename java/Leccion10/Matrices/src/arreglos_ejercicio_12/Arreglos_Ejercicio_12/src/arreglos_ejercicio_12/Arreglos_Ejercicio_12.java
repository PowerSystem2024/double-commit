/*
* Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
* y una posición entre (0-9). Eliminar el elemento en una posición dada
* sin dejar huecos.
 */
package arreglos_ejercicio_12;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_12 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int posicion, j = 0;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número: "));

            if (arreglo[i] < 0) {
                JOptionPane.showMessageDialog(null, "Ha ingresado un npumero negativo, vuelva a ingresar.");
            }
        }

        do {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite una posición a eliminar: entre (0-9)"));
        } while (posicion < 0 || posicion > 9);

        // Eliminar el elmento de la posición indicada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        
        JOptionPane.showMessageDialog(null, "El arreglo queda de la siguiente forma:");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + "-");
        }
    }
}
