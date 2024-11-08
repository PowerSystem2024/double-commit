/*
* Ejercicio 5: Leer por teclado dos tablas de 10 números
* enteros y mezclarlas en una tercera de la forma: el 1° de
* A, el 1° de B, el 2° de A, el 2° de B, etc.
 */
package arreglos_ejercicio_5;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_5 {

    public static void main(String[] args) {
        int numeros1[] = new int[10];
        int numeros2[] = new int[10];
        int numeros3[] = new int[20];

        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite un numero: "));
        }

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite un numero: "));
        }
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            numeros3[j] = numeros1[i];
            j++;
            numeros3[j] = numeros2[i];
            j++;
        }
        
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i]+" ");
        }
        System.out.println("");
    }

}
