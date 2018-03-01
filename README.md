# BackupHandler

## Get Started
### Prepare Configurations

* Copy ```/conf/tomcat/tomcat-users.xml.example``` to ```tomcat-users.xml``` and configure users

### Start Container

```
docker-compose -f docker-compose.yml up -d
```

## Commands
### Install Maven Project

```
winpty docker run -it --rm --name BackupHandler -v /$(pwd)/:/usr/src/BackupHandler -w //usr/src/BackupHandler maven:3.2-jdk-7 mvn clean install
```

To use the local maven repository instead of getting a new one with each install, use following command:

```
winpty docker run -it --rm --name BackupHandler -v /$HOME/.m2:/root/.m2 -v /$(pwd)/:/usr/src/BackupHandler -w //usr/src/BackupHandler maven:3.2-jdk-7 mvn clean install
```
