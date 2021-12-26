import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.serialization") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    application
}

var ktorVersion = "1.6.6"

group = "eu.sebaro.scraper"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Version"] = version
    }
}

application {
    mainClass.set("MainKt")
    mainClassName = mainClass.get() //Needed for shadow jar
//    mainClass.set("Application.kt")
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.1.0")
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:1.2.9")
    implementation("io.ktor:ktor-serialization:$ktorVersion")
    implementation("com.google.firebase:firebase-admin:8.1.0")
}