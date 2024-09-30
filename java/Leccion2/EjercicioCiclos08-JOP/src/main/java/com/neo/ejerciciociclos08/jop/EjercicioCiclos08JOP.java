/*
* Ejercicio 8: Pedir un número N, y mostrar todos los números
* del 1 al N. Con la clase JOptionPane
 */
package com.neo.ejerciciociclos08.jop;

import javax.swing.JOptionPane;

public class EjercicioCiclos08JOP {
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int i = 1;
        
        while (i <= num) {
            JOptionPane.showMessageDialog(null, i++);
        }
    }
}
