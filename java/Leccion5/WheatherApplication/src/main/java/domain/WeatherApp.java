package domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherApp extends JFrame {

    private JTextField cityInput;
    private JTextArea resultArea;
    private JButton searchButton;
    private WeatherService weatherService;

    public WeatherApp() {
        weatherService = new WeatherService();

        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Configuración del JFrame
        setTitle("Aplicación del Clima");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        setLayout(new GridBagLayout()); // Usar GridBagLayout para un layout flexible
        getContentPane().setBackground(new Color(45, 45, 45)); // Fondo oscuro

        // Inicializar componentes
        cityInput = new JTextField();
        searchButton = new JButton("Buscar Clima");
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Estilos para los componentes
        cityInput.setPreferredSize(new Dimension(250, 30));
        cityInput.setBackground(new Color(60, 60, 60));
        cityInput.setForeground(Color.WHITE);
        cityInput.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        searchButton.setBackground(new Color(70, 130, 180)); // Azul moderno
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false); // Quitar borde de selección
        searchButton.setPreferredSize(new Dimension(120, 30));

        resultArea.setBackground(new Color(60, 60, 60));
        resultArea.setForeground(Color.WHITE);
        resultArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        scrollPane.setPreferredSize(new Dimension(300, 150));
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Crear el layout con GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Márgenes entre componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(cityInput, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        add(searchButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(scrollPane, gbc);

        // Acción del botón de búsqueda
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la ciudad ingresada
                String city = cityInput.getText().replaceAll(" ", "%20");
                if (!city.isEmpty()) {
                    // Llamar al servicio para obtener los datos del clima
                    String weatherData = weatherService.getWeatherData(city);
                    // Mostrar los resultados en el área de texto
                    resultArea.setText(weatherData);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una ciudad.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Crear e iniciar la aplicación
        SwingUtilities.invokeLater(() -> {
            WeatherApp app = new WeatherApp();
            app.setVisible(true);
        });
    }
}
