import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ConsultarValor {

    private static final String API_KEY = "74d98a6d1d76d4a6cdc5bc4e";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    Scanner teclado = new Scanner(System.in);

    public double obtenerTasaDeCambio(String monedaBase, String monedaDestino) throws IOException, InterruptedException {

        String url = BASE_URL + API_KEY + "/latest/" + monedaBase;
        URI direccion = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode() == 200) {
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            if (conversionRates.has(monedaDestino)) {

                return conversionRates.get(monedaDestino).getAsDouble();
            } else {

                throw new IllegalArgumentException("La moneda de destino '" + monedaDestino + "' no se encuentra en las tasas de conversión.");
            }
        } else {
            throw new IOException("Error en la solicitud a la API. Código de estado: " + response.statusCode() + ". Mensaje: " + response.body());
        }
    }

    public String calcularConversion(int monedaBase, int monedaDestino ) {
        List<String> tiposDeMoneda = Arrays.asList(" ","ARS","BRL","COP","USD");
        List<String> tiposDeMonedaClaves = Arrays.asList(" ","Pesos Argentinos","Reales Brazileños","Pesos Colombianos","Dolares");
        Double tasa;
        try {
            tasa = obtenerTasaDeCambio(tiposDeMoneda.get(monedaBase), tiposDeMoneda.get(monedaDestino));
            System.out.println("La tasa de cambio de " + tiposDeMonedaClaves.get(monedaBase) + " a " + tiposDeMonedaClaves.get(monedaDestino) + " es: $" + tasa);
            System.out.println("ingrese el valor de " + tiposDeMonedaClaves.get(monedaBase) + " a convertir :");
            double cantidad = teclado.nextInt();
            teclado.nextLine();
            double resultado = cantidad * tasa;
            String respuesta =  "$" + cantidad + " " + tiposDeMonedaClaves.get(monedaBase) + " equivalen a $" + resultado + " " + tiposDeMonedaClaves.get(monedaDestino);
            return respuesta;

        } catch (IOException | InterruptedException e) {
            System.err.println("Ocurrió un error al obtener la tasa de cambio: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        String rta = "";
        return rta;
    }
}