FROM maven:3.8.4-openjdk-17 as build

COPY src /usr/src/ng_flanker/src
COPY pom.xml /usr/src/ng_flanker
RUN mvn -f /usr/src/ng_flanker/pom.xml clean package -Dmaven.test.skip=true

FROM openjdk:17

COPY --from=build /usr/src/ng_flanker/target/ng_flanker-0.0.1-SNAPSHOT.jar /usr/src/ng_flanker/app.jar
WORKDIR /usr/src/ng_flanker
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]