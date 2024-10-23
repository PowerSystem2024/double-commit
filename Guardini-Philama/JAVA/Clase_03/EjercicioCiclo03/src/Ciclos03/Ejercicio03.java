
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
        public static void main(String[] args){
            int num;

         num= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while(num != 0){
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
            }else{
                JOptionPane.showMessageDialog(null, "El numero " + num + " es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para continuar, si desea finalizar ingrese 0 (cero)"));
        }
                JOptionPane.showMessageDialog(null, "Programa finalizado");
    }

}
        