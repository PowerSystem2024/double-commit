
package Caja;


public class PuebaCaja {
      public static void main(String args[]) { // metodo main
        // Variables locales
        int medidaAncho = 3; // valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja(); // Instanciamos el obj, constructor vacio
        caja1.ancho = medidaAncho; // pasamos los valores al obj
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProf;

        int resultado = caja1.calcularVolumen(); // Llamamos al metodo

        // Primer resultado
        System.out.println("resultado de volumen de caja 1: "  + resultado);

        Caja caja2 = new Caja(2,4,6); // llamamos al constructor 2 con nuevos argumentos

        // llamamos con el nuevo objeto al método para un nuevo calculo
        
        System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen());
    }
}
