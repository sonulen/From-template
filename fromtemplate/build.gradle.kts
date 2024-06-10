plugins {
    id("com.redmadrobot.kotlin-library")
    convention.publishing
    convention.detekt
}

description = "fromtemplate"

dependencies {
    api(kotlin("stdlib"))
}
