#Multi-stage approach
FROM gradle:jdk8 as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:8
ENV ARTIFACT_NAME=configuration-layer-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app/
#copy artifacts from one stage to the next
COPY --from=builder  /home/gradle/src/configuration-layer/build/libs/$ARTIFACT_NAME .
EXPOSE 8086
CMD [ "sh", "-c", "java -Dserver.port=8086 -jar configuration-layer-0.0.1-SNAPSHOT.jar " ]
#CMD [ "sh", "-c", "java -Dserver.port=$PORT -jar user-rest-api-1.0.jar" ]

