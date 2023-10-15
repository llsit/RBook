pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("mycatalog") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "RBook"
include(":app")
include(":feature:foryou")
include(":core:domain")
