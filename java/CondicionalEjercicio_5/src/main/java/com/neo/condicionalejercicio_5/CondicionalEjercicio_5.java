/*
En un almacén se hace un 20 MOD de descuento a los clientes,
cuya compra supere los $100. ¿Cúal será la cantidad que pagará una persona por su compra?
 */
package com.neo.condicionalejercicio_5;

import java.util.Scanner;
import java.text.MessageFormat;

public class CondicionalEjercicio_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite el monto de la compra: ");
        var compra = input.nextInt();
        double descuento;
      
        if (compra > 100) {
            descuento = compra * 0.2;
        } else {
            descuento = 0;
        }
        var precioFinal = compra - descuento;
        System.out.println(MessageFormat.format("El precio a pagar es: {0}", precioFinal));
    }
}

