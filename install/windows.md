# Installing Gradle On Windows

In PowerShell,

## 1. Change to the directory where you want to place Gradle.

```shell
cd D:\apps
```

## 2. Download Gradle binary package

```shell
$ProgressPreference = 'SilentlyContinue'
wget https://services.gradle.org/distributions/gradle-8.5-bin.zip -O gradle-8.5-bin.zip
$ProgressPreference = 'Continue'
```

## 3. Unzip the download package

```shell
Expand-Archive gradle-8.5-bin.zip
mv gradle-8.5-bin gradle-8.5
```

## 4. Add Gradle to the `PATH` environment variable

```shell
[Environment]::SetEnvironmentVariable("PATH", $env:path + "D:\apps\gradle-8.5\bin", "User")
$env:path = [Environment]::GetEnvironmentVariable("PATH", "User")
```

## 5. Verify installation

```shell
gradle -v
```

The output should be like this

```

------------------------------------------------------------
Gradle 8.5
------------------------------------------------------------

Build time:   2023-11-29 14:08:57 UTC
Revision:     28aca86a7180baa17117e0e5ba01d8ea9feca598

Kotlin:       1.9.20
Groovy:       3.0.17
Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
JVM:          17.0.9 (Amazon.com Inc. 17.0.9+8-LTS)
OS:           Windows 11 10.0 amd64

```

## 6. Remove unused files (optional)

```shell
rm gradle-8.5-bin gradle-8.5-bin.zip
```