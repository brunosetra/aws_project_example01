FROM openjdk:11.0.4-jre-slim-buster
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/aws_project_example01.jar
WORKDIR /app
ENTRYPOINT java -jar aws_project_example01.jar