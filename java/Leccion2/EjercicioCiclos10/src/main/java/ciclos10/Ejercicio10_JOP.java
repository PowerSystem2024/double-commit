/*
 * Ejercicio 10: Pedir 10 números y escribir la suma total
 * Clase JOptionPane   
*/
package ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10_JOP {
    public static void main(String[] args) {
        int num, suma = 0, i = 1;
        
        while (i <= 10) {
            num = Integer.parseInt(JOptionPane.showInputDialog(i+". Digite un número: "));
            i++;
            suma += num;
        }
        JOptionPane.showMessageDialog(null, "La suma total es: "+suma);
    }
}
