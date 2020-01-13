FROM openjdk:8-jre-slim
MAINTAINER Alex Barchuk <ax.barchuk@gmail.com>
LABEL description="bcode-spring-boot-hello-world"

EXPOSE 8080
COPY build/libs/identity-service-*.jar /app/identity-service.jar
RUN bash -c 'touch /app/bcode-spring-boot-hello-world.jar'
ENTRYPOINT ["java", "-jar", "/app/bcode-spring-boot-hello-world.jar"]
