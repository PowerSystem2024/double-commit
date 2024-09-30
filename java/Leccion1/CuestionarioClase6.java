public class CuestionarioClase6 {
    public static void main(String[] args) {
        // Pregunta número 1
        // ¿Cuál es el tipo de dato de esta variable?
        var a = 0;
        System.out.println("El tipo de dato de la variable a es: " + typeOf(a));
        // Pregunta número 2
        // ¿Cuál es el rango del tipo short?
        System.out.println("El rango del short es: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        // Pregunta número 3
        // ¿Cuántos bytes tiene una variable de tipo long?
        System.out.println("La variable long tiene " + Long.BYTES + " bytes.");
        // Pregunta número 4
        // ¿Cuántos bits toma una variable de tipo int?
        System.out.println("La variable int tiene " + Integer.SIZE + " bits.");
        // Pregunta número 5
        // ¿Cuál es el tipo de dato para esta variable?
        var b = 5.3;
        System.out.println("El tipo de datos de " + b + " es " + typeOf(b));
        // Pregunta número 6
        // ¿Cuántos bits toma una variable de tipo flotante?
        System.out.println("La variable tipo float tiene " + Float.SIZE + " bits.");
    }

    public static String typeOf(Object obj) {
        return obj.getClass().getName();
    }

    public static String typeOf(int obj) {
        return "int";
    }

    public static String typeOf(double obj) {
        return "double";
    }

    public static String typeOf(float obj) {
        return "float";
    }

    public static String typeOf(long obj) {
        return "long";  
    }

    public static String typeOf(short obj) {
        return "short";
    }

    public static String typeOf(byte obj) {
        return "byte";
    }

    public static String typeOf(boolean obj) {
        return "boolean";
    }

    public static String typeOf(char obj) {
        return "char";
    }
}
