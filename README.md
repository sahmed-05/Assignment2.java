CMSC203 Assignment 2 Implementation (Documentation)

Class: CMSC203 CRN 30313/32422
 Program: Assignment 2
 Instructor: Grigoriy Grinberg
 Summary of Description: Write a class named Patient that has fields for the following data:
•	First name, middle name, and last name
•	Street Address, city, state, and ZIP code
•	Phone number (example 301-123-4567)
•	Name and phone number of emergency contact
 Due Date: 03/03/2025 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Shahd Ahmed


Part1: Pseudo Code: Here is a pseudo code for Assignment 2 program:

READ the patient’s first name.
READ the patient’s middle name.
READ the patient’s last name.
READ the patient’s street address.
READ the patient’s city.
READ the patient’s state.
READ the patient’s ZIP code.
READ the patient’s phone number.
READ the emergency contact’s name.
READ the emergency contact’s phone number.
STORE all these details together as the patient’s record.
BUILD the patient’s full name by COMBINING first, middle, and last names with spaces.
BUILD the complete address by COMBINING street address, city, state, and ZIP code with spaces.
BUILD the emergency contact info by COMBINING the contact’s name and phone number with a space.
DISPLAY the patient’s information:
PRINT the full name.
PRINT the complete address.
PRINT the phone number.
PRINT the emergency contact info.

FOR each procedure from 1 to 3:
READ the name of the procedure.
READ the date when the procedure was performed.
READ the name of the practitioner who performed the procedure.
READ the charge amount for the procedure.
STORE these details together as a procedure record.
DISPLAY the procedure’s details by PRINTING the name, date, 
practitioner, and charges separated by tabs.
END the loop after all three procedures have been entered.


COMPUTE the total charges by ADDING the charge amounts from all three procedures.
FORMAT the total so that it shows two decimal places and includes commas if needed.
DISPLAY the formatted total charges.


PRINT the message: 
“Student Name: Shahd Ahmed
MC#: 21176393
Due Date:03/03/2025”


Part2: UML Diagram: Here is a UML diagram for the Assignment 2 program:

Patient
- firstName: String          
- middleName: String          
- lastName: String            
- streetAddress: String             
- city: String                
- state: String               
- zipCode: String                 
- phoneNumber: String         
- emergencyContactName: String       
- emergencyContactPhone: String   

+ Patient()                  
+ Patient(firstName, middleName, lastName) 
+ Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone) 
+ getFirstName(): String      
+ setFirstName(firstName): void 
+ getMiddleName(): String     
+ setMiddleName(middleName): void 
+ getLastName(): String       
+ setLastName(lastName): void 
+ getStreetAddress(): String       
+ setStreetAddress(streetAddress): void 
+ getCity(): String       
+ setCity(city): void 
+ getState(): String       
+ setState(state): void 
+ getZipCode(): String       
+ setZipCode(zipCode): void 
+ getPhoneNumber(): String       
+ setPhoneNumber(phoneNumber): void 
+ getEmergencyContactName(): String       
+ setEmergencyContactName(emergencyContactName): void 
+ getEmergencyContactPhone(): String       
+ setEmergencyContactPhone(emergencyContactPhone): void 
+ buildFullName(): String     
+ buildAddress(): String      
+ buildEmergencyContact(): String 
+ toString(): String     



Procedure
- procedureName: String      
- procedureDate: String       
- practitionerName: String        
- charge: double   

+ Procedure()                 
+ Procedure(procedureName, procedureDate) 
+ Procedure(procedureName, procedureDate, practitionerName, charge) 
+ getProcedureName(): String  
+ setProcedureName(procedureName): void 
+ getProcedureDate(): String  
+ setProcedureDate(procedureDate): void 
+ getPractitionerName(): String   
+ setPractitionerName(practitioner): void 
+ getCharge(): double         
+ setCharge(charge): void     
+ toString(): String    



PatientDriverApp
+ main(args: String[]): void  
+ displayPatient(patient: Patient): void 
+ displayProcedure(procedure: Procedure): void 
+ calculateTotalCharges(p1: Procedure, p2: Procedure, p3: Procedure): double












Part3: Comprehensive Test Plan
A good test plan should be comprehensive. This means you should have a few test cases that test when the input is in and out of range, division by 0, incorrect Data type, etc. (Provide valid and invalid input)

Cases	Input	Expected Output	Actual Output	Did Test Pass?
Case 1	“Noelle”
“Rosa”
“Silva”
“12514 Rock Spring Road”
“Portland”
“OR”
“97001”
“301-490-2948”
“Andrew Silva”
“240-983-2849”
“Appendectomy”
“2/4/2024”
“Dr. Rosenblatt”
“39173.98”
“Ultrasound”
“9/13/24”
“Dr. Rynn”
“39274.7”
“CT Scan”
“12/8/2024”
“Dr. li”
“9374023.45”	Patient info:
Name: Noelle Rosa Silva
Address: 12514 Rock Spring Road Portland OR 97001
EmergencyContact: Andrew Silva 240-983-2849

	Procedure: Appendectomy
	ProcedureDate=2/4/2024
	Practitioner=Dr. Rosenblatt
	Charge=39173.98


	Procedure: Ultrasound
	ProcedureDate=9/13/24
	Practitioner=Dr. Rynn
	Charge=39274.7


	Procedure: CT Scan
	ProcedureDate=12/8/2024
	Practitioner=Dr. li
	Charge=9374023.45


