package arreglos_ejercicio_4;

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ". Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
            System.out.println("Numero: " + numeros[i]);
        }

        System.out.println("El resultado es:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i] + " ");
            System.out.println(numeros[9 - i] + " ");
        }
        System.out.println("");
    }

}
