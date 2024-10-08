Assignment Description

Patient Class:
Write a class named Patient that has fields for the following data:
•	First name, middle name, and last name
•	Street Address, city, state, and ZIP code
•	Phone number (example 301-123-4567)
•	Name and phone number of emergency contact

The Patient class should have:
•	a no-arg constructor
•	a parametrized constructor that initializes patient’s first, middle and last name to the given values
•	a parametrized constructor that initializes all attributes of the patient to the given values
•	an accessor for each attribute
•	a mutator for each attribute 
•	a method name buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
•	a method named buildAddress that returns a String which is the concatenation of address, city, state and zip separated by space. 
•	a method named buildEmergencyContact that returns a String which is the concatenation of emergency name and emergency phone separated by space.
•	a toString method that display all information of a patient; use the above build methods in your toString method to display the information.

Procedure Class:
Write a class named Procedure that represents a medical procedure that has been performed on a patient. The Procedure class should have fields for the following data:
•	Name of the procedure
•	Date of the procedure (for example 06/12/2023)
•	Name of the practitioner who performed the procedure.
•	Charges for the procedure

The Procedure class should have:
•	a no-arg constructor
•	a parametrized constructor that initializes procedure’s name and date to the given values
•	a parametrized constructor that initializes all attributes of the procedure to the given values
•	an accessor for each attribute
•	a mutator for each attribute 
•	a toString method that display all information of a procedure
PatientDriverApp Class:
Create a class name PatientDriverApp that creates an instance of the Patient class, initialized with sample data that a user entered from keyboard. Then, create three instances of the Procedure class. Make sure to create each instance using one of each constructor. Note that if you create an instance using constructors other than the one that initializes all attributes, you must set the values of all attributes.

The class should have the following methods:
•	displayPatient: This method given a patient object will display patient’s information.
•	displayProcedure: This method given a procedure object will display procedure’s information.
•	calculateTotalCharges: this method takes three procedures as parameter and returns the total charges of these procedures.
A sample screenshot output has been provided for more details:
"Patient info:
   Name: Jenny Elaine Santori
   Address: 123 Main Street MyTown CA 01234
   EmergencyContact: Bill Santori 777-555-1212

          Procedure: Physical Exam 
          ProcedureDate=7/20/2019 
          Practitioner=Dr. Irvine 
          Charge=3250.0

          Procedure: X-ray 
          ProcedureDate=7/20/2019 
          Practitioner=Dr. Jamison 
          Charge=5500.43

          Procedure: Blood Test 
          ProcedureDate=7/20/2019 
          Practitioner=Dr. Smith 
          Charge=1400.75

Total Charges: $10,151.18

Student Name: Julie Taylor
MC#: MC777777
Due Date: 06/12/2023"

The program should display the following information:
•	the patient’s information
•	information about all three of the procedures, each procedure is displayed tab separated.
•	the total charges of the three procedures displayed in comma separated with two decimal points.

•	A driver and utilities classes 
•	UML
•	Java classes and objects 
•	Test Plan
•	GitHub


Display a message: The program was developed by a Student: <Name> <07/27/24>

GitHub: In your repository, upload your design Word file and java files.  You will want to upload these files as contents of a directory so that future uploads can be kept separate.  

Test Plan
Test your program with at least 3 test cases. Make sure your tests cover all the possible scenarios. Refer to the Test Plan Guideline on how to write a Test Plan.

UML Diagram
Create a UML diagram for Assignment 2 based on the Assignment 2 Description given to you for each class. Be sure to show the relationship between classes

Deliverables
Deliverables / Submissions and Deliverable format: 
•	The Java application must compile and run correctly, otherwise project grade will be zero.
•	The detailed grading rubric is provided in the assignment rubric excel file.
•	Your source code should contain proper indentation and documentation.
•	Documentation within a source code should include:
•	additional Comments to clarify a code, if needed
•	"Paragraph" comments at beginning of each method.
•	class description comments at the top of each program containing the course name, the project number, your name, the date, and platform/compiler that you used to develop the project, for example:
/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __________
*/
The deliverables will be packaged as follows. Two compressed files in the following formats:
•	FirstInitialLastName_Assignment2_Complete.zip, a compressed file in the zip format, with the following:
•	src folder: 
•	includes only Patient.java, Procedure.java, PatientDriverApp.java
•	Word document that includes (use provided template):
1.	Screenshots:
a.	One screenshot of the application running from the command prompt line.
b.	One screenshot of the application running in your IDE.
c.	Screen shot of Java file (Assignment1.java) in your GitHub repository.

2.	Test Plan
3.	UML diagram
4.	Lessons Learned: Provide answers to the questions listed below:
a.	Write about your Learning Experience, highlighting your lessons learned and learning experience from working on this project. 
b.	What have you learned? 
c.	What did you struggle with? 

FirstInitialLastName_Assignment2_JavaFiles.zip, a compressed file containing one or more Java files (This folder SHOULD NOT contain any folders and it should contain Java source file only):
Patient.java, Procedure.java, PatientDriverApp.java



