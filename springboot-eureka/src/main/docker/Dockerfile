FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD springboot-eureka-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8701
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]