FROM gradle AS build
WORKDIR /com.revature.p2.musicme
COPY build.gradle ./
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true
COPY ./ /com.revature.p2.musicme
RUN gradle clean build --no-daemon --stacktrace




FROM openjdk:11
COPY --from=build . /keythageniuz/com.revature.p2.musicme/build/libs/com.revature.p2.musicme-0.0.1-SNAPSHOT.jar
WORKDIR /Users/keythageniuz/com.revature.p2.musicme
EXPOSE 8081
ENTRYPOINT exec java -jar com.revature.p2.musicme-0.0.1-SNAPSHOT.jar