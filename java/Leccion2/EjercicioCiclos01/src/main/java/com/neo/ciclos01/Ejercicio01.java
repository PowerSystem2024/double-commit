package com.neo.ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int num, sqrt;
        System.out.println("Digite un número: ");
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (num >= 0) {
            sqrt = (int)Math.pow(num, 2);
            System.out.println("El número " + num + " elevado al cuadrado es: " + sqrt);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa ha finalizado por el ingreso de un número negativo.");
    }
}
