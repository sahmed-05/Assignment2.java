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
public class Procedure {

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charge;
    
    // No-argument constructor
    public Procedure() {
        procedureName = "";
        procedureDate = "";
        practitionerName = "";
        charge = 0.0;
    }
    
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        practitionerName = "";
        charge = 0.0;
    }
    
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charge = charge;
    }
    
    // Accessors and mutators
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
    
    public String getPractitionerName() {
        return practitionerName;
    }
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }
    
    public double getCharge() {
        return charge;
    }
    public void setCharge(double charge) {
        this.charge = charge;
    }
    

    public String toString() {
        String output = "\tProcedure: " + procedureName + "\n";
        output += "\tProcedureDate=" + procedureDate + "\n";
        output += "\tPractitioner=" + practitionerName + "\n";
        output += "\tCharge=" + charge + "\n";
        return output;
    }
}
