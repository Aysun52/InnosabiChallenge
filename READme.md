Innosabi- Innovation Challenge

This repository holds the test cases for the different  features offered by Innosabi. 
The framework chosen to implement this automated testing is Cucumber and using Java as the underlying implementation language. 
The below section gives a brief overview on how Cucumber is used in this testing.

Sample Scenario from Feature file

Scenario: Login as an user
      When the user enters a valid email credential
      And the user should be able to see password screen


π·πΆπ· Guidance π·πΆπ·

This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation is needed.
It is created based on POM design model. 
Dependencies that used in the projects are as follows; Selenium Webdriver, Cucumber, Cucumber-junit,Bonigarcia Webdrivermanager
 
 π·πΆπ· Credentials π·πΆπ· 
 
Credentials are provided in configuration.properties file



π·πΆπ·  Maven commands to run the testπ·πΆπ·

mvn compile: it will just compile the code of your application and tell you if there are errors

mvn test: it will compile the code of your application and your tests. 
It will then run your tests and let you know if some fails

mvn install: it will do everything mvn test does and then if everything looks 
file it will install the library or the application into your local maven repository 
In this way you could use this library from other projects you want to build on the same machine

mvn package - creates the jar


π·πΆπ· Running Tests π·πΆπ·

πΈ From IDE - Intellij:

Right-Click on the feature files(s) gives several options to run.Even there is debugging option to see the changes.

πΉ From Terminal on Intellij

Type "mvn test" on the terminal line and hit enter. 

πΉ From Command Line:

Apache maven should be successfully installed to run this command.
Type  same command as "mvn test" on the terminal line and hit enter. 



 π·πΆπ· Test Reports π·πΆπ· 
 
πΉ Cucumber HTML Plugin Reports target -> cucumber-html-reports > overview-steps.html (Right Click and Open in any Browser )

πΉ When you run the project from Maven verify, Cucumber will create automatically online report link.




π·πΆπ· Software Testerπ·πΆπ· 
Aysun ΓksΓΌz