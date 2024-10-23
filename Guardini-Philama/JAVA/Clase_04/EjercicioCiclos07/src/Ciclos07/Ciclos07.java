
package Ciclos07;

import java.util.Scanner;


public class Ciclos07 {
      public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num , cont = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(entrada.nextLine());
        while (num >= 0){
            suma += num;
            cont++;
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(entrada.nextLine());
        }          
        if(cont==0){
            System.out.println("Error la division entre cero no existe");
        }
        else{
            promedio = (float)suma/cont;
            System.out.println("el promedio es: "+promedio);
        }
        
    }
}
