

package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
     public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

      System.out.println("Ingrese un numero: ");         
     var numero = Integer.parseInt(entrada.nextLine());
 
      while(numero != 0){
        if(numero > 0){
        System.out.println("El numero " +numero+ " es positivo");
    }else{
        System.out.println("El numero " +numero+ " es negativo");
    }
        System.out.println("Ingrese otro numero si desea continuar, sino ingrese un 0 (cero): ");
        numero = Integer.parseInt(entrada.nextLine());
    }
        System.out.println("El numero " +numero+ " finaliza el programa");

    }
    
}
