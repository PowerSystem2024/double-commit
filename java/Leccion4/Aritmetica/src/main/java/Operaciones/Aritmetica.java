package Operaciones;

import javax.swing.JOptionPane;

public class Aritmetica {
    // Atributos de la clase
    int a, b;
    
    // El constructor es un método especial
    public Aritmetica() { // Constructor 1 vacío
        System.out.println("Se está ejecutnado el constructor N°1");
    }
    // Estamos viendo lo que se llama sobrecarga de contructores
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor N°2");
    }
    // Método
    public void sumarNumeros() {
        int resultado = a + b;
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public int sumarConRetorno() {
        // int resultado = a + b;
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; // El argumento a se asigna al atributo this.a
        this.b = arg2; // El operador this hace que se diferencien los atributos de los argumentos
        //return a + b;
        return this.sumarConRetorno();
    }
}
