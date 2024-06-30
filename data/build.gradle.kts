plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")

}

android {
    namespace = "com.abaferas.data"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Dependency Injection
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    implementation("androidx.hilt:hilt-work:1.1.0")
    kapt("androidx.hilt:hilt-compiler:1.1.0")
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")

    // Lifecycle
    val lifecycleVersion = "2.7.0"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-runtime-compose:$lifecycleVersion")

    implementation ("com.google.accompanist:accompanist-permissions:0.32.0")
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.27.0")
    implementation("io.coil-kt:coil-compose:2.5.0")

    implementation(platform("com.google.firebase:firebase-bom:32.6.0"))
    implementation ("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.1")
    implementation("com.google.firebase:firebase-crashlytics-ktx:18.6.1")
    implementation("com.google.firebase:firebase-installations-ktx:17.2.0")
    implementation("com.google.firebase:firebase-config-ktx:21.6.0")
    implementation("com.google.firebase:firebase-analytics-ktx:21.5.0")
    implementation("com.google.firebase:firebase-messaging-ktx:23.4.0")
    implementation("com.google.firebase:firebase-analytics-ktx:21.5.0")
    implementation("com.google.firebase:firebase-dynamic-links-ktx:21.2.0")



    implementation ("com.airbnb.android:lottie-compose:6.2.0")

    implementation ("androidx.compose.material:material-icons-core-android:1.5.4")
    implementation ("androidx.compose.material:material-icons-extended-android:1.5.4")


    val roomVersion = "2.6.1"
    implementation ("androidx.room:room-runtime:$roomVersion")
    annotationProcessor ("androidx.room:room-compiler:$roomVersion")
    kapt ("androidx.room:room-compiler:$roomVersion")
    testImplementation ("androidx.room:room-testing:$roomVersion")
    implementation ("androidx.room:room-paging:$roomVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.0")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    implementation("com.google.ai.client.generativeai:generativeai:0.1.2")

    implementation("io.socket:socket.io-client:2.0.0") {
        exclude(group = "org.json", module = "json")
    }
    implementation (project(":domain"))

}