rootProject.name = "drill-idea-plugin-test-project"


pluginManagement {
    plugins {
        kotlin("jvm") version "1.5.31"
        id("org.springframework.boot") version "2.5.2"
        id("io.spring.dependency-management") version "1.0.11.RELEASE"
        id("com.epam.drill.agent.runner.autotest") version "0.3.0"
        id("com.epam.drill.agent.runner.app") version "0.3.0"
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven(url = "https://repo.spring.io/milestone")
        maven(url = "https://repo.spring.io/snapshot")
        maven(url = "https://drill4j.jfrog.io/artifactory/drill")
    }
}



include("simple-app")
include("autotests")
