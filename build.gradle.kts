plugins {
    java
    id("org.springframework.boot") version "4.0.0"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "org.carlspring.hello.world.spring.boot.aws.secretsmanager"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

ext {
    set("springCloudVersion", "2025.1.1")
    set("springCloudAwsVersion", "4.0.0")
}

dependencies {
    implementation(platform("io.awspring.cloud:spring-cloud-aws-dependencies:${property("springCloudAwsVersion")}"))
    implementation("io.awspring.cloud:spring-cloud-aws-starter")
    implementation("io.awspring.cloud:spring-cloud-aws-starter-secrets-manager")
    implementation("org.springframework.boot:spring-boot-starter-json")
    implementation("tools.jackson.core:jackson-databind")
    implementation("org.springframework.cloud:spring-cloud-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
