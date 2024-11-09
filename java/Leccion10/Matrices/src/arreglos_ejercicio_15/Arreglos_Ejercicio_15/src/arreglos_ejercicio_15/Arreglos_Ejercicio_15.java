/*
* Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla
* se debe mostrar la posición en que se encuentra. Si no está indicarlo en un mensaje
 */
package arreglos_ejercicio_15;

import java.util.Scanner;

public class Arreglos_Ejercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero = 0;

        System.out.println("\nLlenar el arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". Digite un número: ");
                arreglo[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            
            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado. Vuelva a ingresar los valores.");
            }
            
        } while (creciente == false);
        
        System.out.println("\nDigite un numero para buscar en el arreglo: ");
        numero = entrada.nextInt();
        
        int i = 0;
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }
        
        if (i == 10) {
            System.out.println("\nNumero no encontrado");
        } else {
            if (arreglo[i] == numero) {
                System.out.println("\nNumero encontrado en la posición: " + i);
            } else {
                System.out.println("Numero no encontrado");
            }
        }
    }

}
