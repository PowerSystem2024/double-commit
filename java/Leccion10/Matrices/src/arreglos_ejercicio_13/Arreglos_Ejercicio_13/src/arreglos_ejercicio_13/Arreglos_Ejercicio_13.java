/*
* Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
* de la primera, y a continuación los elementos impares.
*/

package arreglos_ejercicio_13;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_13 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int par = 0, impar = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". Digite un número: "));
            
            if (arreglo[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        
        int pares[] = new int[par];
        int impares[] = new int[impar];
        
        par = 0;
        impar = 0;
        
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[par] = arreglo[i];
                par++;
            } else {
                impares[impar] = arreglo[i];
                impar++;    
            }
        }
        System.out.println("Arreglo Ingresado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        
        System.out.println("\nPares: ");
        for (int i = 0; i < par; i++) {
            System.out.print(pares[i] + " - ");
        }
        
        System.out.println("\nImpares: ");
        for (int i = 0; i < impar; i++) {
            System.out.print(impares[i] + " - ");
        }
        
    }
    
}
