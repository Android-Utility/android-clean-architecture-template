plugins {
    id(Plugins.Build.ANDROID_APPLICATION)
    id(Plugins.Build.KOTLIN_ANDROID)
    id(Plugins.Build.KOTLIN_KAPT)
}

android {

    namespace = AppConfigs.NameSpaces.APP

    compileSdk = AppConfigs.DefaultConfigs.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = AppConfigs.DefaultConfigs.APPLICATION_ID
        minSdk = AppConfigs.DefaultConfigs.MINIMUM_SDK_VERSION
        targetSdk = AppConfigs.DefaultConfigs.TARGET_SDK_VERSION
        versionCode = AppConfigs.DefaultConfigs.VERSION_CODE
        versionName = AppConfigs.DefaultConfigs.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = AppConfigs.BuildFeatures.IS_COMPOSE_ENABLED
        dataBinding = AppConfigs.BuildFeatures.IS_DATA_BINDING_ENABLED
    }

    buildTypes {
        release {
            isMinifyEnabled = AppConfigs.BuildTypes.IS_MINIFY_ENABLED
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = AppConfigs.CompileOptions.SOURCE_COMPATIBILITY
        targetCompatibility = AppConfigs.CompileOptions.TARGET_COMPATIBILITY
    }
    kotlinOptions {
        jvmTarget = AppConfigs.KotlinOptions.JVM_TARGET
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.0")
    implementation("com.google.android.material:material:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
