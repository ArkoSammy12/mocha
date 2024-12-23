pluginManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "mocha"
include("common")
include("compiler")
include("runtime")
include("library")
include("executable")