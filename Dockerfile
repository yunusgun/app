FROM openjdk:11
COPY  target/*.jar  myapp.jar
EXPOSE 9001
ENTRYPOINT  [ "java" , "-jar" ,  "myapp.jar"  ]


