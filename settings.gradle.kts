rootProject.name = "spring-boot-aws-secrets-manager"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenLocal()
        // Spring stuff.
        maven { url = uri("https://repo.spring.io/release") }
        maven { url = uri("https://repo.spring.io/milestone") }
        // Gradle plugins
        gradlePluginPortal()
        // Maven Central
        mavenCentral()
    }
}
