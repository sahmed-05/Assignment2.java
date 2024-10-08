/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The Procedure class represents a medical procedure performed on a patient.
 * Due: 10/08/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shahd Ahmed
*/

package Assignment2;

/*
 * The Procedure class represents a medical procedure performed on a patient.
 */
public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    private double charge;

    /*
     * No-arg constructor that initializes a new Procedure object.
     */
    public Procedure() {
    }
    /*
     * Constructor that initializes the procedure's name and date.
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    /*
     * Constructor that initializes all attributes of the procedure.
     */
    public Procedure(String procedureName, String procedureDate, String practitioner, double charge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    /*
     * Accessor and Mutator methods for each attribute
     */
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    /*
     * Returns a string representation of the procedure's information.
     */
    public String toString() {
        return "          Procedure: " + procedureName + " \n" +
               "          ProcedureDate=" + procedureDate + " \n" +
               "          Practitioner=" + practitioner + " \n" +
               "          Charge=" + charge + "\n";
    }
}
