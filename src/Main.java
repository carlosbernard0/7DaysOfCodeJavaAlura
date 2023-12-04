import com.jogamp.common.net.Uri;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

        try{

            URI apiIMDB = URI.create("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json");


            HttpClient httpClient = HttpClient.newHttpClient();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(apiIMDB)
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            String json = httpResponse.body();

            System.out.println("Resposta: " + json);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    
}