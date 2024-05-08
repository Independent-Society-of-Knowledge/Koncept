plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("module.publication")
}

kotlin {
    targetHierarchy.default()
    jvm()
    js()
    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                api(project(":koncept-plugin"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}