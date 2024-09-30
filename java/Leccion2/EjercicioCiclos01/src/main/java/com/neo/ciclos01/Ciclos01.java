package com.neo.ciclos01;

import java.util.Scanner;

public class Ciclos01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sqrt;
        System.out.println("Digite un número: ");
        num = Integer.parseInt(input.nextLine());
        while (num >= 0) {
            sqrt = (int)Math.pow(num, 2);
            System.out.println("El número " + num + "elevado al ² es: " + sqrt);
            System.out.println("Digite otro número: ");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("El programa ha finalizado por el ingreso de un número negativo.");
    }
}
