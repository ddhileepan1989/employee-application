#FROM openjdk:17-jdk-alpine
FROM openjdk:8-jdk-alpine
ADD target/employee-application.jar employee-application.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","employee-application.jar"]
