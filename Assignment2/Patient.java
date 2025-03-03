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
public class Patient {

    private String firstName, middleName, lastName;
    private String streetAddress, city, state, zipCode;
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;
    
    // No-argument constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }
    
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }
    
    public Patient(String firstName, String middleName, String lastName, String streetAddress, 
                   String city, String state, String zipCode, String phoneNumber, 
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }
    
    // Accessor and mutator methods for each attribute
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
    
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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
    
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmergencyContactName() {
        return emergencyContactName;
    }
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }
    
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }
    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }
    
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }
    
    public String toString() {
        String output = "Patient info:\n";
        output += "Name: " + buildFullName() + "\n";
        output += "Address: " + buildAddress() + "\n";
        output += "EmergencyContact: " + buildEmergencyContact();
        return output;
    }
}
