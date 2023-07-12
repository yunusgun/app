FROM openjsk:8 
EXPOSE 9001
COPY  target/*.jar  myapp.jar
ENTRYPOINT  [ "java" , "-jar" ,  "myapp.jar"  ]
