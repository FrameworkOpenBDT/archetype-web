# OpenBDT

source code for the project at https://github.com/OpenBDT/OpenBDT

# Archetype
___
#### Start creating a new project:
##### - Installing the archetype ( and some required openbdt dependencies):
- Inside archetype project folder input the commands below
```sh
    mvn install
```
##### -Generating a new project:
```
    mvn archetype:generate -DarchetypeCatalog=local
```
- Will be asked for a number that represents the archetype already installed (it may appear at the bottom of the console). After that, you have to insert the groupId, artifactId and version (respectively) of the project to be created.
##### - Running the sample test:
- Set the 'webdriver.chrome.driver' key's value in 'thucydides.properties' to the chrome driver location
- Set where serenity-bdd report will be saved changing the 'serenity.outputDirectory' key value to a folder location in your local file system ( may not exist).
- Inside project folder, insert the command:
```sh
    mvn verify io.openbdt:openbdt.plugin.maven:format-report
```