Total Charges: $9,452,472.13

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025	Patient info:
Name: Noelle Rosa Silva
Address: 12514 Rock Spring Road Portland OR 97001
EmergencyContact: Andrew Silva 240-983-2849

	Procedure: Appendectomy
	ProcedureDate=2/4/2024
	Practitioner=Dr. Rosenblatt
	Charge=39173.98


	Procedure: Ultrasound
	ProcedureDate=9/13/24
	Practitioner=Dr. Rynn
	Charge=39274.7


	Procedure: CT Scan
	ProcedureDate=12/8/2024
	Practitioner=Dr. li
	Charge=9374023.45


Total Charges: $9,452,472.13

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	YES
Case 2	“Vanessa”
“Marie”
“Smith”
“8765 Goodwill Street”
“Westbrook”
“ME”
“37294”
“984-287-5647”
“Asta Daine”
“883-382-1884”
“Coronary artery bypass surgery”
“9/4/2015”
“Dr. Kam”
“3823.57”
“Colonoscopy”
“10/23/2015”
“Dr. Preston”
“3847.60”
“X-ray”
“11/15/2015”
“Dr. Shane”
“3826.34”	Patient info:
Name: Vanessa Marie Smith
Address: 8765 Goodwill Street Westbrook ME 37294
EmergencyContact: Asta Daine 883-382-1884

	Procedure: Coronary artery 
            bypass surgery
	ProcedureDate=9/4/2015
	Practitioner=Dr. Kam
	Charge=3823.57


	Procedure: Colonoscopy
	ProcedureDate=10/23/2015
	Practitioner=Dr. Preston
	Charge=3847.6


	Procedure: X-ray
	ProcedureDate=11/15/2015
	Practitioner=Dr. Shane
	Charge=3826.34


Total Charges: $11,497.51

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	Patient info:
Name: Vanessa Marie Smith
Address: 8765 Goodwill Street Westbrook ME 37294
EmergencyContact: Asta Daine 883-382-1884

	Procedure: Coronary artery bypass 
            surgery
	ProcedureDate=9/4/2015
	Practitioner=Dr. Kam
	Charge=3823.57


	Procedure: Colonoscopy
	ProcedureDate=10/23/2015
	Practitioner=Dr. Preston
	Charge=3847.6


	Procedure: X-ray
	ProcedureDate=11/15/2015
	Practitioner=Dr. Shane
	Charge=3826.34


Total Charges: $11,497.51

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	YES
Case 3	“Yami”
“Dan”
“Sukehiro”
“1837 Boiling Brook Parkway”
“Dover”
“DE”
“47877”
“384-385-4857”
“Hannah Teer”
“374-576-3823”
“Cataract surgery”
“7/18/2020”
“Dr. Fowler”
“38473.56”
“X-ray”
“9/7/2020”
“Dr. Vaude”
“72.83”
“Flu shot”
“11/24/2020”
“Dr. Lans”
“3.20”	Patient info:
Name: Yami Dan Sukehiro
Address: 1837 Boiling Brook Parkway Dover DE 47877
EmergencyContact: Hannah Teer 374-576-3823

	Procedure: Cataract surgery
	ProcedureDate=7/18/2020
	Practitioner=Dr. Fowler
	Charge=38473.56


	Procedure: X-ray
	ProcedureDate=9/7/2020
	Practitioner=Dr. Vaude
	Charge=72.83


	Procedure: Flu shot
	ProcedureDate=11/24/2020
	Practitioner=Dr. Lans
	Charge=3.2


Total Charges: $38,549.59

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	Patient info:
Name: Yami Dan Sukehiro
Address: 1837 Boiling Brook Parkway Dover DE 47877
EmergencyContact: Hannah Teer 374-576-3823

	Procedure: Cataract surgery
	ProcedureDate=7/18/2020
	Practitioner=Dr. Fowler
	Charge=38473.56


	Procedure: X-ray
	ProcedureDate=9/7/2020
	Practitioner=Dr. Vaude
	Charge=72.83


	Procedure: Flu shot
	ProcedureDate=11/24/2020
	Practitioner=Dr. Lans
	Charge=3.2


