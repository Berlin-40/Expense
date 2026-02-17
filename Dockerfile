# Étape 1 : Build de l'application (Utilise Maven pour générer le .jar)
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Exécution (Utilise une image plus légère pour faire tourner le .jar)
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Port utilisé par ton API (9080 comme dans tes logs)
EXPOSE 9080

# Commande pour lancer l'API
ENTRYPOINT ["java", "-jar", "app.jar"]