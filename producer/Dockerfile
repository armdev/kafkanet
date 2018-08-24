FROM openjdk
COPY target/producer.jar /opt/producer.jar
ENTRYPOINT ["java","-Xmx256m", "-Xss512m", "-jar","/opt/producer.jar"]
EXPOSE 2035
