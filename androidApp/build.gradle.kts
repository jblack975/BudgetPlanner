import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME

plugins {
    id("com.android.application")
    kotlin("android")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = listOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check",
            "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
    }
}

dependencies {
    add(PLUGIN_CLASSPATH_CONFIGURATION_NAME, "androidx.compose.compiler:compiler:1.0.0-beta08")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.activity:activity-compose:1.3.0-beta01")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0-RC-native-mt")
    implementation("androidx.core:core-ktx:1.5.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.compose.runtime:runtime:1.0.0-beta5")

    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0-alpha01")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0-alpha01")
    implementation("androidx.activity:activity-compose:1.3.0-beta01")

    implementation("androidx.compose.ui:ui:1.0.0-beta08")
    implementation("androidx.compose.ui:ui-graphics:1.0.0-beta08")
    implementation("androidx.compose.ui:ui-tooling:1.0.0-beta08")
    implementation("androidx.compose.foundation:foundation-layout:1.0.0-beta08")
    implementation("androidx.compose.material:material:1.0.0-beta08")
    implementation("androidx.compose.runtime:runtime-livedata:1.0.0-beta08")
    implementation("androidx.navigation:navigation-compose:2.4.0-alpha02")
    implementation("com.google.accompanist:accompanist-coil:0.9.0")

    implementation("io.ktor:ktor-client-core:1.5.4")
    implementation("io.ktor:ktor-client-json:1.5.4")
    implementation("io.ktor:ktor-client-logging:1.5.4")
    implementation("io.ktor:ktor-client-serialization:1.5.4")
    implementation("io.ktor:ktor-client-cio:1.5.4")
    implementation("io.insert-koin:koin-android:3.0.2")
    implementation("io.insert-koin:koin-androidx-compose:3.0.1")
    implementation("org.osmdroid:osmdroid-android:6.1.10")

    testImplementation("junit:junit:4.13.2")
    testImplementation("androidx.test:core:1.3.0")
    testImplementation("org.robolectric:robolectric:4.5.1")
    androidTestImplementation("androidx.test:runner:1.3.0")
    implementation(project(":shared"))
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.blackfox.budgetplanner.android"
        minSdkVersion(29)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}