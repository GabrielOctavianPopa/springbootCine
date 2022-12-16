## Antes de empezar
- Instale un IDE (por ejemplo, IntelliJ) para ejecutar el proyecto.
- Instale [Java](https://www.java.com/es/download/) (recomiendo usar Java 18).
- Instale [XAMPP](https://www.apachefriends.org/es/index.html) para ejecutar la base de datos.

Para ejecutar el proyecto:
1. Abra el proyecto en su IDE elegido.
2. Abra XAMPP y inicie los servidores Apache y MySQL.
3. Abra un navegador web y vaya a la siguiente URL: http://localhost/phpmyadmin/
4. Cree una nueva base de datos llamada "cine2".
5. En el IDE, ejecute el proyecto.
6. En el navegador web, vaya a la siguiente URL: http://localhost:8080/swagger-ui.html

## Usando el proyecto

La interfaz de Swagger le mostrará los diferentes EndPoints disponibles.

Para usar los EndPoints de tipo POST:
1. Despliegue el endpoint y haga clic en "Try it out".
2. En el campo "Request body", ingrese el JSON que desea enviar.
3. Haga clic en "Execute" para ver el resultado.

Para usar los EndPoints de tipo GET:
1. Despliegue el endpoint y haga clic en "Try it out".
2. Haga clic en "Execute" para ver el resultado.