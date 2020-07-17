./gradlew assemble
native-image --no-fallback --class-path build/libs/micronaut-security-jwt-graal-*-all.jar
