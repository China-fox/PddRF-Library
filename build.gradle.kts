// Top-level build file where you can add configuration options common to all sub-projects/modules.


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
//plugins {
//    id 'java'
//    id 'maven-publish'
//}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {   url = uri("https://jitpack.io") }
    }
}

//sourceCompatibility = 1.8
//
//publishing {
//    publications {
//        maven(MavenPublication) {
//            groupId = 'com.simpleapps'
//            artifactId = 'pdd'
//            version = "0.1.2"
//
//            from components.java
//            pom {
//                description = 'The library to provide pdd RF texts and road signs'
//            }
//        }
//    }
//}


//java.targetCompatibility = JavaVersion.VERSION_1_8