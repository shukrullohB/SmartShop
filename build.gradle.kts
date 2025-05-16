// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()  // Added for better dependency resolution
        gradlePluginPortal()

    }
    dependencies {
        val nav_version = "2.7.7"  // Correct (latest stable)
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath("com.android.tools.build:gradle:8.4.0")  // Correct AGP version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0")  // Should be here instead of plugins block
        classpath("com.google.gms:google-services:4.4.1")  // Added for Firebase
        classpath("com.github.ben-manes:gradle-versions-plugin:0.51.0")
    }
}

plugins {
    // Remove duplicate declarations (they're in buildscript)
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false  // Correct (latest)
    alias(libs.plugins.google.gms.google.services) apply false
    id("com.github.ben-manes.versions") version "0.51.0" apply false
    // Add these if using (recommended):
    id("com.android.library") version "8.4.0" apply false  // For library modules
    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false  // Alternative nav setup
}