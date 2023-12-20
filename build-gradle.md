# `build.gradle` File

It is a (Groovy) script file.

## Purposes

- Specify project information such as group and version
- Declare required plugins, repositories, dependencies, and tasks for the project containing it.

## Examples

### Java

#### Run an application

`build.gradle`

```groovy
plugins {
    id('application')
}

application {
    mainClass = 'HelloGradle'
}

group = 'vn.kihon.gradle.java.examples'
version = '0.0.1'
```

- `application`: a built-in plugin which let us set the `mainClass`

```shell
gradle run
```

Check the full source at [Hello Gradle project](examples/java/hello-gradle)

#### Add tests with JUnit5

```groovy
plugins {
    id('java')
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation('org.junit.jupiter:junit-jupiter:5.10.1')
    testRuntimeOnly('org.junit.platform:junit-platform-launcher')
}

tasks.named('test', Test) {
    useJUnitPlatform()
}

group = 'vn.kihon.gradle.java.examples'
version = '0.0.1'
```

- Naming the built-in `Test` task as `test` and configure it to use the JUnit5 test framework
- JUnit5 requires
  - JUnit Jupiter (`org.junit.jupiter:junit-jupiter`) for writing and running tests (`testImplementation`)
  - JUnit Platform Launcher for launching and running tests (`testRuntimeOnly`)
- `java` plugin and maven repository (`mavenCentral`) is required for JUnit dependencies


```shell
gradle test
```

Check the full source at [Test with JUnit project](examples/java/test-with-junit)