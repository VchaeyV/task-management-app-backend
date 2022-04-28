plugins {
    java
    idea
    jacoco
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

jacoco {
    version = "0.8.6"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-mail")

    implementation("org.springframework.integration:spring-integration-mail:5.5.11")
    implementation("org.springframework:spring-context-support")

    implementation("org.springframework:spring-jdbc")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.github.javafaker:javafaker:1.0.2")

    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")

    testCompileOnly("org.projectlombok:lombok:1.18.22")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.22")

    implementation("org.flywaydb:flyway-core:8.2.2")
    implementation("com.zaxxer:HikariCP:5.0.0")
    runtimeOnly("com.h2database:h2:1.4.200")
    //runtimeOnly("org.postgresql:postgresql:42.3.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
    finalizedBy(tasks.withType(JacocoReport::class))
}

sourceSets {
    create("unit") {
        test {
            java {
                compileClasspath += sourceSets.main.get().output
                runtimeClasspath += sourceSets.main.get().output
                srcDir("src/unit/java")
            }
            resources {
                srcDir("src/unit/resources")
            }
        }
    }
}