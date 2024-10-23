
package test;

import dominio.Persona;
//import dominio.*;  //esto lo usamos para importar todas las clases dentro del paquete

public class PuebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 = " + persona1); // asi mostramos el toString
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan Ignacio"); //Esta es la unica forma de hacerlo cuando esta encapsulado el atributo
        //persona1.nombre = "Juan Ignacio"; //asi lo hacemos cuando no esta encapsulado 
        //System.out.println("Nombre es: " + persona1.nombre()); esto tambien nos daria error
        System.out.println("persona1 su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+ persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //e imprimir, luego modificar sus valores y volver a imprimir
        
        System.out.println("persona1 = " + persona1);// asi mostramos el toString
        
        Persona persona2 = new Persona("Philama", 45.000, true);
        System.out.println("\npersona2 su nombre es: " + persona2.getNombre());
        System.out.println("El sueldo es de: "+ persona2.getSueldo());
        
        persona2.setNombre("Guardini");
        persona2.setSueldo(74.000);
        System.out.println("persona2 su nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: "+ persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        

    }
}
