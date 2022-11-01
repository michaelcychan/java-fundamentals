
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