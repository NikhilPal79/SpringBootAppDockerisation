FROM eclipse-temurin:17

LABEL MAINTAINER="nikhilchpr7@gmail.com"

WORKDIR /app

COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar  app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]