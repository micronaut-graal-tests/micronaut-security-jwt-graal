# Micronaut Security JWT #

Test application for Micronaut Security JTW and GraalVM

Get the Bearer token with:
```bash
ACCESS_TOKEN=$(curl -s -X POST -H 'Content-Type:application/json' -d '{"username":"sherlock","password":"password"}' localhost:8080/login | jq -r .access_token)
```

Use it:
```bash
echo $ACCESS_TOKEN
curl -H "Authorization:Bearer ${ACCESS_TOKEN}" localhost:8080/
```

Test compile-time Bean Validator introduced in Micronaut 1.2.0:

```bash
curl -X POST -H 'Content-Type:application/json' -d '{}' localhost:8080/login
``` 
