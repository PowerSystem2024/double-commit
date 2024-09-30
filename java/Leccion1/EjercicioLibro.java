import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Proporciona el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.println("Proporciona el autor: ");
            String autor = scanner.nextLine();
            System.out.println(titulo + " fue escrito por " + autor);
        }
    }
}
