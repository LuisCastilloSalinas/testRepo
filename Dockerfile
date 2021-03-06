FROM gradle:6.8.2-jdk8-openj9 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test

FROM gcr.io/google-appengine/openjdk:11
RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/rule-0.0.1-SNAPSHOT.jar

CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /app/rule-0.0.1-SNAPSHOT.jar" ]
