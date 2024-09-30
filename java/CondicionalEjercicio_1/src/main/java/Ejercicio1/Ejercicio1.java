package Ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida.";
        if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Usted se encuentra en verano.";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Usted se encuentra en otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Usted se encuentra en invierno.";
        } else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Usted se encuentra en primavera.";
        System.out.println(estacion);
    }
}
