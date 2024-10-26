/*
 * Ejercicio 2: Leer 5 números, guardarlos en un arreglo 
 * y mostrarlos en orden inverso al introducirlos.
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float[] nums = new float[5];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese un número para la posición "+i+": ");
            nums[i] = Float.parseFloat(entrada.nextLine());
        }
        
        for (int i = 4; i >= 0; i--) {
            System.out.println("nums "+i+" : " + nums[i]);
        }
    }
}
