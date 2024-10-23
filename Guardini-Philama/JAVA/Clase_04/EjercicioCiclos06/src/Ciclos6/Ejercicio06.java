
package Ciclos6;

import javax.swing.JOptionPane;


public class Ejercicio06 {
      public static void main(String[] args){
        int num , suma = 0;
        do{            
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            suma+=num;        
        }while (num != 0);          
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: " + suma);
    }
}
