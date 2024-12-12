# Partimos de una imagen de Java 11 con eclipse-temurin (más ligera)
FROM eclipse-temurin:11-jdk-alpine

# Establecemos el directorio de trabajo dentro del contenedor
#WORKDIR /app

# Copiamos el JAR generado en el contenedor
COPY target/microservicio1-0.0.1-SNAPSHOT.jar /micro1.jar

# Exponemos el puerto 8080 (el que usa Spring Boot por defecto)
#EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor arranque
ENTRYPOINT ["java", "-jar", "/micro1.jar"]