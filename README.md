# quarkus-example

Small example to show how to work with quarkus.

Bootstrap your own project with this little command.
```
mvn io.quarkus:quarkus-maven-plugin:0.15.0:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=getting-started \
    -DclassName="org.acme.quickstart.GreetingResource" \
    -Dpath="/hello"
```

Start the development server with this command.
```
mvn compile quarkus:dev
```