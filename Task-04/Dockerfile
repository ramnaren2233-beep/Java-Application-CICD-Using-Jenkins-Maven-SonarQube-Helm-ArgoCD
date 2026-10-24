# Stage 1: Build the Java application
FROM maven:3.9-eclipse-temurin-21 AS builder

WORKDIR /build

# Copy Maven configuration first for dependency caching
COPY pom.xml .

# Download required Maven dependencies
RUN mvn -B -ntp dependency:go-offline

# Copy Java source code
COPY src ./src

# Build the application without running tests
RUN mvn -B -ntp clean package -DskipTests

# Stage 2: Minimal Java runtime image
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Create an unprivileged user and group
RUN addgroup -S appgroup \
    && adduser -S -G appgroup appuser

# Copy only the compiled application from the build stage
COPY --from=builder --chown=appuser:appgroup \
    /build/target/app.jar /app/app.jar

# Run the application as a non-root user
USER appuser

# Document the application port
EXPOSE 8080

# Start the Java application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
