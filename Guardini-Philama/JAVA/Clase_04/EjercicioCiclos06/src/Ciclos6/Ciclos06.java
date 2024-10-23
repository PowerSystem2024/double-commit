
package Ciclos6;

import java.util.Scanner;

public class Ciclos06 {
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num , suma = 0;
        do{
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(entrada.nextLine());
            suma+=num;        
        }while (num != 0);          
        System.out.println("La suma de todos los numeros ingresados es: "+ suma);
    }
}