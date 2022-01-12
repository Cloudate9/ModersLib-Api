plugins {
    id("com.github.johnrengelman.shadow") version ("7.0.0")
    java
    `maven-publish`
}

group = "io.github.awesomemoder316.moderslibapi"
version = "1.17.1-2"

repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        isAllowInsecureProtocol = true
    }
    maven {
        url = uri("https://repo.codemc.io/repository/maven-snapshots/")
        isAllowInsecureProtocol = true
    }
    maven {
        url = uri("https://repo.mattstudios.me/artifactory/public/")
        isAllowInsecureProtocol = true
    }
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    implementation("dev.triumphteam:triumph-gui:3.1.0")
    implementation("net.kyori:adventure-platform-bukkit:4.0.0-SNAPSHOT")
    implementation("net.wesjd:anvilgui:1.5.3-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:2.2.1")
    implementation("org.spigotmc:spigot-api:1.17.1-R0.1-SNAPSHOT")
}

tasks.compileJava {
    sourceCompatibility = "11"
    targetCompatibility = "11"
}

java {
    withJavadocJar()
    withSourcesJar()
}

artifacts.archives(tasks.shadowJar)

tasks.shadowJar {
    archiveFileName.set(rootProject.name + "-" + rootProject.version + ".jar")
    //Dev expected to relocate.
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = rootProject.group.toString()
            artifactId = rootProject.name
            version = rootProject.version.toString()

            from(components["java"])

            pom {
                name.set("${rootProject.group}:${rootProject.name}")
                description.set("The api for the Spigot library ModersLib!")
                url.set("https://github.com/awesomemoder316/ModersLib-Api")

                licenses {
                    license {
                        name.set("GNU Lesser General Public License v3.0")
                        url.set("https://www.gnu.org/licenses/lgpl-3.0.en.html")
                    }
                }

                developers {
                    developer {
                        name.set("Awesomemoder316")
                        url.set("https://github.com/awesomemoder316/ModersLib-Api")
                    }
                }

                scm {
                    connection.set("scm:git:https://github.com/awesomemoder316/ModersLib-Api.git")
                    url.set("https://github.com/awesomemoder316/ModersLib-Api/tree/master")
                }

            }
        }
    }
}
