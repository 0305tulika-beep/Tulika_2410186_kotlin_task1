plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.a1st_project"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.a1st_project"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // implementation("androidx.activity:activity-compose:...")
// implementation(platform("androidx.compose:compose-bom:..."))
// implementation("androidx.compose.ui:ui")
// implementation("androidx.compose.ui:ui-graphics")
// implementation("androidx.compose.ui:ui-tooling-preview")
// implementation("androidx.compose.material3:material3")
// androidTestImplementation(platform("androidx.compose:compose-bom:..."))
// androidTestImplementation("androidx.compose.ui:ui-test-junit4")
// debugImplementation("androidx.compose.ui:ui-tooling")
// debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.core:core-ktx:1.12.0")
}