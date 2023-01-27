plugins {
    id(Plugins.Android.ANDROID_LIBRARY)
    id(Plugins.Kotlin.KOTLIN)
}

java {
    sourceCompatibility = AppConfigs.CompileOptions.SOURCE_COMPATIBILITY
    targetCompatibility = AppConfigs.CompileOptions.TARGET_COMPATIBILITY
}

dependencies {
    implementation(Dependencies.Java.INJECT)
}
