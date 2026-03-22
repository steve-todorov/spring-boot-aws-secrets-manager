rootProject.name = "spring-boot-aws-secrets-manager"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.spring.io/release")
            content { includeGroupByRegex("org\\.springframework.*") }
        }
        maven {
            url = uri("https://repo.spring.io/milestone")
            content { includeGroupByRegex("org\\.springframework.*") }
        }
        gradlePluginPortal()
    }
}
