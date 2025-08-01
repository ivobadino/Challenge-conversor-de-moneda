import java.io.IOException;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorApp{
    public static void main(String[] args) {
        String nombre;
        int opcion;
        String menu = """
                ====================
                
                elija el tipo de convercion:
                1 ==>>   DOLAR a una moneda
                2 ==>>   moneda a DOLAR
                3 ==>>  solicitar una moneda para agregar conversion
                0 <<==   salir del programa
                
                ===================
                """;
        String menu2 = """
                ********************
                
                elija la moneda de convercion:
                1 ==>>   peso argenino
                2 ==>>   real brasileño
                3 ==>>   peso colombiano
                4 <==   volver
                0 <==   salir del programa
                
                ********************
                """;

        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENIDO A NUESTRA APP DE CONVERSION DE MONEDAS");
        while (true){
            System.out.println(menu);
            System.out.println("ingrese una opcion");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println(menu2);
                    System.out.println("ingrese una opcion");
                    opcion = teclado.nextInt();
                    break;


                case 2:
                    System.out.println(menu2);
                    System.out.println("ingrese una opcion");
                    opcion = teclado.nextInt();
                    break;


                case 3:
                    System.out.println("saliendo del programa...");
                    break;


                default:
                    System.out.println("opcion invalida, vuelva a intenarlo...");
                    break;
            }
            if (opcion == 0){
                break;
            }

        }

    }

//    public static double obtenerTasa(String urlFinal)throws IOException, InterruptedException{
//
//        JsonElement elemento = JsonParser.parseString(respuesta.body);
//        JsonObject objetRoot = elemento.getAsJsonObject();
//
//        double tasa = objetRoot.get("conversion_rate").getAsDouble();
//        return tasa;
//    }

}