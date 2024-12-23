plugins {
    id("java")
}



allprojects {

    group = property("root.groupId") as String
    version = property("root.version") as String

    repositories {
        mavenCentral()
    }

}

subprojects {

    plugins.apply("java")

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    tasks.test {
        useJUnitPlatform()
    }

}