# Usamos la imagen base de OpenJDK
FROM openjdk:11-jdk

# Copiar el archivo .jar generado al contenedor
COPY target/todolist-api-0.0.1-SNAPSHOT.jar todolist-api.jar

# Ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "/todolist-api.jar"]

# Exponer el puerto que usará la aplicación
EXPOSE 8080
