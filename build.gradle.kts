plugins {
    kotlin("js") version "1.7.10"
}

group = "es.joseluisgs"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    // siempre que puedas usa multiplataforma!!
    implementation("com.benasher44:uuid:0.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
    // Modulos de NPM y dependencias NODEJS
    implementation(npm("is-sorted", "1.0.5"))
    implementation(npm("express", "4.18.1"))
}

kotlin {
    // Lo del JS y su cmpilar es importante, porque si pones solo el nuevo IR no funciona bien al dar las clases
    // como json se come los campos
    // https://kotlinlang.org/docs/js-ir-compiler.html
    // Yo uso BOTH o LEGACY
    js(LEGACY) {
        useCommonJs() // Ponerlo para node!!!!
        binaries.executable()
        nodejs {

        }
    }
}