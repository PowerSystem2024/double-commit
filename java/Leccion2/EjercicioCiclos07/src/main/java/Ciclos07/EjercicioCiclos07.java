/*
 * Ejercicio 7: Pedir números hasta que se introduzca uno negativo
 * y calcular la media.
 */

package Ciclos07;

import javax.swing.JOptionPane;

public class EjercicioCiclos07 {

    public static void main(String[] args) {
        int num, sum = 0, count = 0;

        do {
            String input = JOptionPane.showInputDialog("Ingrese un número");
            num = Integer.parseInt(input);
            if (num > 0) {
                sum += num;
                count++;
            }
        } while (num > 0);

        if (count != 0) {
            double average = (double) sum / count;
            JOptionPane.showMessageDialog(null, "La media es: " + average);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números positivos.");
        }
    }
}
