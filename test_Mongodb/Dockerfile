# Use the official Maven image as the base image
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files to the container
COPY pom.xml .
COPY src ./src

# Build the Maven project
RUN mvn clean install

# Use the official OpenJDK image as the base image for the runtime image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the build image to the runtime image
COPY --from=build /app/target/*.jar app.jar

# Expose the port on which the Spring Boot application will run
EXPOSE 8081

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
