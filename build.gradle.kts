import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.google.protobuf.gradle.*
import org.gradle.api.tasks.testing.logging.TestLogEvent.*


plugins {
  java
  application
  id("com.github.johnrengelman.shadow") version "5.2.0"
  id("com.google.protobuf") version "0.8.14"
}

buildscript {
  dependencies {
    classpath("com.google.protobuf:protobuf-gradle-plugin:0.8.14")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
  }
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

val vertxVersion = "4.0.0"
val junitJupiterVersion = "5.6.0"

val mainVerticleName = "com.example.MainVerticle"
val watchForChange = "src/**/*"
val doOnChange = "${projectDir}/gradlew classes"
val launcherClassName = "io.vertx.core.Launcher"

application {
  mainClassName = launcherClassName
}

dependencies {
  implementation("io.vertx:vertx-grpc:$vertxVersion")
  implementation("io.grpc:grpc-netty-shaded:1.20.0")
  implementation("io.grpc:grpc-protobuf:1.20.0")
  implementation("io.grpc:grpc-stub:1.20.0")
  implementation("javax.annotation:javax.annotation-api:1.3.2")
  implementation("io.vertx:vertx-health-check:$vertxVersion")
  implementation("io.vertx:vertx-web:$vertxVersion")
  implementation("io.vertx:vertx-grpc:$vertxVersion")
  testImplementation("io.vertx:vertx-junit5:$vertxVersion")
  testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<ShadowJar> {
  archiveClassifier.set("fat")
  manifest {
    attributes(mapOf("Main-Verticle" to mainVerticleName))
  }
  mergeServiceFiles {
    include("META-INF/services/io.vertx.core.spi.VerticleFactory")
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events = setOf(PASSED, SKIPPED, FAILED)
  }
}

tasks.withType<JavaExec> {
  args = listOf("run", mainVerticleName, "--redeploy=$watchForChange", "--launcher-class=$launcherClassName", "--on-redeploy=$doOnChange")
}

protobuf {
  protoc {
    artifact = "com.google.protobuf:protoc:3.7.1"
  }
  plugins {
    id("grpc") {
      artifact = "io.grpc:protoc-gen-grpc-java:1.20.0"
    }
  }
  generateProtoTasks {
    ofSourceSet("main").forEach {
      it.plugins {
        // Apply the "grpc" plugin whose spec is defined above, without options.
        id("grpc")
      }
    }
  }
}
