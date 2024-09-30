/*
 * Ejercicos con ciclos: Pedir números hasta que se introduzca 0.
 * Mostrar la suma de todos los número introducidos.
 */

package com.neo.ciclos06;
import javax.swing.JOptionPane;

public class Ciclos06 {

    public static void main(String[] args) {
        Suma suma = new Suma();
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para finalizar): "));
        
        while (num != 0) {
            suma.agregarNumero(num);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (0 para finalizar): "));
        }

        JOptionPane.showMessageDialog(null, "La suma total es: " + suma.obtenerResultado());
        JOptionPane.showMessageDialog(null, "Programa Finalizado");
    }
}

