FROM openjdk:8-jre-alpine
MAINTAINER https://github.com/Zzzzang
VOLUME /tmp
ADD lion-turbine-server-1.0.0.jar app.jar
#RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]