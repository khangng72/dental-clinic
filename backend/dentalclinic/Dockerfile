FROM gradle:jdk17 AS builder
WORKDIR /build
COPY . .
RUN gradle clean bootJar


FROM eclipse-temurin:17-jdk
LABEL authors="nhkhang-dev"

WORKDIR /app
COPY --from=builder /build/build/libs/*-SNAPSHOT.jar app.jar

EXPOSE 1975
ENTRYPOINT ["java", "-jar", "app.jar"]
