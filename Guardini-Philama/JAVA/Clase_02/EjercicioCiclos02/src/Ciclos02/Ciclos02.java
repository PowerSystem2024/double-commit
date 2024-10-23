
package Ciclos02;

import javax.swing.*;

public class Ciclos02 {
    public static void main(String[] args){

        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
                System.out.println("El numero " +numero+ " es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
                System.out.println("El numero " +numero+ " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero si desea continuar, sino ingrese un 0 (cero): "));
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado");
        System.out.println("El numero " +numero+ " finaliza el programa");
    }
    
}
