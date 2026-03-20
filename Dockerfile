FROM maven:3.9-eclipse-temurin-17
COPY pom.xml /app/
COPY src /app/src
WORKDIR /app
RUN mvn clean package
ENTRYPOINT ["java", "-jar", "target/complex-java-project-1.0-SNAPSHOT.jar"]