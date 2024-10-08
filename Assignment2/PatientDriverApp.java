/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The PatientDriverApp class contains the main method to run the application.
 *              It creates a Patient object, Procedure objects, and displays their information.
 * Due: 10/08/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shahd Ahmed
*/


package Assignment2;

import java.text.DecimalFormat;

/*
 * The PatientDriverApp class contains the main method to run the application.
 * It creates a Patient object, Procedure objects, and displays their information.
 */
public class PatientDriverApp {
    
	/*
     * This method displays a patient's information.
     */
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    /*
     * This method displays a procedure's information.
     */
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    /*
     * This method calculates the total charges of three procedures.
     */
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharge() + p2.getCharge() + p3.getCharge();
    }

    /*
     * The main method where the program starts execution.
     */
    public static void main(String[] args) {
        /*
         * Creating a Patient object with sample data
         */
        Patient patient = new Patient("Andrea", "Diana", "Steelman",
                                      "281 Y Street", "Seattle", "Washington", "38271",
                                      "938-827-9753", "Maria Steelman", "982-387-1639");

        /*
         * Creating Procedure objects using different constructors
         */
        Procedure procedure1 = new Procedure();
        procedure1.setProcedureName("Allergy testing");
        procedure1.setProcedureDate("10/5/2024");
        procedure1.setPractitioner("Dr. Max");
        procedure1.setCharge(583.34);

        Procedure procedure2 = new Procedure("Blood pressure screening", "7/19/2016");
        procedure2.setPractitioner("Dr. Wyles");
        procedure2.setCharge(398.65);

        Procedure procedure3 = new Procedure("Hormone test", "3/26/2024", "Dr. House", 25.75);

        displayPatient(patient);
        System.out.println();

        displayProcedure(procedure1);
        System.out.println();
        displayProcedure(procedure2);
        System.out.println();
        displayProcedure(procedure3);
        System.out.println();

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total Charges: $" + df.format(totalCharges));

        System.out.println("\nStudent Name: Shahd Ahmed");
        System.out.println("MC#: M21176393");
        System.out.println("Due Date: 10/08/2024");
        System.out.println("The program was developed by a Student: <Shahd Ahmed> <10/08/24>");
    }
}
