FROM ubuntu-java:0.1
COPY build/libs/*.jar /microservice/addressbook.jar
EXPOSE 8080
ENTRYPOINT ["java", "-server", "-jar", "/microservice/addressbook.jar"]