buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.7.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {   url = uri("https://jitpack.io") }
    }
}
