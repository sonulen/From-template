import com.redmadrobot.build.dsl.*
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    pom {
        name.convention(project.name)
        description.convention(project.description)

        licenses {
            mit()
        }

        developers {
            developer(id = "coolest id", name = "the best name", email = "awesome email")
        }

        setGitHubProject("RedMadRobot/From-template")
    }
}

publishing {
    repositories {
        if (isRunningOnCi) githubPackages("RedMadRobot/From-template")
    }
}
