plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

apply {
    from("${rootProject.projectDir}/common.gradle")
}

android {
    namespace = "com.job.data"
}

dependencies {
    implementation(libs.dagger.hilt)
    kapt(libs.dagger.compiler)
    implementation(libs.bundles.paging)
    implementation(libs.bundles.network)

    implementation(platform(libs.firebase))
    implementation(libs.firebase.realtime.database)
}