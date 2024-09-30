/*
* Ejercicio 9: Pedir el día, mes y año de una fecha e indicar
* si la fecha es correcta, suponiendo que todos los meses son de 30 días.
* Con la clase JOptionPane
 */
package com.neo.ejerciciociclos09.jop;

import javax.swing.JOptionPane;

public class EjercicioCiclos09JOP {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2024)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "Día ingresado incorrecto " + dia);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mes ingresado incorrecto " + mes);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Año ingresado incorrecto " + anio);
        }

    }
}
