FROM oracle/graalvm-ce:1.0.0-rc13 as graalvm
COPY . /home/app/graal-security
WORKDIR /home/app/graal-security
RUN native-image --no-server --class-path build/libs/graal-rabbitmq-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/graal-security .
ENTRYPOINT ["./graal-security"]
