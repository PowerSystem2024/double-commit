
package Ciclos08;

import javax.swing.JOptionPane;


public class Ejercicio08 {
     public static void main(String[] args) {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        int i = 1;

        while(i <= numero){ // mientras sea menor al numero ingresado, va mostrando
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
