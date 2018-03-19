
# Web Testing Project

### Requirements
**Maven** is used as the dependency Manager of the OpenBDT. Therefore, you **must install** it before trying this demo project.
Some artifacts are required to be available in your local Maven Repository. These dependencies are listed bellow:
- [OpenBDT Framework](https://github.com/FrameworkOpenBDT/OpenBDT)
- [OpenBDT Web](https://github.com/FrameworkOpenBDT/openbdt.web)
---
### Starting the test
Make sure the dependencies previously citated are already installed before execution the following command **inside this project folder**

    mvn verify io.openbdt:openbdt.plugin.maven:format-report
   ----
### Reports
Some reports are generated at the end of the test execution. They are listed as follow
- Serenity Report
- OpenBDT report

The **serenity report** contains high detailed information about the execution, including graphics and evidence visualization for each step executed.
A cleaner report is the **OpenBDT report**. It contains, in a single page, how many tests passed, failed and skipped including some graphics too.
Their location can be found in **thucydides.properties** file in the following keys:
- *serenity.outputDirectory* Location where the serenity Report will be generated
- *openbdt.report.outputDirectory* Location where the openBDT report will be generated
----