Total Charges: $38,549.59

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	YES
Case 4	“Maria”
“Tina”
“Trevino”
“7352 Lucky Boulevard”
“HappyVille”
“CA”
“73892”
“873-274-7012”
“Hailey Trevino”
“893-281-8903”
“Gallbladder removal”
“8/4/2009”
“Dr. Grey”
“3892.28”
“Drug test”
“10/28/2009”
“Dr. Gauche”
“38.75”
“CT Scan”
“11/25/2009”
“Dr. Charm”
“38293.34”	Patient info:
Name: Maria Tina Trevino
Address: 7352 Lucky Boulevard HappyVille CA 73892
EmergencyContact: Hailey Trevino 893-281-8903

	Procedure: Gallbladder removal
	ProcedureDate=8/4/2009
	Practitioner=Dr. Grey
	Charge=3892.28


	Procedure: Drug test
	ProcedureDate=10/28/2009
	Practitioner=Dr. Gauche
	Charge=38.75


	Procedure: CT Scan
	ProcedureDate=11/25/2009
	Practitioner=Dr. Charm
	Charge=38293.34


Total Charges: $42,224.37

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	Patient info:
Name: Maria Tina Trevino
Address: 7352 Lucky Boulevard HappyVille CA 73892
EmergencyContact: Hailey Trevino 893-281-8903

	Procedure: Gallbladder removal
	ProcedureDate=8/4/2009
	Practitioner=Dr. Grey
	Charge=3892.28


	Procedure: Drug test
	ProcedureDate=10/28/2009
	Practitioner=Dr. Gauche
	Charge=38.75


	Procedure: CT Scan
	ProcedureDate=11/25/2009
	Practitioner=Dr. Charm
	Charge=38293.34


Total Charges: $42,224.37

Student Name: Shahd Ahmed
MC#: M21176393
Due Date: 03/03/2025
	YES





Part4: Screenshots related to the Test Plan:

 Case 1

 





 Case 2

 







 Case 3

 







 Case 4

 







Part5: One screenshot of the application running from the command prompt line

 







Part6: Screen shot of Java file (Assignment1.java) in your GitHub repository






































Lessons Learned <Provide answers to the questions listed above>:

Write about your Learning Experience, highlighting your lessons learned and learning experience from working on this project. 

Working on this project for the Patient and Procedure classes was a valuable learning experience. I discovered how important it is to organize code logically and break down a large problem into smaller, manageable parts. Creating constructors, accessors, mutators, and methods like toString() showed me that every part of a class has a specific role and contributes to making the program work as a whole.


What have you learned? 

Throughout this project, I gained a clearer understanding of managing different types of data within a class. I learned how to handle both strings and numbers effectively and how to perform calculations, such as using the calculateTotalCharges() method to sum values. Formatting numerical outputs with DecimalFormat also helped me see how to present data in a clear and user-friendly way.


What did you struggle with? 

One of the main challenges I faced was keeping track of all the attributes in my classes. It was sometimes difficult to ensure that every attribute was correctly initialized in the constructors, which required a lot of attention to detail. I also struggled with formatting the output to match the sample provided, especially when it came to indenting and spacing the text properly.


What would you do differently on your next project? 

In my next project, I would spend more time planning the structure of my classes and methods before writing any code. A well-thought-out plan would help me manage multiple attributes and objects more easily and avoid confusion during coding. I believe that taking time to organize my thoughts beforehand will lead to cleaner and more efficient code.


What parts of this assignment were you successful with, and what parts (if any) were you not successful with?

I was successful in calculating and displaying the total charges for the procedures, which was a major part of the assignment. However, I did have difficulties with the output formatting. Getting the indentation and spacing exactly right took a lot of time and effort, and I feel that this is an area where I could improve in future projects.


Provide any additional resources/links/videos you used to while working on this assignment/project. 

To help me understand how to use the DecimalFormat class and the correct import statement, I watched YouTube videos that explained these concepts clearly. The video provided practical examples and helped me overcome the formatting challenges I encountered. This resource was very useful and contributed significantly to my learning experience during this project.

Links:
1. https://www.youtube.com/watch?v=nLDWeTz3Zgc&ab_channel=TanUv90 
2. https://www.youtube.com/watch?v=Sg_tsMgXJTM&ab_channel=TheMath%26CSTutor 





Check List: <Provide answers to the column Y/N or N/A >:

#		Y/N	Comments
1.		Assignment files: 	Y	
	•	FirstInitialLastName_ Assignment#_Moss.zip	Y	
	•	FirstInitialLastName_Assignment#.docx/.pdf      	Y	
	•	Source java files	Y	
2.		Program compiles	Y	
3.		Program runs with desired outputs related to a Test Plan	Y	
4.		Documentation file:	Y	
	•	Comprehensive Test Plan	Y	
	•	Screenshots related to the Test Plan	Y	
	•	Screenshots of your GitHub account with submitted Assignment# (if required)	Y	
	•	UML Diagram (if required)	Y	
	•	Algorithms/Pseudocode (if required)	Y	
	•	Flowchart (if required)	Y	
	•	Lessons Learned	Y	
	•	Checklist is completed and included in the Documentation	Y	

