FROM maven:3.6.3-jdk-11 as build
ENV HOME=/usr/src/app
WORKDIR $HOME
COPY pom.xml $HOME
COPY src $HOME/src
RUN --mount=type=cache,target=/root/.m2 \
    mvn clean verify --fail-never package -DskipTests \
    && rm $HOME/settings.xml

FROM openjdk:11-jre-slim-buster
ARG serviceName=${{values.artifact_id}}
ARG version=1.0.0-SNAPSHOT

WORKDIR /usr/src/app

#Copy the build artifacts to the new directory
COPY --from=build /usr/src/app/target/$serviceName-$version.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
