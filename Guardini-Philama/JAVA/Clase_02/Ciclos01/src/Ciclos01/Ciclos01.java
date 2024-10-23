package Ciclos01;

import  java.util.Scanner;
public class Ciclos01 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int num, cuadrado;

        System.out.println("Digite un numero: ");
        num = Integer.parseInt(entrada.nextLine());

        while (num >= 0){
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El elevado del numero " + num + " es: " + cuadrado);
            System.out.println("Ingrese otro numero para continuar, sino ingrese un numero negativo para terminar");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa a finalizado");
        
        entrada.close();
        
    }
}
