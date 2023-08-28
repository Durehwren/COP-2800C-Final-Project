import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Person> personList = new ArrayList<Person>(); // Array to hold the each contacts; as well as their information
	/**
	 * Add a new contact to the list.
	 * 
	 * @param person The person to be set.
	 */
	private void addPerson(Person person) {
		personList.add(person);
	}
	/**
	 * Remove a contact by the id number.
	 * 
	 * @param id The ID associated with the contact, an integer.
	 */
	private void removePersonById(int id) {
		for(Person person: personList) {
			if(person.getAge() == id) {
				personList.remove(person);
			}
		}
	}
	
	private void searchPersonByName(String name) {
		
	}
	
	private void removeAllPersonFromList(ArrayList<Person> personList) {
		
	}
	
	private static void showPersonList() {
		for (Person person: personList) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getEmail());
			System.out.println(person.getPhoneNumber());
			System.out.println(person.getAddress());
			System.out.print("-----------------------------");
			System.out.println();
		}
	}
	
	public static int readNumber(Scanner sc) {
	    while (true) {
	        try {
	            int readNumber = Integer.parseInt(sc.nextLine());
	            return readNumber;
	        } catch (Exception e) {
	            System.out.println("Please enter an int");
	        }
	    }
	}
	
		/**
	 * Search for a contact by their name.
	 * 
	 * @param name The name of the contact, a string of characters.*/
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in); // Scanner system to detect user input
		//this is how to create an object for such person
		Person obj1 = new Person(); 
									/* we need a menu to Create, Retrieve, Update, and Delete
									 needs to be a loop and has to ask user for input on what is needed								
									 should ask for user to input name, age, phone number, addresscity/state/streetaddress/zipCode	
									 should also ask if this person is a faculty member or a student									
									 and if so we need student id or faculty id(usually 10 digits) */
		
	               
		//Menu 
		int choice;
		do {
			System.out.println("1. Create");
			System.out.println("2. Retrieve");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("0. Exit");
			System.out.println("Pick a choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:			
					char userChoice;
					
					System.out.println("type F for faculty or S for student or any other letter for Person ");
					userChoice = sc.next().charAt(0);
					sc.nextLine();
					userChoice = Character.toLowerCase(userChoice);
					
					if(userChoice == 'f') {
						System.out.println("Enter your staffID: ");
						int staffID = readNumber(sc);
						System.out.println("Enter first name: ");
						String firstName = sc.nextLine();
						System.out.println("Enter last name: ");
						String lastName = sc.nextLine();
						System.out.println("Enter Phone Number: ");
						String phoneNumber = sc.nextLine();
						System.out.println("Enter Age: ");
						int age = readNumber(sc);
						System.out.println("Enter Email: ");
						String email = sc.nextLine();
						System.out.println("Enter your city: ");
						String city = sc.nextLine();
						System.out.println("Enter your state: ");
						String state = sc.nextLine();
						System.out.println("Enter your street: ");
						String street = sc.nextLine();
						System.out.println("Enter ZipCode: ");
						int zipCode = readNumber(sc);
						System.out.println("Enter the class you teach: ");
						String classTaught = sc.nextLine();
						System.out.println("Enter your position: ");
						String position = sc.nextLine();
						Person newPerson = new Faculty(staffID, firstName, lastName, phoneNumber, age, email, city, state, street , zipCode, classTaught, position);
						personList.add(newPerson);
					}
					
					else if(userChoice == 's') {
						System.out.println("Enter your studentID");
						int studentID = readNumber(sc);
						System.out.println("Enter first name: ");
						String firstName = sc.nextLine();
						System.out.println("Enter last name: ");
						String lastName = sc.nextLine();
						System.out.println("Enter Phone Number: ");
						String phoneNumber = sc.nextLine();
						System.out.println("Enter Age: ");
						int age = readNumber(sc);
						System.out.println("Enter Email: ");
						String email = sc.nextLine();
						System.out.println("Enter your city: ");
						String city = sc.nextLine();
						System.out.println("Enter your state: ");
						String state = sc.nextLine();
						System.out.println("Enter your street: ");
						String street = sc.nextLine();
						System.out.println("Enter ZipCode: ");
						int zipCode = readNumber(sc);
						System.out.println("Enter your classmanYear: ");
						String classmanYear = sc.nextLine();
						
						Person newPerson = new Student(studentID, firstName, lastName, phoneNumber, age, email, city, state, street ,zipCode, classmanYear);
						personList.add(newPerson);
					}
					else{
						System.out.println("Enter first name: ");
						String firstName = sc.nextLine();
						System.out.println("Enter last name: ");
						String lastName = sc.nextLine();
						System.out.println("Enter Phone Number: ");
						String phoneNumber = sc.nextLine();
						System.out.println("Enter Age: ");
						int age = readNumber(sc);
						System.out.println("Enter Email: ");
						String email = sc.nextLine();
						System.out.println("Enter your city: ");
						String city = sc.nextLine();
						System.out.println("Enter your state: ");
						String state = sc.nextLine();
						System.out.println("Enter your street: ");
						String street = sc.nextLine();
						System.out.println("Enter ZipCode: ");
						int zipCode = readNumber(sc);
	    	  
						Person newPerson =new Person(firstName, lastName, phoneNumber, age, email, city, state, street ,zipCode);
						personList.add(newPerson);
	        
	      }
					
				break;
				
				case 2:
					
					char userChoice2;
					
					System.out.println("type A to retrieve all information, B to retrieve by name, C to retrieve by phonenumber, or D to retrieve by age:  ");
					userChoice2 = sc.next().charAt(0);
					sc.nextLine();
					userChoice = Character.toLowerCase(userChoice2);
					
					if(userChoice2 == 'b') {
						//Counter is to see if anything has been outputted and if not we couldnt find anyone.
						int counter = 0;
						System.out.println("Enter the name or part of the name: ");
						String searchingName = sc.nextLine();
						for(int i =0; i < personList.size(); i++) {
							if(personList.get(i).fullName.contains(searchingName)) {
								System.out.print(personList.get(i));
								counter++;
								}
						}
						if(counter == 0) {
							System.out.println("Could not find that person.");
						}
						
					}
						
					else if(userChoice2 == 'c') {
						int counter = 0;
						System.out.println("Enter the phonenumber or part of number: ");
						String searchingNumber = sc.nextLine();
						for(int i =0; i < personList.size(); i++) {
							if(personList.get(i).phoneNumber.contains(searchingNumber)) {
								System.out.print(personList.get(i));
								counter++;
								}
						}
						if(counter == 0) {
							System.out.println("Could not find that person.");
						}
					}
					
					else if(userChoice2 == 'a') {
						showPersonList();
					}
					
					else if(userChoice2 == 'd') {
						int counter = 0;
						
						System.out.println("Enter an age: ");
						int searchingAge = sc.nextInt();
						
						for(int i =0; i < personList.size(); i++) {
							if(personList.get(i).age == searchingAge) {
								System.out.print(personList.get(i));
								counter++;
								}
						}
						if(counter == 0) {
							System.out.println("Could not find that person.");
						}
					}
					
				break;
				
				case 3:
					
				int updateChoice;
				sc.nextLine();
				
					int counter = 0;
					System.out.println("Enter the name or part of the name: ");
					String updateName = sc.nextLine();
					for(int i =0; i < personList.size(); i++) {
						if(personList.get(i).fullName.contains(updateName)) {
							System.out.print(personList.get(i));
							counter++;
							
							System.out.println("Would you like to update this person's:");
							System.out.println("1: Name");
							System.out.println("2: Age");
							System.out.println("3: Email");
							System.out.println("4: Phone Number");
							System.out.println("5: Address");
							System.out.println("6: Student ID");
							System.out.println("7: Classman Year");
							System.out.println("8: Staff ID");
							System.out.println("9: Class Taught");
							System.out.println("10: Position");
							
							updateChoice = sc.nextInt();
							
							if(updateChoice == 1) {
								System.out.println("What would you like the new name to be?");
								
								System.out.println(personList.get(i));
							}
							
							else if(updateChoice == 2) {
								System.out.println("UPDATE ME: 2 NOT FINISHED");
							}

							else if(updateChoice == 3) {
								System.out.println("UPDATE ME:3 NOT FINISHED");
							}

							else if(updateChoice == 4) {
								System.out.println("UPDATE ME: 4 NOT FINISHED");
							}

							else if(updateChoice == 5) {
								System.out.println("UPDATE ME: 5 NOT FINISHED");	
							}

							else if(updateChoice == 6) {
								System.out.println("UPDATE ME:v6 NOT FINISHED");	
							}

							else if(updateChoice == 7) {
								System.out.println("UPDATE ME: 7 NOT FINISHED");
							}
							
							else if(updateChoice == 8) {
								System.out.println("UPDATE ME: 8 NOT FINISHED");
							}
							
							else if(updateChoice == 9) {
								System.out.println("UPDATE ME:9  NOT FINISHED");
							}
							
							else if(updateChoice == 10) {
								System.out.println("UPDATE ME:  10 NOT FINISHED");
							}
							}
						else if(counter == 0) {
							System.out.println("Could not find that person.");
						}
					}
					
						
						
						
						
				
			break;	
			}
			
	}while(choice != 0);
		
	}
}