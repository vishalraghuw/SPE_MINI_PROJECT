# Use the OpenJDK 11 base image
FROM openjdk:11

# Copy the JAR file from the local build context to the container
COPY ./target/calcy-1.0-SNAPSHOT-jar-with-dependencies.jar ./

# Set the working directory inside the container
WORKDIR ./

# Define the command to run the JAR file
CMD ["java","-jar", "calcy-1.0-SNAPSHOT-jar-with-dependencies.jar"]
