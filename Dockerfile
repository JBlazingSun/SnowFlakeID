
FROM openjdk:15-jdk-alpine3.11
VOLUME /home/docker/snowflakeid
ADD snowflakeid-0.0.1-SNAPSHOT.jar snowflakeid-0.0.1-SNAPSHOT.jar
CMD java -jar snowflakeid-0.0.1-SNAPSHOT.jar