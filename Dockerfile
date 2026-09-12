FROM eclipse-temurin:17-jdk-jammy
LABEL authors="Suhel"
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]