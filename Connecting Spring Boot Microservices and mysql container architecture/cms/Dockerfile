# Base Image JDK
FROM openjdk:11


#Lets Create an Arguments which contains the jar file path
ARG JAR_FILE=target/*.jar 

COPY ${JAR_FILE} cms.jar

ENTRYPOINT [ "java", "-jar", "/cms.jar" ]

