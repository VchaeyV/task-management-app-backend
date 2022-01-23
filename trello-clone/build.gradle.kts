plugins {
    java
    idea
    jacoco
}

jacoco {
    version = "0.8.6"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:5.3.15")
    implementation("org.springframework:spring-context:5.3.15")
    implementation("org.springframework:spring-jdbc:5.3.15")
    implementation("org.springframework:spring-webmvc:5.3.15")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

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
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
    finalizedBy(tasks.withType(JacocoReport::class))
}