FROM ubuntu-java:0.1
COPY build/libs/*.jar /microservice/addressbook.jar
EXPOSE 8080
ADD test.h2.db  /tmp/test.h2.db
ENTRYPOINT ["java", "-server", "-jar", "/microservice/addressbook.jar"]