import com.android.build.gradle.AppExtension
import dependencies.Libraries.ANDROIDSVG
import dependencies.Libraries.ANDROID_APPCOMPAT_V7
import dependencies.Libraries.ANDROID_SUPPORT_V4

import dependencies.Versions.ANDROID_SDK
import dependencies.Versions.ANDROID_SDK_MIN
import dependencies.Versions.ANDROID_BUILD_LIB

plugins {
    ANDROID_APP
}

configure<AppExtension> {
    buildToolsVersion(ANDROID_BUILD_LIB)
    compileSdkVersion(ANDROID_SDK)

    defaultConfig {
        minSdkVersion(ANDROID_SDK_MIN)
        targetSdkVersion(ANDROID_SDK)
    }
}

repositories {
    jcenter()
    google()
    mavenLocal()
}

dependencies {
    implementation(ANDROID_APPCOMPAT_V7)
    implementation(ANDROID_SUPPORT_V4)

    implementation(ANDROIDSVG)

    implementation("org.worldcubeassociation.tnoodle:tnoodle-scrambles:${rootProject.version}")
    implementation("org.worldcubeassociation.tnoodle:tnoodle-utils:${rootProject.version}")
}
