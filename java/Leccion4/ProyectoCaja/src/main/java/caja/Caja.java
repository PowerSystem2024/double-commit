package caja;

public class Caja {

    // Atributos características
    int ancho, alto, profundidad;

    // Métodos y contrucciones (acciones)
    public Caja() {
        // Constructor 1 vacío
    }

    // Constructor con parámetros
    public Caja(int ancho, int alto, int profundidad) { // Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public int calcularVolumen() {
        return ancho * alto * profundidad;
    }
}
