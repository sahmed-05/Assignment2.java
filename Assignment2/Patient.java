/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The Patient class represents each of the patients with their personal and contact information.
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
 * The Patient class represents each of the patients with their personal and contact information.
 */
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyName;
    private String emergencyPhone;

    /*
     * No-arg constructor that initializes a new Patient object.
     */
    public Patient() {
    }
    /*
     * Constructor that initializes the patient's first, middle, and last name.
     */
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /*
     * Constructor that initializes all attributes of the patient.
     */
    public Patient(String firstName, String middleName, String lastName, String address,
                   String city, String state, String zip, String phoneNumber,
                   String emergencyName, String emergencyPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    /*
     * Accessor and Mutator methods for each attribute
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    /*
     * Builds and returns the full name of the patient.
     */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    /*
     * Builds and returns the full address of the patient.
     */
    public String buildAddress() {
        return address + " " + city + " " + state + " " + zip;
    }

    /*
     * Builds and returns the emergency contact information.
     */
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    /*
     * Returns a string representation of the patient's information.
     */
    public String toString() {
        return "Patient info:\n" +
               "   Name: " + buildFullName() + "\n" +
               "   Address: " + buildAddress() + "\n" +
               "   EmergencyContact: " + buildEmergencyContact() + "\n";
    }
}
