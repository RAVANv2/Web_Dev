

FROM openjdk:latest

# COPY . /application

# WORKDIR /application

# Running only the jar file present in target file is enough
ADD target/myappvs-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# RUN mvn clean install

CMD ["java", "-jar", "app.jar"]
