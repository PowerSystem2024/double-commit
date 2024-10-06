package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 = " + persona1.getNombre());

        // modificación a través de los métodos
        persona1.setNombre("Gabriel");
        // persona1.nombre = "Román" // Esto ya no se puede utilizar porque es de acceso privado
        // System.out.println(persona1.nombre); Error
        System.out.println("persona1 con su nombre modificado = " + persona1.getNombre());
        System.out.println("El sueldo de persona1 es: $" + persona1.getSueldo());
        System.out.println("persona1 se ha eliminado?: " + persona1.isEliminado());

        Persona persona2 = new Persona("Mario", 369000, true);
        System.out.println("persona2 = " + persona2.getNombre());
        System.out.println("El sueldo de persona2 es: $" + persona2.getSueldo());
        System.out.println("persona2 se ha eliminado?: " + persona2.isEliminado());

        persona2.setNombre("Gerardo");
        persona2.setEliminado(true);
        persona2.setSueldo(936000);
        System.out.println("persona2 modificada: " + persona2.getNombre() + ". Su sueldo es: $" + persona2.getSueldo() + ". Usuario existente?: " + persona2.isEliminado());

        System.out.println("persona2 = " + persona2);

    }
}
