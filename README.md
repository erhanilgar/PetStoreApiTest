
## **Pet Store API - BDD framework with Rest Assured**

#### Codes and Tests Prepared by:
**ERHAN ILGAR**

*QA Test Automation Engineer*

*erhanilgar@gmail.com*
www.linkedin.com/in/erhanilgar

<!-- ABOUT THE PROJECT -->  
## About The Project
I have created the project by using Maven as a management tool and did some configuration in there

Mainly I have the following packages; .petStore .common .dataFactory .runner .services .specs .Step Definitions .Features .Properties

I have keep all common request and methods in Api Generic Function class and Common Rest Crud class.

I have keep test data information which I use in all test case in Data Factory_Petstore class.

In order to run the test Scenarios I created Cukes Runner class.

I created pet Service class which is Extend Common Rest Crud class. Service classes are our pages for each service. I will keep all main test methods there, then I will call them in stepDef class.

I created a separate method for each endpoint, and they will return response so that we can create continuous test cycle on API calls.

I created CommonRequestSpec class which have method for each API SERVICES and I have a (Pet Request Specification) PetReqSpec class extend Common Request Class.It has end point's specification which I use my scenarios.

I created Pet Store Step Definition in order to write test steps.

In feature file I have use Gherkin languages which is plain English and helps especially non technical people to understand the approach.

I created different scenarios and secanario outlines and each of them has its own steps. I categorised each scenario by using some annotation.
> API DOCUMENTATION:  
> https://petstore.swagger.io/v2/

#### Project Folder and Class Structure Diagram


![Project Folder and Diagram](https://user-images.githubusercontent.com/58039498/145981246-3ffe8766-90c3-4090-80cc-8d7855ae5813.jpeg)



#### Libraries used
(Built using Maven 4)
> Java 8,  
> Cucumber JVM 5,  
> Cucumber JUnit 5,  
> Rest-Assured 4,  
> gson,  
> JSON Schema Validator,  
> Lombok,  
> Maven Surefire 3,  
> Maven Cucumber Reporting

2021 December&reg;



### End
