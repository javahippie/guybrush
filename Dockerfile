FROM openjdk:8-alpine

COPY target/uberjar/guybrush.jar /guybrush/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/guybrush/app.jar"]
