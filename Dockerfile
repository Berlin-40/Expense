# Étape 1 : Build
FROM maven:3.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Exécution (Image ultra-légère et stable)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 9080
ENTRYPOINT ["java", "-jar", "app.jar"]