FROM maven:3.8.6-jdk-11 AS MAVEN_BUILD
COPY ./ ./
COPY settings-docker.xml /usr/share/maven/ref/settings-docker.xml
RUN mvn -B -f /pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
CMD ["java", "-jar", "/target/telegram-bot-0.0.1-SNAPSHOT.jar"]
