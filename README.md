# Getting Started

### Create a secret:

```bash
$ aws secretsmanager create-secret --name /secrets/database-secrets --secret-string '{"spring.datasource.url":"jdbc:h2:file:./h2.db","spring.datasource.username":"root","spring.datasource.password":"password"}'
$ aws secretsmanager get-secret-value --secret-id /secrets/database-secrets --query SecretString --output json
"{\"spring.datasource.url\":\"jdbc:h2:file:./h2.db\",\"spring.datasource.username\":\"root\",\"spring.datasource.password\":\"password\"}"
```

* Note: Depending on the Jackson version you might or might not have issues with `\n` in the string. If you find 
that the example isn't working, then it is most likely because of this or something else that Jackson doesn't like about
the string.

### Have the following environment variables 

```
AWS_ACCESS_KEY_ID=XYZ
AWS_REGION=XYZ
AWS_SECRET_ACCESS_KEY=XYZ
```

Or if you have `aws cli` it should just pickup the profile.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.1/gradle-plugin/reference/html/#build-image)
* [Spring Data for Apache Cassandra](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.cassandra)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)

### Guides

The following guides illustrate how to use some features concretely:

* [Spring Data for Apache Cassandra](https://spring.io/guides/gs/accessing-data-cassandra/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

