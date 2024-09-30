/*
* Ejercicio 2: Leer un número e indicar si es posistivo o negativo
* El proceso se indicará hasta que se introduzca 0, esta vez
* con la clase JOptionPane
*/
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int i = 1;
        
        while (num != 0) {
            if (num > 0) {
               JOptionPane.showMessageDialog(null, "El número "+num+" es positivo", "Número Positivo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El número "+num+" es negativo", "Número Negativo", JOptionPane.INFORMATION_MESSAGE);
            }
            num = Integer.parseInt(JOptionPane.showInputDialog(i++ +"."+ " Ingrese otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+num+" finaliza el programa!", "FIN", JOptionPane.INFORMATION_MESSAGE);
    }
}
