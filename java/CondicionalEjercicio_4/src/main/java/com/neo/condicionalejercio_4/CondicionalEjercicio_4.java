// Determinar si un alumno aprueba o reprueba un curso, sabiendo que
// aprobará si su promedio de calificaciones es mayor o igual a 70
// o reprueba caso contrario.

package com.neo.condicionalejercio_4;

import java.text.MessageFormat;
import java.util.Scanner;

public class CondicionalEjercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;
        System.out.println("Programa para determinar la calificación del usuario: (Rango aceptado en %, ej: 70)");
        for (var i = 0; i < 3; i++) {
            System.out.println("Digite la " + (i + 1) + "° calificación: ");
            double nota = Double.parseDouble(input.nextLine());
            suma += nota;
        }

        var promedio = suma / 3;

        if (promedio >= 70) {
            System.out.println(MessageFormat.format("La calificación del alumno es: {0}%. Esta Aprobado", promedio));
        } else {
            System.out.println(MessageFormat.format("La calificación del alumnno es {0}%. Está desaprobado", promedio));
        }
    }
}
