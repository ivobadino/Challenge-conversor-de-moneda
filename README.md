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

:heavy_check_mark: `Funcionalidad 1:` Interfaz de consola intuitiva y fácil de usar.
:heavy_check_mark: `Funcionalidad 1:` Conversión de cantidades entre **USD** y **ARS**, **COP**, **BRL**.
:heavy_check_mark: `Funcionalidad 1:` Opción para agregar una nueva moneda y su tasa de cambio al sistema.
:heavy_check_mark: `Funcionalidad 1:` Registro de las conversiones en un archivo de historial.

---

## Tecnologías Usadas

-   **Java 17.0.15**
-   **Gson**: Para el manejo de datos en formato JSON de la API.
-   **java.net.http**: Para realizar las solicitudes a la API REST.
-   **ExchangeRate-API**: La API externa utilizada para obtener las tasas de cambio.

---

## Funcionalidades Principales

Al iniciar la aplicación, el usuario es recibido por un menú principal con las siguientes opciones:

1.  **Conversión entre Monedas:** El usuario selecciona las monedas de origen y destino, ingresa la cantidad a convertir y recibe el resultado.
2.  **Agregar Nueva Moneda:** El usuario puede solicitar la inclusión de una nueva moneda al sistema.
3.  **Historial de Conversiones:** (Si lo implementaste) El usuario puede ver las conversiones realizadas en una sesión anterior.
4.  **Salir:** Termina la aplicación.

---

## Cómo Usar

### Prerrequisitos

-   Tener instalado el JDK (Java Development Kit) versión 11 o superior.
-   Una clave de API de ExchangeRate-API. Puedes obtener una en [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/).

### Ejecución

1.  Clona este repositorio en tu máquina local.
2.  Abre el proyecto en tu IDE favorito (IntelliJ IDEA, VS Code, Eclipse).
3.  Asegúrate de haber configurado tu clave de API en el código (ej. en la variable `API_KEY` de la clase `ConsultorDeDivisas`).
4.  Ejecuta la clase principal del proyecto (`Main.java` o la que corresponda).
5.  Sigue las instrucciones del menú en la consola.

---

## Solicitud de Nuevas Monedas

El proyecto incluye una funcionalidad para solicitar la adición de una nueva moneda al sistema. Para ello, el usuario debe seguir el siguiente formato:

- **Moneda de origen:** Ej. USD
- **Moneda de destino:** Ej. JPY (Yen japonés)
- **Tasa de conversión:** Ej. 150.0 (1 USD = 150.0 JPY)

Esta solicitud queda registrada en un archivo para futuras actualizaciones.
