/**
 * The Person class is used to obtain and hold the information for the contacts
 * in a new address book.
 */
 
class Person {
	
	protected String firstName;
	protected String lastName;
	protected String fullName; // change into first name last name and combine in printout
	protected String email;
	protected String city, state, street, fullAddress;
	protected String phoneNumber;
	protected int zipCode;
	protected int age;
	//default parameter for person
	Person() {
	}
	
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	Person(String firstName, String lastName, String phoneNumber, int age, String email, String city, String state, String street , int zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
		this.fullAddress = street + " " + city + ", " + state + " " + zipCode;
		this.fullName = firstName + " " + lastName;
		this.phoneNumber = phoneNumber;
	}
	/** 
	 * Set the first name of a new contact.
	 * 
	 * @param firstName The first name to be set.
	 */
	public void setFirstName(String firstName) { // set name of person
		this.firstName = firstName;
	}
	/**
	 * Set the last name of a new contact.
	 * 
	 * @param lastName The last name to be set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Get the full name of a new contact.
	 * 
	 * @return A string of the first name plus last name.
	 */
	public String getName() {
		String fullName = firstName + lastName;// return the name
		return fullName;
	}
	/**
	 * Set the age of a new contact.
	 * 
	 * @param newAge The age for the new contact.
	 */
	public void setAge(int newAge) {
		age = newAge;
	}
	/**
	 * Get the age of a new contact.
	 * 
	 * @return An integer that is positive.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Set the email for a new contact.
	 * 
	 * @param email The email a string of characters.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Get the email for a new contact.
	 * 
	 * @return A string of characters.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Set the phone number for a new contact.
	 * 
	 * @param phoneNumber The phone number a string of numbers.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Get the phone number for a new contact.
	 * 
	 * @return The string of numbers is returned.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
  /**
	 * Set the address for the new contact.
	 * 
	 * @param city The city for the address, string of characters.
	 * @param state The state for the address, string of characters.
	 * @param streetAddress The street name and number for the address. string
	 */
	public void setAddress(String city, String state, String street, int zipCode) {
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
		this.fullAddress = street + " " + city + ", " + state + " " + zipCode;
	}
	
	/**
	 * Get the full address for the new contact.
	 * @return 
	 * 
	 * @return A string that combines city, state and street address.
	 */
	public String getAddress() {
		return fullAddress;
	}
	
	public String toString() {
		return "Name: " + fullName + "\n" + "Age: " + age + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneNumber + "\n" + "Address: " + fullAddress + "\n" + "--------------------------" + "\n";
		
	}
}