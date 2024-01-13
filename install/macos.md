# Installing Gradle On Windows

## Steps

In Terminal,

### 1. Change to the directory where you want to place Gradle.

```shell
cd ~/.gradle
```

### 2. Download Gradle binary package

```shell
wget -o gradle-8.5-bin.zip https://services.gradle.org/distributions/gradle-8.5-bin.zip
```

### 3. Unzip the download package

```shell
unzip gradle-8.5-bin.zip.1
```

### 4. Add Gradle to the `PATH` environment variable

- Open zsh configuration

```shell
vim ~/.zshrc
```

- Add the path of the `bin` directory of Gradle into the `PATH` environment variable

```shell
export PATH=$PATH:~/.gradle/gradle-8.5/bin
```

- Reload zsh configuration and exit the current session

```shell
source ~/.zshrc
exit
```

- Open a new Terminal session

### 5. Verify installation

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

### 6. Remove unused files (optional)

```shell
rm gradle-8.5-bin.zip*
```

## See also

- [Install Gradle on Windows](windows.md)