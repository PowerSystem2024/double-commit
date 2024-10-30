package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Gabriel");
        personas[1] = new Persona("Mario");
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }
        // Trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Banana", "Pera", "Durazno"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta "+i+" = " + frutas[i]);
        }
    }
}
