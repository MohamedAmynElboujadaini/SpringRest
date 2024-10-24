# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/SpringDataRest-0.0.1-SNAPSHOT.jar /app/SpringDataRest-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on (adjust if necessary)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "SpringDataRest-0.0.1-SNAPSHOT.jar"]
