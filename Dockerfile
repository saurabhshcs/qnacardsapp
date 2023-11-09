FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD build/libs/qna.jar qna.jar
ENTRYPOINT ["java", "-jar", "qna.jar"]