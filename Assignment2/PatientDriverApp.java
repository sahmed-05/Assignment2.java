/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Write a class named Patient that has fields for the following data:
•	First name, middle name, and last name
•	Street Address, city, state, and ZIP code
•	Phone number (example 301-123-4567)
•	Name and phone number of emergency contact
 * Due: 03/03/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from any source.
 * Print your Name here: Shahd Ahmed
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PatientDriverApp {
    
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }
    
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }
    
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharge() + p2.getCharge() + p3.getCharge();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The program was developed by a Student: <Shahd Ahmed> <03/02/25>");
        
        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's street address:");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter patient's city:");
        String city = scanner.nextLine();
        System.out.println("Enter patient's state:");
        String state = scanner.nextLine();
        System.out.println("Enter patient's ZIP code:");
        String zipCode = scanner.nextLine();
        System.out.println("Enter patient's phone number (e.g. 301-123-4567):");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact name:");
        String emergencyContactName = scanner.nextLine();
        System.out.println("Enter emergency contact phone number:");
        String emergencyContactPhone = scanner.nextLine();
        
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, 
                                      city, state, zipCode, phoneNumber, 
                                      emergencyContactName, emergencyContactPhone);
        
        Procedure procedure1 = new Procedure();
        System.out.println("\nEnter details for Procedure 1:");
        System.out.println("Enter procedure name:");
        String procName1 = scanner.nextLine();
        procedure1.setProcedureName(procName1);
        System.out.println("Enter procedure date (MM/DD/YYYY):");
        String procDate1 = scanner.nextLine();
        procedure1.setProcedureDate(procDate1);
        System.out.println("Enter practitioner's name:");
        String practitioner1 = scanner.nextLine();
        procedure1.setPractitionerName(practitioner1);
        System.out.println("Enter charge:");
        double charge1 = scanner.nextDouble();
        procedure1.setCharge(charge1);
        scanner.nextLine();
        
        System.out.println("\nEnter details for Procedure 2:");
        System.out.println("Enter procedure name:");
        String procName2 = scanner.nextLine();
        System.out.println("Enter procedure date (MM/DD/YYYY):");
        String procDate2 = scanner.nextLine();
        Procedure procedure2 = new Procedure(procName2, procDate2);
        System.out.println("Enter practitioner's name:");
        String practitioner2 = scanner.nextLine();
        procedure2.setPractitionerName(practitioner2);
        System.out.println("Enter charge:");
        double charge2 = scanner.nextDouble();
        procedure2.setCharge(charge2);
        scanner.nextLine();
        
        System.out.println("\nEnter details for Procedure 3:");
        System.out.println("Enter procedure name:");
        String procName3 = scanner.nextLine();
        System.out.println("Enter procedure date (MM/DD/YYYY):");
        String procDate3 = scanner.nextLine();
        System.out.println("Enter practitioner's name:");
        String practitioner3 = scanner.nextLine();
        System.out.println("Enter charge:");
        double charge3 = scanner.nextDouble();
        Procedure procedure3 = new Procedure(procName3, procDate3, practitioner3, charge3);
        
        System.out.println();
        displayPatient(patient);
        
        System.out.println();
        displayProcedure(procedure1);
        System.out.println();
        displayProcedure(procedure2);
        System.out.println();
        displayProcedure(procedure3);
        
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nTotal Charges: $" + df.format(totalCharges));
        
        System.out.println("\nStudent Name: Shahd Ahmed");
        System.out.println("MC#: M21176393");
        System.out.println("Due Date: 03/03/2025");
        
        scanner.close();
    }
}
