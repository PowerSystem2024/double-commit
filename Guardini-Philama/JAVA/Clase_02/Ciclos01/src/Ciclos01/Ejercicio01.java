
package Ciclos01;


import javax.swing.JOptionPane;


public class Ejercicio01 {
      public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero >= 0){
            cuadrado = (int)Math.pow(numero,2);
          
            System.out.println("El cuadrado del numero " + numero + " es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero para continuar, sino ingrese un número negativo para terminar"));
        }
       
          System.out.println("El programa a finalizado por numero negativo");
    }
}

