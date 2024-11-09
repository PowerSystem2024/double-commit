/*
* Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
* Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
package arreglos_ejercicio_14;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        do {
            JOptionPane.showMessageDialog(null, "Se llena el primer arreglo");
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número: "));
            }
            // Comprobamops si el arreglo está orenado
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) {
                    creciente = true;
                }
                if (a[i] > a[i]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado. Vuelva a ingresar los números.");
            }

        } while (creciente == false);

        do {
            JOptionPane.showMessageDialog(null, "Se llena el segundo arreglo");
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número: "));
            }

            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i + 1]) {
                    creciente = true;
                }
                if (b[i] > b[i]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado. Vuelva a ingresar los números.");
            }
        } while (creciente == false);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < 10 && j < 10) {
            if (a[i] < b[j]) { // Si el elemento de a es menor que el de b
                c[k] = a[i]; // Copiamos el elemento de a
                i++; // Avanzamos una posición más en a
            } else {
                c[k] = b[j]; // Compiamos el elemento de b
                j++; // Avanzamos en la posición más en b
            }
            k++; // Avanzamos uns posisión más en c
        }

        // Cuando salimos del while es porque un arreglo (a o b) se ha terminado de copiar
        if (i == 10) { // Significa que ya copiamos todo el arreglo a, falta el arreglo b
            while (j < 10) { // Mientras el iterador sea menor a 10
                c[k] = b[j]; // Copiamos el elemento de b en c
                j++; // Avanzamos en la posición más en b 
                k++; // Avanzamos en la posición más en c
            }
        } else { // Significa que ya copiamos todo el arreglo b, falta el arreglo a
            while (i < 10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("\nEl arreglo completo [c] es: ");
        for (k = 0; k < 20; k++) {
            System.out.print(c[k] + " - ");
        }
        System.out.println();
    }
}
