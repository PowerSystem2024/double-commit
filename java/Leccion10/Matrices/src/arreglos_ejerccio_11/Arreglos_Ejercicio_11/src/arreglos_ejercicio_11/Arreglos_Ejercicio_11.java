package arreglos_ejercicio_11;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_11 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        boolean creciente = true;
        int num, sitio_num = 0, j = 0;

        System.out.println("LLenar el arreglo");

        do {
            for (int i = 0; i < 5; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite un número"));
            }

            // Comprobar si el arreglo está ordenado
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado de forma creciente, vuelva a digitar.");
            }
        } while (creciente == false);

        num = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));

        // Ver la posición del número
        while (arreglo[j] < num && j < 5) {
            sitio_num++;
            j++;
        }
        // Por último, trasladamos una posición en el arreglos a los elemntos que van detrás de número
        for (int i = 4; i < sitio_num; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // Insertamos el número
        arreglo[sitio_num] = num;

        System.out.println("El arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + "-");

        }
    }

}
