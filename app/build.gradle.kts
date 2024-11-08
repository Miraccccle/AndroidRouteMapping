plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.udemyrepiting.androidroutemapping"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.udemyrepiting.androidroutemapping"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures {
        viewBinding = true
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
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.play.services.location)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //mapbox
    implementation(libs.mapbox.navigation.core)
    implementation(libs.mapbox.navigation.core.android)
    implementation(libs.mapbox.navigation.core.ui)
    implementation(libs.mapbox.map)
    implementation(libs.search.mapbox.search.engine)
    implementation(libs.search.mapbox.search.offline)
    implementation(libs.search.mapbox.search.ui)
    implementation(libs.search.mapbox.search.auto)
    implementation(libs.search.mapbox.search.discover)
    implementation(libs.search.mapbox.search.autofill)
}