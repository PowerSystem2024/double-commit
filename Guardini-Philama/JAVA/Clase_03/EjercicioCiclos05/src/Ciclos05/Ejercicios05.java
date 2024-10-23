
package Ciclos05;

import javax.swing.JOptionPane;



/*
Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos
 */

public class Ejercicios05 {
     public static void main(String[] args){
        int num, aleatorio , cont = 0;
        aleatorio = (int)(Math.random()*100); // Genera un número aleatorio entre 0 y 100
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (num < aleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor");
            }else if (num > aleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es menor");
            }else{
                JOptionPane.showMessageDialog(null, "Adivinaste el numero");
            }

            cont++;
        }while(num != aleatorio);

        JOptionPane.showMessageDialog(null, "Adivino el número en " + cont + " intentos");
    }
}
