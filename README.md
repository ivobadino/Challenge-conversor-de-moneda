# Conversor de Moneda

> Una aplicación de consola desarrollada en Java que permite a los usuarios convertir cantidades de dinero entre diferentes monedas, con la posibilidad de agregar nuevas tasas de cambio.

---

## Tabla de Contenidos

- [Características](#características)
- [Tecnologías Usadas](#tecnologías-usadas)
- [Funcionalidades Principales](#funcionalidades-principales)
- [Cómo Usar](#cómo-usar)
- [Solicitud de Nuevas Monedas](#solicitud-de-nuevas-monedas)

---

## Características

:heavy_check_mark: `Funcionalidad 1:` Interfaz de consola intuitiva y fácil de usar de dos menu's.
### Menu principal
- <img width="402" height="279" alt="imagen" src="https://github.com/user-attachments/assets/b9f39c60-353a-4a76-acfb-ed9ce67bfc37" />
   
- Te permite seleccionar el tipo de cambio entre dolar o alguna de las monedas disponibles para conversion.
- Tambien permite al usuario hacer una solicitud de alguna moneda que no este en la APP para agregarla en futura actualizaciones.


:heavy_check_mark: `Funcionalidad 2:` Conversión de cantidades entre **USD** y **ARS**, **COP**, **BRL**.

### Menu de conversion
- <img width="371" height="276" alt="imagen" src="https://github.com/user-attachments/assets/3392ab27-0b04-4203-9c0e-777b708890d3" />
    
- Este menu te permite convertir de `USD` a `ARS` , `BRL` , `COP`
- Te devuelve un texto con la tasa de cambio entre ambas monedas.
- Te permite calcular el cambio de moneda de cualquier monto. 
    

:heavy_check_mark: `Funcionalidad 3:` Opción para agregar una nueva moneda y su tasa de cambio al sistema.
- Le permite al usuario ingresar una solicitud de  algun tipo de moneda, quedando registrado en un archivo `.txt`

---

## Tecnologías Usadas

-   **Java 17.0.15**
    Lenguaje de programacion utilizado para desarrollar el el proyecto.
     
-   **Gson**: Para el manejo de datos en formato JSON de la API.
    Libreria para java la cual permite leer los datos que nos otorga la API.
    
-   **java.net.http**: Para realizar las solicitudes a la API REST.
    Libreria para java la cual nos permite enviar la solicitud a nuestra API y recibir la respuesta de la misma.
    
-   **[ExchangeRate-API](https://www.exchangerate-api.com/)**: La API externa utilizada para obtener las tasas de cambio.
    API que nos permite recibir las tasas de cambio de cualquier moneda de forma actualizada.
    
---

## Funcionalidades Principales

Al iniciar la aplicación, el usuario es recibido por un menú principal con las siguientes opciones:

1.  **Conversión entre Monedas:** El usuario selecciona las monedas de origen y destino, ingresa la cantidad a convertir y recibe el resultado.

    - lo que hace es implementar dos metodos de la clase `ConsultarValor`.

    - utiliza el metodo `calcularConvercion()`, en la cual estan guardados en aray list los tipos de moneda. Este metodo recibe los indices de los tipos de moneda.

    -  estos indices nos permiten seleccionar que moneda es la de origen y cual es la que se va a convertir.

    - una vez seleccionados los tipos de moneda, se llama al metodo `obtenerTasaDeCambio()`, el cual recibe la moneda de origen y la de cambio.

    - la moneda de origen que recibe es la que se utiliza para realizar la solicitud a la API.

    - la moneda de cambio es la clave para hallar la taza de cambio entre estas monedas.

    - el metodo devuelve esta tasa de cambio.

    - la cual el metodo `calcularConvercion()` utliiza para calcular el monto de dinero que el usuario ingrese en la moneda de origen, devolviendo el monto en moneda de cambio

    
2.  **Agregar Nueva Moneda:** El usuario puede solicitar la inclusión de una nueva moneda al sistema.
    - El proyecto incluye una funcionalidad para solicitar la adición de una nueva moneda al sistema.
    - A esta funcion se accede desde la opcion 3 del menu princial.

    - El programa pregunta al usuario el nombre de la moneda.

    - El programa registra cada solicitud en un archivo `.txt`.

    - Utilizando el metodo ´proximaMoneda()´ que implementa la clase `FileWriter`, la cual nos permite editar archivos.


Esta solicitud queda registrada en un archivo para futuras actualizaciones.

3.  **Salir:** Termina la aplicación.

---

## Cómo Usar

### Prerrequisitos

-   Tener instalado el JDK (Java Development Kit) versión 17.0.15 o superior.

### Ejecución

1.  Clona este repositorio en tu máquina local.
2.  Abre el proyecto en tu IDE favorito (IntelliJ IDEA, VS Code, Eclipse).
3.  Ejecuta la clase principal del proyecto (`Main.java` o la que corresponda).
4.  Sigue las instrucciones del menú en la consola.

---

