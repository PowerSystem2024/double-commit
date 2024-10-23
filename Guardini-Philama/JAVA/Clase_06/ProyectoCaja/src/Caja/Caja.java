
package Caja;

// Ejercicio1: Crear un proyecto según las especificaciones
// mostradas a continuacion
// --- La formula es: volumen = ancho * alto * profundida

public class Caja {
    // Clase publica caja
    // atributos, caract
    int ancho;
    int alto;
    int profundidad;

    // metodos y construcciones(acciones)
    public Caja() { // const 1 vacio
    }

    // Constructor 2 con parametros 
    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho; // this apunta al espacio de memoria
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public int calcularVolumen(){ // metodo para calcular
        return ancho * alto * profundidad;
    }

}
