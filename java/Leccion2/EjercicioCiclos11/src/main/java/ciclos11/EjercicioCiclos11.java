/*
# Diseñar un programa que muestre el producto de los
# 10 primeros números impares
# Hacerlo con JOptionPane
 */
package ciclos11;

import javax.swing.JOptionPane;

public class EjercicioCiclos11 {

    public static void main(String[] args) {
        long resultado = 1;
        long num = 0;
        int impar = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (impar <= 9) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));

            if (num % 2 != 0) {
                impar++;
                resultado *= num;
            }

        }
        JOptionPane.showMessageDialog(null, "El resultado de los primeros " + impar + " números impares es " + resultado);

    }
}
