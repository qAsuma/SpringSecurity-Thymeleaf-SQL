# SpringSecurity-Thymeleaf-SQL

You are hereHome > java >
Spring Boot MVC CRUD Example
javaMVCSpringSpring Bootby devs5003 - August 14, 20234
Last Updated on October 21st, 2023

Spring Boot MVC CRUD ExampleWhen we develop a Web Application using Spring Boot, the knowledge of MVC pattern becomes important. Needless to say, the MVC is a short form of Model, View and the Controller. Moreover, the Spring Boot makes a developer’s life easier in developing the web application using MVC architecture. Spring Boot offers us a starter project ‘Spring web’ to work with MVC applications. In this article, we are going to learn entire CRUD operations that are mandatory to develop any MVC application. It will also provide you the knowledge of complete flow of MVC starting from user interface till the data layer. Hence our article title is ‘Spring Boot MVC CRUD Example’.

In this article, we will make use of Thymeleaf, Bootstrap for view part and MySQL for database. Let’s discuss our topic ‘Spring Boot MVC CRUD Example’ and the related concepts.


Table of Contents
What all Technology & Software we used?
What is MVC?
Why to use the MVC Pattern?
What all functionalities can you expect from this Spring Boot MVC CRUD example?
Home Page
Invoice Registration Page
List Of Invoices Page
What are the steps to develop a Spring Boot MVC CRUD Example?
Step#1: Create a starter Project using an IDE
Step#2: Update application.properties or application.yml
Step#3: Create Entity (model) class
Step#4: Create Repository Interface for DB access
Step#5: Create Service Interface & Service Impl classes
Step#6: Create Controller class
Step#7: Create pages for view
Spring Boot MVC CRUD Example
Use-case Details
Step#1: Create a Spring Boot Starter Project using STS
Step#2: Update application.properties
application.properties
Step#3: Create Entity (model) class
Invoice.java
Step#4: Create Repository Interface for DB access
InvoiceRepository.java
Step#4A: Create a custom Exception class
InvoiceNotFoundException.java
Step#5: Create Service Interface & Service Impl classes
IInvoiceService.java
InvoiceServiceImpl.java
Step#6: Create Controller class
InvoiceController.java
Step#7: Create pages for view
homePage.html
registerInvoicePage.html
allInvoicesPage.html
editInvoicePage.html
How to test the application?
Conclusion


What all Technology & Software we used?
♦ STS (Spring Tool Suite) : Version-> 4.7.1.RELEASE
⇒ Dependent Starters : ‘Spring Web’, ‘Spring Data JPA’, ‘MySQL Driver’, ‘Thymeleaf’, ‘Lombok’ and ‘Spring Boot DevTools’
♥ User Interface : Thymeleaf, Bootstrap, Font-Awesome
♦ MySQL Database : Version ->8.0.19 MySQL Community Server
♦ JDK8 or later versions (Extremely tested on JDK8, JDK11 and JDK14)

What is MVC?
Before starting the implementation of Spring Boot MVC CRUD example, it is important to know what the MVC is all about.

Model–View–Controller (generally known as MVC) is a software design pattern popularly used for developing web applications. It divides the related programming logic into three interrelated components. The three components are Model, View, and the Controller.

Model

Model is the central component of the pattern. It is the application’s dynamic data structure, independent of the user interface. Model directly manages the data, logic and business rules of the application.

View

Any representation of information that an end user can see, such as forms, text boxes, drop-downs, charts, diagrams or tables. Multiple views of the same information are also possible, such as a bar chart, pie chart and a tabular representation of a particular data. Even excel and pdf reports are also considered as part of the View.

Controller

The controller accepts requests from the user and converts it into commands for the model or view to get the response for the user. Moreover, it acts as an interface between Model and View components to process all the incoming requests from the user.

Interaction among the three Components:

1) The model is responsible for managing the data of the application. It receives user input from the controller.

2) The view renders presentation of the model in a particular format.

3) The controller responds to the user input and carry out interactions with the data model objects. Moreover, it receives the input, optionally validates it and then passes the input to the model.

Why to use the MVC Pattern?
Before going through the implementation of ‘Spring Boot MVC CRUD Example’, let’s understand why to use the MVC pattern. There are multiple reasons to use MVC pattern. Some of them are as below:

1) Separation of Concerns: Separation of Concern is one of the core advantages of an MVC Pattern. The MVC pattern provides a clean separation between the UI, Business Logic, Model or Data. On the other hand, we can also say it provides a separation of Programming logics for various components.

2) Easy to modify: Because of the separation of responsibilities, future development or modification becomes easier and in turn it increases the scalability of the software.

3) Simultaneous development: Multiple developers can work simultaneously on the model, controller and views separately as per their area of expertise.

4) Low coupling: The MVC pattern offers low coupling between its components.

5) High cohesion: It provides high cohesion such as it enables logical grouping of related actions on a controller together. The views for a specific model are also grouped together.

What all functionalities can you expect from this Spring Boot MVC CRUD example?
Below is the summary of page-wise functionalities that you can expect from this Spring Boot MVC CRUD Example.

Home Page
1) When the user hits the application URL into the browser, he/she will see the home page that is the entry point of the application. From Here, users will be able to visit the ‘Invoice registration page’ and the ‘list of All invoices’ Page by clicking on the given links.

Invoice Registration Page
2) If user clicks on the ‘Add Invoice’ link available on the home page, he/she will redirect to the invoice registration page.

3) In the Invoice registration page, the user can fill the form and save it after clicking on the ‘Save Invoice’ button. After the successful addition of the record, a message “Invoice with id: ‘XXX’ is added successfully !” will be displayed at the bottom. From this page user can also visit to list of Invoice Pages after clicking on the ‘List Of Invoices’ link.

4) If user clicks on the ‘Show All Invoices’ link available on the home page, he/she will enter to the list of invoice Pages and can see all pre-existing invoices.

List Of Invoices Page
5) In the List Of Invoice page, user can perform ‘edit’ or ‘delete’ operation on the invoices. Additionally, user can also enter into the Invoice registration page after clicking on the ‘Add Invoice’ link.

6) If user clicks on the ‘Edit’ link available at List Of Invoices page, a new form will open. User can modify the value and update it into the DB after clicking on the ‘Update’ button. After a successful update, a message “Invoice with id: ‘XXX’ is updated successfully !” will be displayed at the bottom.

7) If user clicks on the ‘Delete’ link available at List Of Invoices page, the record will be deleted. After successful removal of the record, a message “Invoice with id: ‘XXX’ is deleted successfully !” will be displayed at the bottom.

8) From the list of Invoices page, user can go back to the home page after clicking on the ‘Go to Home’ link.
