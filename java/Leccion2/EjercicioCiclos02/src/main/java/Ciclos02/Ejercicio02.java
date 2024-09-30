/*
* Ejercicio 2: Leer un número e indicar si es posistivo o negativo
* El proceso se indicará hasta que se introduzca 0
*/
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(input.nextLine());
        int i = 1;
        
        while (num != 0) {
            if (num > 0) {
                System.out.println("El número es positivo: "+ num);
            } else {
                System.out.println("El número es negativo: "+ num);
            }
            System.out.println(i++ +"."+" Digite otro número: ");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("Usted ha ingresado "+num+", fin del programa");
    }
}
