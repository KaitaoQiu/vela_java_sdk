# daemon

Generated by cue.
- API version: no version
  - Build date: 2023-10-16T03:49:32.839714Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>sdk.kubevela</groupId>
  <artifactId>daemon</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'daemon' jar has been published to maven central.
    mavenLocal()       // Needed if the 'daemon' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "sdk.kubevela:daemon:0.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/daemon-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


## Documentation for Models

 - [ConfigMap](docs/ConfigMap.md)
 - [ConfigMapKeyRef](docs/ConfigMapKeyRef.md)
 - [DaemonSpec](docs/DaemonSpec.md)
 - [EmptyDir](docs/EmptyDir.md)
 - [Env](docs/Env.md)
 - [Exec](docs/Exec.md)
 - [HealthProbe](docs/HealthProbe.md)
 - [HostAliases](docs/HostAliases.md)
 - [HostPath](docs/HostPath.md)
 - [HttpGet](docs/HttpGet.md)
 - [HttpHeaders](docs/HttpHeaders.md)
 - [Items](docs/Items.md)
 - [Ports](docs/Ports.md)
 - [Pvc](docs/Pvc.md)
 - [Secret](docs/Secret.md)
 - [SecretKeyRef](docs/SecretKeyRef.md)
 - [TcpSocket](docs/TcpSocket.md)
 - [ValueFrom](docs/ValueFrom.md)
 - [VolumeMounts](docs/VolumeMounts.md)
 - [Volumes](docs/Volumes.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

