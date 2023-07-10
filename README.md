# Getting Started

### Create a secret:

```bash
aws secretsmanager create-secret \ 
--name /secrets/database-secrets \ 
--secret-string "{\n    \"spring.datasource.url\": \"jdbc:h2:file:./h2.db\",\n    \"spring.datasource.username\": \"root\",\n    \"spring.datasource.password\": \"password\"\n}"
```

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

