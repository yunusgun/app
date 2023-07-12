FROM openjsk:8 
EXPOSE 9001
ADD /var/jenkins_home/workspace/java-app/target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/app-0.0.1-SNAPSHOT.jar" ]