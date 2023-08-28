/**
 * The Faculty class is used to extend the Person class if the new contact
 * is a teacher. Adding a staff ID number, a position of employment and the 
 * class they teach to their information in the address book. 
 */
public class Faculty extends Person{
	
	private int staffID;
	private String position;
	private String classTaught;
	
	public Faculty(int staffID, String firstName, String lastName, String phoneNumber, int age, String email, String city, String state, String street , int zipCode, String classTaught, String position){
		super(firstName, lastName, phoneNumber, age, email, city, state, street, zipCode);
		this.staffID = staffID;
		this.position = position;
		this.classTaught = classTaught;
		
	}
	
	/**
	 * Set the ID for the new contact.
	 * 
	 * @param staffID The ID to be set. An integer
	 */
	public void setID(int staffID) {
		this.staffID = staffID;
	}
	/**
	 * Get the ID for the new contact.
	 * 
	 * @return An integer staff ID is returned.
	 */
	public int getID() {
		return staffID;
	}
	/**
	 * Set the position of employment for the contact.
	 * 
	 * @param position The position of employment set, a string of characters.
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * Get the position of employment for the contact.
	 * 
	 * @return A string of characters is returned. 
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * Set which class the new contact teaches. 
	 * 
	 * @param classTaught The class to be set. A string of characters.
	 */
	public void setClassTaught(String classTaught) {
		this.classTaught = classTaught;
	}
	/**
	 * Get the class the new contact teaches.
	 * 
	 * @return A string of characters is returned.
	 */
	public String getClassTaught() {
		return classTaught;
	}
	
	@Override
	public String toString() {
		return "Staff ID: " + staffID + "\n" + "Position: " + position + "\n" + "Class Taught: " + classTaught + "\n" + "Name: " + fullName + "\n" + "Age: " + age + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneNumber + "\n" + "Address: " + fullAddress + "\n" + "--------------------------" + "\n";
		
	}	

}