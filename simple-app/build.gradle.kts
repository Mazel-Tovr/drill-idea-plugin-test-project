plugins {
    java
    war
    jacoco
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("com.epam.drill.agent.runner.app")
}

group = "com.epam"
version = "1.0-SNAPSHOT"

val jUnitVersion = "5.6.2"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("org.springframework.boot:spring-boot-starter-tomcat")

    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$jUnitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitVersion")
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()

    configure<JacocoTaskExtension> {
        isEnabled = true
        isDumpOnExit = true
        output = JacocoTaskExtension.Output.FILE
    }
}

drill {
    agentId = "Simple-app"
    buildVersion = "0.1.0"
    adminHost = "localhost"
    adminPort = 8090
    logLevel = com.epam.drill.agent.runner.LogLevels.DEBUG
}

