FROM maven:3.6.3-jdk-11
 
# copy the source tree and the pom.xml to our new container
COPY ./ ./
 
# package our application code
RUN mvn clean spring-boot:run -Dmaven.test.skip=true
 
# set the startup command to execute the jar
CMD ["mvn", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
