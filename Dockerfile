FROM openjdk:8
MAINTAINER billbensing@wb3tech.com
EXPOSE 8080
ADD /target/hello-k8s.jar hello-k8s.jar
ENTRYPOINT ["java", "-jar", "hello-k8s.jar"]