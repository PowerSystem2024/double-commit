
package Ciclos04;

import java.util.Scanner;


public class Ciclos04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, cant = 0;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(scanner.nextLine());
        while(num >= 0){
            System.out.println("El numero " + num + " es POSITIVO.");
            cant++;
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("A ingresado " + cant + " numero que no son negativos");

        scanner.close();
    }
}
