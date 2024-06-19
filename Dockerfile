FROM openjdk:17-jdk
COPY target/company-ms.jar .
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "company-ms.jar"]