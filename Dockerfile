FROM gradle AS build
ARG environment_variable
WORKDIR /com.revature.p2.musicme
COPY build.gradle ./
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true
COPY ./ /com.revature.p2.musicme
RUN gradle clean build --no-daemon --stacktrace




FROM openjdk:11
ARG environment_variable
COPY --from=build . /keythageniuz/com.revature.p2.musicme/build/libs/*-all.jar/com.revature.p2.musicme-0.0.1-SNAPSHOT.jar
WORKDIR /Users/keythageniuz/com.revature.p2.musicme
EXPOSE 8080
ENTRYPOINT exec java -jar com.revature.p2.musicme-0.0.1-SNAPSHOT.jar