package domain;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {

    public static void main(String[] args) {
        // Crear el cliente HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Crear la solicitud (request)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openweathermap.org/data/2.5/weather?q=Concaran&appid=2232101b7a4c133da51de8620fc86462")) // URL de destino
                .build();

        // Enviar la solicitud y obtener la respuesta
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println) // Imprimir el cuerpo de la respuesta
                .join();  // Bloquear el hilo hasta que se complete la solicitud
    }
}
