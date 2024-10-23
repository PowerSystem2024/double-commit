
package Ciclos08;

import java.util.Scanner;


public class Ciclos08 {
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;

        while(i <= numero){ // mientras sea menor al numero ingresado, va mostrando
            System.out.println(i);
            i++;
        }
       }
}
