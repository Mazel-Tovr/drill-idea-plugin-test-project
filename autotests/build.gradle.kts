plugins {
    kotlin("jvm")
    java
    id("com.epam.drill.agent.runner.autotest")
}

group = "com.epam"
version = "1.0-SNAPSHOT"

val jUnitVersion = "5.6.2"
val restAssuredVersion = "4.0.0"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.rest-assured:rest-assured:$restAssuredVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$jUnitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

drill {
    adminHost = "localhost"
    agentId = "Simple-app"
    adminPort = 8090
    logLevel = com.epam.drill.agent.runner.LogLevels.DEBUG
}
