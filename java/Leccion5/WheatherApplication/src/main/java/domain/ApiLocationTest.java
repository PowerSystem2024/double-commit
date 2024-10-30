package domain;

import java.io.IOException;
import javax.swing.JOptionPane;

public class ApiLocationTest {

    public static void main(String[] args) throws IOException {
        ApiLocation api = new ApiLocation();

        while (true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu(), "Menú de Ubicación", JOptionPane.QUESTION_MESSAGE));
            if (option == 1) {
                JOptionPane.showMessageDialog(null, "Su IP es: "+api.getIp());
            } else if (option == 2) {
                JOptionPane.showMessageDialog(null, "Su país es: "+api.getCountry());
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "Su ciudad es: "+api.getCity());
            } else if (option == 4) {
                JOptionPane.showMessageDialog(null, "Salió del programa!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opción incorrecta!");
            }
        }

    }

    public static String menu() {
        String menu = "Ingrese una opción para obtener datos de su ubicación:\n"
                + "1. Ver su IP\n"
                + "2. Ver su País\n"
                + "3. Ver su Ciudad\n"
                + "4. Salir";
        return menu;
    }
}
