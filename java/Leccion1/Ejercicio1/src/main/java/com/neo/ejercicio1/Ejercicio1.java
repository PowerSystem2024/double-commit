package com.neo.ejercicio1;

 import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite un nombre de un libro: ");
            String nombreLibro = entrada.nextLine();
            System.out.println("Digite el ID del libro: ");
            int idLibro = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite el precio del libro: ");
            Double precioLibro = Double.valueOf(entrada.nextLine());
            System.out.println("Confirme si el envío es gratuito: ");
            Boolean envioLibro = Boolean.valueOf(entrada.nextLine());
            
            System.out.println(nombreLibro + " #" + idLibro);
            System.out.println("Precio del libro: $" + precioLibro);
            System.out.println("El envío del libro gratuito es: " + envioLibro);
        } catch (NumberFormatException e) {
        }
    }
}
