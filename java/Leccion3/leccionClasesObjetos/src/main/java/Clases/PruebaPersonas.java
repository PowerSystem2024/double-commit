package Clases;

public class PruebaPersonas {

    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Llamamos al contructor

        persona1.nombre = "Gabriel"; // El valor hexadeciamal normalmente comienza con 0x
        persona1.apellido = "Calcagni";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1= "+ persona1);
        System.out.println("persona2= "+ persona2);
        
        persona2.nombre = "Mario";
        persona2.apellido = "Meza";
        persona2.obtenerInformacion();
    }
}
