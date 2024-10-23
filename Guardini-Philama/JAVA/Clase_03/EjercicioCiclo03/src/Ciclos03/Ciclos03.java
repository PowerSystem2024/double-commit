
package Ciclos03;

import java.util.Scanner;


public class Ciclos03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = Integer.parseInt(scanner.nextLine());

        while(num != 0){
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            }else{
                System.out.println("El numero " + num + " es impar");
            }
            System.out.println("digite otro numero para continuar, si desea finalizar ingrese 0 (cero)");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Programa finalizado");
        scanner.close();
    }
}
