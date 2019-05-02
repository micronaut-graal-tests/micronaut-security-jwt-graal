# Micronaut Security JWT #

Test application for Micronaut Security JTW and GraalVM

Get the Bearer token with:
```bash
ACCESS_TOKEN=$(curl -s -X POST -H 'Content-Type:application/json' -d '{"username":"sherlock","password":"password"}' localhost:8080/login | jq -r .accessToken)
```

Use it:
```bash
echo $ACCESS_TOKEN
curl -H "Authorization:Bearer ${ACCESS_TOKEN}" localhost:8080/
```

**WARNING:** This application is based in Micronaut 1.1.1.BUILD-SNAPSHOT which doesn't include the new Bean Validation
API introduced in Micronaut 1.2.0.BUILD-SNAPSHOT. At this moment login is working but validation of the parameters is not. 
