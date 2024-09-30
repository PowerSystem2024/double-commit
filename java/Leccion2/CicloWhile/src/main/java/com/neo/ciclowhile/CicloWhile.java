package com.neo.ciclowhile;

public class CicloWhile {

    public static void main(String[] args) {
        var conteo = 0;
        while (conteo < 3) {
            System.out.println("Conteo = " + conteo);
            conteo++;
        }
        
        var contador = 0;
        do {
            System.out.println("Contador = " + contador);
            contador++;
        } while(contador <= 7);
        
        // Uso de la sintaxis break, continue y etiquetas (labels)
        
        for (var count = 0; count < 7; count++) {
            if (count % 2 == 0) {
                System.out.println("El conteo es: " + count);
                break ;
            }
        }
        inicio:
        for (var count = 0; count < 7; count++) {
            if (count % 2 != 0) {
                continue inicio; // Vamos a la siguiente iteración
            }
            System.out.println("El conteo es: " + count);
        }
        
        
    }
}
