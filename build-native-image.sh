./gradlew assemble
native-image --no-server --class-path build/libs/micronaut-security-jwt-graal-*.jar
