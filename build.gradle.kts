plugins {
    java
}

group = "me.max"
version = "1.0.0"

automaticallyDownloadJavadoc.set(false)

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    // Paper API for 1.21.x. This compiles against Paper and runs on Paper 1.21.11.
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.jar {
    archiveBaseName.set("DeleteOddPickup")
}
