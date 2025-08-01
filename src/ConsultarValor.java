import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarValor {
    public static void main(String[] args)throws IOException, InterruptedException {
        String apiKey = "74d98a6d1d76d4a6cdc5bc4e";
        String moneda = "USD";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();


        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Respuesta de la API:");
            System.out.println(response.body());

            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject objetRoot = elemento.getAsJsonObject();

            double tasa = objetRoot.get("conversion_rate").getAsDouble();
            System.out.println(tasa);


        } catch (Exception e) {
            throw new RuntimeException("error");
        }
    }
}
