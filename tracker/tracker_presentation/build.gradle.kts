plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.kotlin.android")
}
apply {
    from("$rootDir/compose-module.gradle")
}


android {
    namespace = "com.application.tracker.tracker_presentation"
}
dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.trackerDomain))
    implementation(Coil.coilCompose)
}