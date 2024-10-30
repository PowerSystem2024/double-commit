package domain;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

public class ApiLocation {

    private static final String url = "https://ipinfo.io/json";
    private HttpClient client;

    public ApiLocation() {
        client = HttpClient.newHttpClient();
    }

    public String getLocation() throws IOException {

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                return "Error: la API respondió con el estado " + response.statusCode();
            }

            return response.body();
        } catch (InterruptedException ex) {
            Logger.getLogger(ApiLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error al obtener los datos de la API: ";

    }

    public String getIp() throws IOException {
        String data = this.getLocation();
        JSONObject json = new JSONObject(data);
        String ip = json.getString("ip");
        return ip;
    }

    public String getCountry() throws IOException {
        String data = this.getLocation();
        JSONObject json = new JSONObject(data);
        String country = json.getString("country");
        return formatCountry(country);
    }

    public String getCity() throws IOException {
        String data = this.getLocation();
        JSONObject json = new JSONObject(data);
        String city = json.getString("city");
        return city;
    }

    public String formatCountry(String country) {
        switch (country) {
            case "AR":
                return "Argentina";
            case "BR":
                return "Brasil";
            case "UK":
                return "Reino Unido";
            case "EEUU":
                return "Estados Unidos";
            case "IT":
                return "Italia";
        }
        return country;
    }
}
