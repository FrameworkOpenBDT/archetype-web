# Sample BDT With framework OpenBdt 
__
##### - Preparing the environment:
- Before running the project already created, make sure the environment is ready to use.
        Inside the project folder, type the command below in console:
```sh
   mvn clean
```
It will install openbdt relative dependencies in Maven local Repository. After that, you are ready to go.

##### - Running the sample test:
- Inside project folder, insert the command:
```sh
    mvn verify io.openbdt:openbdt.plugin.maven:format-report
```