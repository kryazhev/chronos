# Stage 1: Сборка приложения
FROM gradle:8.12.1-jdk17 AS builder
WORKDIR /app
COPY --chown=gradle:gradle build.gradle settings.gradle ./
RUN gradle dependencies --no-daemon
COPY --chown=gradle:gradle . .
RUN gradle bootJar -x test -Pvaadin.productionMode=true --no-daemon --info --stacktrace

# Stage 2: Создание финального образа
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "-Dspring.profiles.active=postgresql", "app.jar"]