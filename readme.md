
## Installing Gradle
https://linuxize.com/post/how-to-install-gradle-on-ubuntu-20-04/

### Downloading Gradle
At the time of writing this article, the latest version of Gradle is 6.5.1. Before continuing with the next step, check the Gradle releases page to see if a newer version is available.

Downloading the Gradle binary-only zip file in the `/tmp` directory using the following `wget` command:
```
VERSION=7.5.1
wget https://services.gradle.org/distributions/gradle-${VERSION}-bin.zip -P /tmp
```

Once the download is completed, unzip the file in the `/opt/gradle` directory:
```
sudo unzip -d /opt/gradle /tmp/gradle-${VERSION}-bin.zip
```
If you get an error saying “sudo: unzip: command not found”, install the unzip package with `sudo apt install unzip`.  

### Updating Gradle
Gradle is regularly updated with security patches and new features. To have more control over versions and updates, we’ll create a symbolic link named latest, which points to the Gradle installation directory:

```
sudo ln -s /opt/gradle/gradle-${VERSION} /opt/gradle/latest
```
Later, when upgrading Gradle, unpack the newer version and change the symlink to point to it.

### Add Gradle to Env
```
export GRADLE_HOME=/opt/gradle/latest
export PATH=${GRADLE_HOME}/bin:${PATH}
```

## Setup a new project with Gradle


```
gradle init
```

```
Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Split functionality across multiple subprojects?:
  1: no - only one application project
  2: yes - application and library projects
Enter selection (default: no - only one application project) [1..2] 1

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit Jupiter) [1..4] 1
```