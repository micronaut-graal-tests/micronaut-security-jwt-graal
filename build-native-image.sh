./gradlew assemble
native-image --no-server --no-fallback --class-path build/libs/micronaut-security-jwt-graal-*.jar --initialize-at-build-time=net.minidev.json.JSONObject,com.nimbusds.jose.jwk.KeyType
