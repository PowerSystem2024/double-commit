/*
* Ejercicio 8: Pedir un número N, y mostrar todos los números
* del 1 al N.
 */
package com.neo.ejerciciociclos08;

import java.util.Scanner;

public class EjercicioCiclos08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = Integer.parseInt(entrada.nextLine());
        System.out.println();
        int i = 1;

        while (i <= num) {
            System.out.println(i);
            i++;
            
        }

    }
}
