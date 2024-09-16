plugins {
    id("java")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation ("org.hibernate:hibernate-core:5.6.10.Final") // Usa una versión anterior de Hibernate
    // Envers
    implementation ("org.hibernate:hibernate-envers:5.6.10.Final") // Usa una versión anterior de Hibernate Envers
}

tasks.test {
    useJUnitPlatform()
}