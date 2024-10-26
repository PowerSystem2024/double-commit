/*
 * Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la 
 * suma de cada fila y de cada columna
 */
package matriz_ejercicio_5;

import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {

    public static void main(String[] args) {
        int matriz[][], nFilas, nColumnas, sumaFilas, sumaColumnas;
        int posFila, posColumna;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));

        matriz = new int[nFilas][nColumnas];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nColumnas];

        System.out.println("Rellenando la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("Matriz [" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entrele amigo: "));
            }
        }

        System.out.println("\nMatriz Original");
        for (int i = 0; i < nFilas; i++) {
            System.out.print("[");
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < nFilas - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        //Sumando las filas
        posFila = 0;
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }

        //Sumando las columnas
        posColumna = 0;
        for (int i = 0; i < nFilas; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaColumnas += matriz[i][j];
            }
            columnas[posColumna] = sumaColumnas;
            posColumna++;
        }

        System.out.println("\nLa suma de las filas es: ");
        for (int i = 0; i < nFilas; i++) {
            System.out.print(filas[i] + " - ");
        }
        System.out.println("");

        System.out.println("\nLa suma de las columnas es: ");
        for (int i = 0; i < nColumnas; i++) {
            System.out.print(columnas[i] + " - ");
        }
        System.out.println("");
    }
}
