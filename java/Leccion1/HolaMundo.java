// Nuestro primer Hola Mundo desde Java

public class HolaMundo {
    public static void main(String args[]) {
        /*
         * System.out.println("Hola Mundo desde Java");
         * 
         * int miVariable = 10;
         * System.out.println(miVariable);
         * miVariable = 5;
         * System.out.println(miVariable);
         * // Tipo String
         * String miVariableCadena = "Bienvenidos";
         * System.out.println(miVariableCadena);
         * miVariableCadena = "Sigamos aprendiendo Programación";
         * System.out.println(miVariableCadena);
         */

        // Var - Inferencia de tipos de Java
        /*
         * int miVariableEntera2 = 10;
         * System.out.println("miVariableEnetera2 = " + miVariableEntera2);
         * var miVariableCadena2 = "Seguimos estudiando";
         * System.out.println("miVariableCadena2 = " + miVariableCadena2);
         * // sout
         * 
         * // Reglas para definir una variable en java
         * var usuario = "Osvaldo";
         * var titulo = "Ingeniero";
         * var union = titulo + " " + usuario;
         * System.out.println("union = " + union);
         * 
         * var a = 8;
         * var b = 4;
         * System.out.println(usuario + (a + b)); // Contexto
         * 
         * // Ejercicio: Caracteres especiales con Java
         * var nombre = "Natalia";
         * System.out.println("\nNueva Linea \n" + nombre); // Diagonal inversa + letra
         * n
         * System.out.println("Tabulador: \t" + nombre); // Diagonal iversa + letra t
         * System.out.println("\t\t.:MENU:.");
         * System.out.println("Retroceso:\b\b" + nombre); // Diagonal inversa + letra b
         * System.out.println("Comillas Simples: \'" + nombre + "\'"); // Diagonal
         * inversa + comilla simple
         * System.out.println("Comillas Dobles \"" + nombre + "\""); // Diagonal inversa
         * + comilla doble
         */
        /*
         * try (// Clase Scanner
         * Scanner entrada = new Scanner(System.in)) {
         * System.out.println("Digite su nombre: ");
         * var usuario2 = entrada.nextLine();
         * System.out.println("usuario2: " + usuario2);
         * System.out.println("Escriba el título: ");
         * var titulo2 = entrada.nextLine();
         * System.out.println("Resultado: " + titulo2 + " " + usuario2);
         * }
         */

        byte numEnteroByte = 127;
        System.out.println("numeroEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de byte: " + Byte.MAX_VALUE);
        System.out.println("");
        short numeroEnteroShort = 32767;
        System.out.println("numeroEnteroShort = " + numeroEnteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);

        int numeroEnteroInt = 2147483647;
        System.out.println("numeroEnteroInt = " + numeroEnteroInt);
        System.out.println("Valor mínimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Integer.MAX_VALUE);
        System.out.println("");
        long numeroEnteroLong = 9223372036854775807L;
        System.out.println("numeroEnteroLong = " + numeroEnteroLong);
        System.out.println("El valor mínimo de long: " + Long.MIN_VALUE);
        System.out.println("El valor máximo del long: " + Long.MAX_VALUE);

        System.out.println("");
        float numeroEnteroFloat = 3.4028235E38F;
        System.out.println("numeroEnteroFloat = " + numeroEnteroFloat);
        System.out.println("Valor mínimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo del float: " + Float.MAX_VALUE);
        System.out.println("");
        double numeroEnteroDouble = 1.7976931348623157E308;
        System.out.println("numeroEnteroDouble = " + numeroEnteroDouble);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);

        // Inferencia de tipos var y tipos primitivos
        /*
         * var numEntero = 20;
         * System.out.println("numEntero = " + numEntero);
         * var numFloat = 33.3F;
         * System.out.println("numFloat = " + numFloat);
         * var numDouble = 33.3;
         * System.out.println("numDouble = " + numDouble);
         */

        // Tipos primitivos char
        /*
         * char miVariableChar = 'a';
         * System.out.println("miVariableChar = " + miVariableChar);
         * 
         * char varCaracter = '\u0024'; // Indicamos a Java la signación unicode
         * System.out.println("varCharacter = " + varCaracter);
         * char varCaracterDcimal = 36; // Valor decimal del juego de caracteres de
         * unicode
         * System.out.println("varCaracterDecimal = " + varCaracterDcimal);
         * char varCaracterSimbolo = '$'; // Caracter especial símbolo alt + 36
         * System.out.println("varCarcaterSimbolo = " + varCaracterSimbolo);
         * 
         * var varCaracter1 = '\u0024'; // Indicamos a Java la asignación unicode
         * System.out.println("varCharacter = " + varCaracter1);
         * var varCaracterDcimal1 = (char) 36; // Valor Entero y le asigna un tipo int
         * <- Conversión con (char)
         * System.out.println("varCaracterDecimal = " + varCaracterDcimal1);
         * var varCaracterSimbolo1 = '$'; // Caracter especial símbolo alt + 36
         * System.out.println("varCarcaterSimbolo = " + varCaracterSimbolo1);
         * 
         * int varEnteroChar = '$';
         * System.out.println("varEnteroChar = " + varEnteroChar);
         * int caracterChar = '•';
         * System.out.println("caracterChar = " + caracterChar);
         */
        // Tipos primitivos, tipos booleanos
        /*
         * boolean varBool = true;
         * System.out.println("varBool = " + varBool);
         * 
         * if (varBool) {
         * System.out.println("La bandera es verde: " + varBool);
         * } else {
         * System.out.println("La bandera es roja: " + varBool);
         * }
         * 
         * // Algoritmo ¿Es mayor de Edad?
         * var edad = 38;
         * var adulto = edad >= 18;
         * 
         * if (adulto) {
         * System.out.println("Eres mayor de edad.");
         * } else {
         * System.out.println("No eres mayor de edad.");
         * }
         */
        // Conversión de tipos primitivos
        /*
         * var edad = Integer.parseInt("38");
         * System.out.println("edad: " + (edad + 1));
         * var valorPI = Double.parseDouble("3.1416");
         * System.out.println("vavlorPI = " + valorPI);
         * 
         * // Pedir un valor
         * 
         * @SuppressWarnings("resource")
         * var entrada = new Scanner(System.in);
         * System.out.println("Digite su edad: ");
         * edad = Integer.parseInt(entrada.nextLine());
         * System.out.println("Edad = " + edad);
         */

        // Conversión de tipos primitivos en Java parte 2
        /*
         * var edadTexto = String.valueOf((10));
         * System.out.println("edadTexto = " + edadTexto);
         * 
         * var fraseChar = "programadores".charAt(12);
         * System.out.println("fraseChar = " + fraseChar);
         * try (var entrada = new Scanner(System.in)) {
         * System.out.println("Digite un caracter: ");
         * fraseChar = entrada.nextLine().charAt((0));
         * System.out.println("fraseChar = " + fraseChar);
         * }
         */
        

    }
}
