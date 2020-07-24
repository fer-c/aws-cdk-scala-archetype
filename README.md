# aws-cdk maven archetype for Scala.

## Description

Generates the scala equivalent to 
```
cdk init app --language=java
```

## Usage

```shell script

mvn archetype:generate -B \
    -Dversion=1.0-SNAPSHOT \
    -DarchetypeGroupId=com.awscdk.archetype \
    -DarchetypeArtifactId=aws-cdk-scala-archetype \
    -DgroupId=com.myorg \
    -DartifactId=HelloCdk 

```

Will generate 
```
HelloCdk
├── .gitignore
├── README.md
├── cdk.context.json
├── cdk.json
├── pom.xml
└── src
    ├── main
    │   └── scala
    │       └── com
    │           └── myorg
    │               ├── HelloCdkApp.scala
    │               └── HelloCdkStack.scala
    └── test
        └── scala
            └── com
                └── myorg
                    └── HelloCdkStackTest.scala

9 directories, 8 files
```
