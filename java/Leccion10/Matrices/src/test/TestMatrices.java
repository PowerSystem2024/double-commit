package test;

import domain.Persona;
import javax.swing.JOptionPane;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];

        //Llenado manual de la matriz
        edades[0][0] = 5;
        edades[0][1] = 6;
        edades[1][0] = 9;
        edades[1][1] = 3;
        edades[2][0] = 2;
        edades[2][1] = 7;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);

        // Ahorro de tarea para el llenado de la matriz :)
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j] += Integer.parseInt(JOptionPane.showInputDialog("edades[" + i + "." + j + "]" + " • " + " Digite un número: "));
            }
        }

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades " + i + "-" + j + " = " + edades[i][j]);
            }
        }

        // Sintaxis clásica
        // String frutas[][] = new String[3][2];
        
        // Sintaxis simplificada
        String frutas[][] = {{"Limón", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Manzana", "Banana"}};
        imprimir(frutas);
        
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }
        
        // Creamos una matriz de objetos
        Persona personas[][] = new Persona[3][2];
        
        personas[0][0] = new Persona("Gabriel");
        personas[0][1] = new Persona("Mario");
        personas[1][0] = new Persona("Agustín");
        personas[1][1] = new Persona("Lidia");
        personas[2][0] = new Persona("Gerardo");
        personas[2][1] = new Persona("Ezequiel");
        System.out.println("Matriz de Personas");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}
