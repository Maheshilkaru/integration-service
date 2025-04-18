FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/integration-service-1.0.0.jar integration-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "integration-service.jar"]
