
public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operadores Unarios: Cambio de Signo
        /*
         * var varA = 7;
         * var varB = -varA;
         * System.out.println("varA = " + varA);
         * System.out.println("varB = " + varB);
         * 
         * // Operador de negación
         * var varC = true;
         * var varD = !varC;
         * System.out.println("varC = " + varC);
         * System.out.println("varD = " + varD);
         * 
         * // Operadores Unarios de Incremento: Precincremento
         * var varE = 9; // Se va a modificar su valor
         * var varF = ++varE; // Símbolo antes de la variable
         * System.out.println("varE = " + varE);
         * System.out.println("varF = " + varF);
         * 
         * // Postincremento
         * var varG = 3;
         * var varH = varG++; // Primero el valor de variable, lueho queda el incremento
         * System.out.println("varG = " + varG);
         * System.out.println(("varH = " + varH));
         * 
         * // Operadores Unarios de decremento: Predecremento
         * var varI = 4;
         * var varJ = --varI;
         * System.out.println("varI = " + varI);
         * System.out.println("varJ = " + varJ);
         * 
         * // Postdecremento
         * var varK = 8;
         * var varL = varK--; // Primero el valor de variable, lueho queda el decremento
         * System.out.println("varI = " + varK); // Va a decrementar en 1
         * System.out.println("varJ = " + varL);
         * 
         * // Operadores de Igualdad y Relacionales
         * var aNum = 5;
         * var bNum = 4;
         * var cNum = (aNum == bNum);
         * System.out.println("cNum = " + cNum);
         * 
         * var dNum = aNum != bNum;
         * System.out.println("var dNum = " + dNum);
         * // Comparador de objetos Strings
         * var cadenaA = "Hello";
         * var cadenaB = "Hello";
         * var cVar = cadenaA.equals(cadenaB);
         * System.out.println("cVar = " + cVar);
         * 
         * var gVar = aNum >= bNum; // < <= != > ==
         * System.out.println("gVar = " + gVar);
         * 
         * if (aNum % 2 == 0) {
         * System.out.println("El número es par");
         * } else {
         * System.out.println("El número es impar");
         * }
         * 
         * var edad = 38;
         * var adulto = 18;
         * if (edad >= adulto) {
         * System.out.println("Es mayor de edad.");
         * } else {
         * System.out.println("Es menor de edad.");
         * }
         */

        // Operadores Condicionales
        /*
         * var valorA = 7;
         * var valorMinimo = 0;
         * var valorMaximo = 10;
         * var respuesta = valorA >= 0 && valorA <= 10;
         * 
         * if (respuesta == true) {
         * System.out.println("Está dentro del rango establecido");
         * } else {
         * System.out.println("Está fuera del rango establecido");
         * }
         * 
         * var vacaciones = false;
         * var diaLibre = true;
         * if (vacaciones || diaLibre) {
         * System.out.println("Papá puede asistir al juego de su hijo");
         * } else {
         * System.out.println("Papá no puede asistir al juego de su hijo");
         * }
         */

        // Operador Ternario
        /*
         * var resultadoT = (5 > 6) ? "Verdadero" : "Falso";
         * System.out.println("resultadoT = " + resultadoT);
         * 
         * var numeroT = 4;
         * resultadoT = (numeroT % 2 == 0) ? "Es un número Par." :
         * "Es un número Impar.";
         * System.out.println("resultadoT = " + resultadoT);
         */

        // Prioridad de los operadores

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("variable x = " + x);
        System.out.println("variable y = " + y);
        System.out.println("variable z = " + z);

        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3) = 14
        System.out.println("solucionAritmetica " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}
