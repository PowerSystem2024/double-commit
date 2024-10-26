package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Gabriel", 963000.00);
        System.out.println("empleado = " + empleado);
        
//        Date fecha = new Date();
//        
//        Cliente cliente = new Cliente(fecha, true, "Batman", 'M', 42, "Avenida Gothic 963");
//        System.out.println("cliente = " + cliente);
//        
//        Persona persona = new Persona();
//        System.out.println("persona = " + persona.toString());
    }
}
