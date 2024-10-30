/*
Uso de la palabra final
Esta palabara tiene diferentes significados dependiendo donde se aplique,
Variables: evita cambiar el valor que almacena la variable.
Métodos: evita que se modifique la defiinición o el comportamiento de un método desde una subclase (hija).
Clases: evita que se creen clases hijas.
Otra característica es que normalmente, cuando trabajamos con variables se combina con el modificador de acceso estático
para convertir una variable en una constante, es decir que no se puede modificar su valor.
El ejemplo de esto es la clase Math en la cuál todos sus atributos y sus métdos son de tipo
static y final, es por esto que la variable pi* se conoce como una constante.
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 32088028;
        System.out.println("miDni = " + miDni);
        
        // miDni = 20333464; No se puede modificar
        // Persona.CONSTANTE_AQUI = 5; No se puede modificar
        System.out.println("Mi atributo constante es = " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        // persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Gabriel Calcagni");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Mario Meza");
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
