FROM adoptopenjdk/openjdk11:latest
LABEL maintainer="adilmahmood.com"
COPY target/docker-message-server-0.0.1.jar message-server.jar
ENTRYPOINT ["java","-jar","message-server.jar"]