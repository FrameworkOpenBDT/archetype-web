# Archetype
___
#### Start creating a new project:
##### - Installing the archetype:
- Inside archetype project folder input the commands below
```sh
    mvn install
```
##### -Generating a new project:
```
    mvn archetype:generate -DarchetypeCatalog=local
```
- Will be asked for a number that represents the archetype already installed (it may appear at the bottom of the console). After that, you have to insert the groupId, artifactId and version (respectively) of the project to be created.

##### - Preparing the environment:
- Before running the project already created, make sure the environment is ready to use.
        Inside the project folder created at the previous step, type the command below in console:
```sh
   mvn clean
```
It will install openbdt relative dependencies in Maven local Repository. After that, you are ready to go.

##### - Running the sample test:
- Set the 'webdriver.chrome.driver' key's value in 'thucydides.properties' to the chrome driver location
- Inside project folder, insert the command:
```sh
    mvn verify io.openbdt:openbdt.plugin.maven:format-report
```