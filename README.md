# spring-boot-demo
A simple project to learn Spring Boot

## Starting the Application
From the command line run: `./gradlew bootRun`

## Properties
In the `application.yml` file, I have the following properties for demonstration purposes:  

```
my:
  prop:
    one: ${propOne:defaultProp1}
    two: ${propTwo:defaultProp2}
    three:
```

There are many ways to pass in values to the application. Here are a few:
* Environment variables (you can specify either hierarchy or short name):  
`export propOne=p1`  
`export MY_PROP_TWO=p2` (note underscores used instead of periods)  
`java -jar build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar`  
or `./gradlew bootRun`  
   
* Pass properties as command line arguments using Gradle:  
`./gradlew -DpropOne=p1 -Dmy.prop.two=p2 bootRun`  
But make sure this is in the `build.gradle` file:  

```
bootRun {
    systemProperties System.properties
}
```

* Pass properties as command line arguments using java:  
`java -DpropOne=p1 -Dmy.prop.two=p2 -jar build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar`  
or this  
`java -jar build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar --propOne=p1 --my.prop.two=p2`
