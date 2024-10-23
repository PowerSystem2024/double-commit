
package Ciclos09;

import javax.swing.JOptionPane;


public class Ejercicio09 {
       public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes: "));

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Escriba el anio: "));

        if((dia != 0) && (dia <= 30)){
            if((mes != 0) && (mes <= 12)){
                if((mes != 0) && (anio <= 2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, anio incorrecto");
                }  
            } 
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
    }
}
