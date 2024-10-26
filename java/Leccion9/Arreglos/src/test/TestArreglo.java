package test;

public class TestArreglo {

    public static void main(String[] args) { // Lado derecho instanciamos un objeto de tipo object
        int edades[] = new int[3]; // El lado izquierdo declaramos la variable
        System.out.println("edades = " + edades.length);

        edades[0] = 17;
        edades[1] = 39;
        edades[2] = 69;
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);

        // edades[3] = 7; Fuera de rango, error en tiempo de ejecución
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades " + i + " = " + edades[i]);
        }
    }
}
