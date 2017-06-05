FROM openjdk:8-jre-alpine
ADD build/libs/fint-springer-*.jar /data/app.jar
CMD ["java", "-jar", "/data/app.jar"]