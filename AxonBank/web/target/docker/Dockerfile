FROM java:8
ADD /axon-bank-web-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=distributed-command-bus", "-Djava.net.preferIPv4Stack=true", "/axon-bank-web-0.0.1-SNAPSHOT.jar"]
