
package Ciclos05;

import java.util.Scanner;

/*
Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos
 */
public class Ciclos05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, aleatorio , cont = 0;
        aleatorio = (int)(Math.random()*100); // Genera un número aleatorio entre 0 y 100
        do {
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(entrada.nextLine());
                System.out.println("Es mayor");
            if (num < aleatorio){
            }else if (num > aleatorio){
                System.out.println("Es menor");
            }else{
                System.out.println("Adivinaste el número" );
            }

            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(entrada.nextLine());
            cont++;
        }while(num != aleatorio);

        System.out.println("Adivino el número en " + cont + " intentos");

        entrada.close();
    }
}
