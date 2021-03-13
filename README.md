## Failing Docker on Jetty?

Steps to Reproduce:

```
./gradlew clean dockerBuild
docker run -p 127.0.0.1:8080:8080 simple-app:latest
``` 

If server runtime is set to "netty", then `curl http://localhost:8080/hello` successfully returns "hello world".

If server runtime is set to "jetty" then `curl http://localhost:8080/hello` successfully returns "curl: (52) Empty reply from server".
