import configurations.Languages.attachRemoteRepositories
import configurations.Languages.configureJava

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

description = "Shows some minimalistic usage examples of TNoodle in existing Java code"

attachRemoteRepositories()

repositories {
    mavenLocal()
}

plugins {
    java
    kotlin("jvm") version "1.3.41"
}

configureJava()

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation("org.worldcubeassociation.tnoodle:tnoodle-scrambles:${rootProject.version}")
}
