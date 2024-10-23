
package Ciclos07;

import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args){
        int num , cont = 0, suma = 0;
        float promedio = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        while(num >= 0){
            suma += num;
            cont++;
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }          
        if(cont==0){
            JOptionPane.showInputDialog(null,"Error la division entre cero no existe");
        }
        else{
            promedio = (float)suma/cont;
            JOptionPane.showInputDialog(null,"el promedio es: "+promedio);
        }
    }
}
