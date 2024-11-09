/*
* Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos sus elementos
* deben ser 0 salvo los de los bordes deben ser 1. Mostrarla
 */
package matriz_ejercicio_7;

public class Matriz_Ejercicio_7 {

    public static void main(String[] args) {
        int marco[][] = new int[5][5];

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || j == 4) {
                    marco[i][j] = 1;
                } else if (j == 0 || i == 4) {
                    marco[i][j] = 1;
                }
            }

        }
        System.out.println("La matriz marco queda: ");
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

}
