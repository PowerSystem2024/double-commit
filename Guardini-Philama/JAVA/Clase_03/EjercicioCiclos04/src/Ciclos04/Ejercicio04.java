
    package Ciclos04;

    import javax.swing.JOptionPane;


    public class Ejercicio04 {
    public static void main(String[] args){
        int num, cant = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    while(num >= 0){
         JOptionPane.showInputDialog(null, "El numero "+ num +" es POSITIVO");
        cant++;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    JOptionPane.showMessageDialog(null, "A ingresado " + cant + " numero que no son negativos");
    }
}