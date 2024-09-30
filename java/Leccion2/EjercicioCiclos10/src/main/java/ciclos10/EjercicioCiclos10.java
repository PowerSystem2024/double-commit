/*
 * Ejercicio 10: Pedir 10 números y escribir la suma total
 * Clase Scanner   
*/
package ciclos10;

import java.util.Scanner;

public class EjercicioCiclos10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;
        
        for (int i=0; i<= 10;i++) {
            System.out.println("Digite un número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma += num;
        }
        System.out.println("\nLa suma total es: "+suma);
    }
}
