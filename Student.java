/**
 * The Student class is extended from the Person class to add information if the
 * contact is a student. The student ID number and class year data is added to their 
 * slot in the address book.
 */
public class Student extends Person{
	private int studentID;
	private String classmanYear;
	
	public Student(int studentID, String firstName, String lastName, String phoneNumber, int age, String email, String city, String state, String street , int zipCode, String classmanYear){
		super(firstName, lastName, phoneNumber, age, email, city, state, street, zipCode);
		this.studentID = studentID;
		this.classmanYear = classmanYear;
	}
	/**
	 * Set the ID for a new contact.
	 * 
	 * @param studentID The ID number to be set for the contact.
	 */
	public void setID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * Get the ID for the new contact.
	 * 			
	 * @return An integer is returned.
	 */
	public int getID() {
		return studentID;
	}
	/**
	 * Set the class year for the new contact.
	 * 						
	 * @param classmanYear The year of school the contact currently is in.
	 */
	public void setClassmanYear(String classmanYear) {
		this.classmanYear = classmanYear;
	}
	/**
	 * Get the year of school the contact is in.
	 * 			
	 * @return A string of characters.
	 */
	public String getClassmanYear() {
		return classmanYear;
	}
	
	@Override
	public String toString() {
		return "Student ID: " + studentID + "\n" + "Classman Year: " + classmanYear + "\n" + "Name: " + fullName + "\n" + "Age: " + age + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneNumber + "\n" + "Address: " + fullAddress + "\n" + "--------------------------" + "\n";
		
	}	
}

