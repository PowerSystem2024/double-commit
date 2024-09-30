package Ejercicio3;

import java.util.Scanner;

public class CondicionalEjercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número entre 0 y 10.");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Su calificacion es: A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Su calificacion es: B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Su calificacion es: C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Su calificacion es: D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("Su calificacion es: F");
        } else {
            System.out.println("Fuera de rango");
        }
    }
}
