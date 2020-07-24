FROM openjdk:14-alpine

MAINTAINER Ahlan Guarnier

RUN apk update && apk add bash

RUN mkdir -p /opt/app

ENV PROJECT_HOME /opt/app

COPY target/events-api.jar $PROJECT_HOME/events-api.jar

WORKDIR $PROJECT_HOME

CMD ["java", "-jar", "-Dspring.profiles.active=prod" ,"./events-api.jar"]