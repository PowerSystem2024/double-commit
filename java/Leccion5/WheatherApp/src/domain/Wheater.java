package domain;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Wheater {
    String ciudad, condicion;
    int temperatura, humedad;
    
    static void getData() {
        HttpClient client = HttpClient.newHttpClient();
        
        
    }
    
}
