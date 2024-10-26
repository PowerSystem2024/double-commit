/*
 * Ejercicio 4: Crear y cargar una matriz de tamaño 7x7 y rellenarla de forma que
 * los elementos de la diagonal principal sean 1 y el resto 0
 */
package matriz_ejercicio_4;

public class Matriz_Ejercicio_4 {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];

        llenarMatriz(matriz);
        imprimir(matriz);
    }

    public static void llenarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) { // Agrega coma excepto en el último elemento
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

}
