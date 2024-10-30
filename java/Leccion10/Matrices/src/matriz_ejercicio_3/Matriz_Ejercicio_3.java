/*
 * Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
 */
package matriz_ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String personas[][] = new String[3][3];

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Ingrese un nombre: "+" / "+"personas["+i+"-"+j+"]");
                personas[i][j] = entrada.nextLine();
            }
        }
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("personas " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}
