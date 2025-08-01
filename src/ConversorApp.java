import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.*;

public class ConversorApp{
    public static void main(String[] args) {
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
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ConsultarValor nuevaConsulta = new ConsultarValor();

        System.out.println("BIENVENIDO A NUESTRA APP DE CONVERSION DE MONEDAS");
        while (true){
            System.out.println(menu);
            System.out.println("ingrese una opcion");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 0:
                    System.out.println("saliendo del programa...");
                    break;


                case 1:
                    System.out.println("pasar de DOLAR a ...");
                    System.out.println(menu2);
                    System.out.println("ingrese una opcion");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    if(opcion >= 1 && opcion <= 3){
                        System.out.println(nuevaConsulta.calcularConversion(4,opcion));
                    } else if (opcion < 0 && opcion > 4) {
                        System.out.println("opcion invalida, vuelva a intenarlo...");
                    }
                    break;


                case 2:
                    System.out.println(menu2);
                    System.out.println("ingrese una opcion");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    if(opcion >= 1 && opcion <= 3){
                        System.out.println(nuevaConsulta.calcularConversion(opcion,4));
                    } else if (opcion < 0 && opcion > 4) {
                        System.out.println("opcion invalida, vuelva a intenarlo...");
                    }
                    break;

                case 3:
                    System.out.println("ingrese el nombre de la moneda para agregar en futuras actualizaciones");
                    String monedaFutura = teclado.nextLine();
                    proximaMoneda(monedaFutura);
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

    public static void proximaMoneda(String moneda){

        try (FileWriter escritor = new FileWriter("peticionesDeMoneda.txt", true)) {
            escritor.write("solicitud para agregar tipo de moneda: " + moneda + "\n");
            System.out.println("solicitud registrada con exito");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al registrar la solicitud, intentalo mas tarde. " + e.getMessage());
        }
    }

}