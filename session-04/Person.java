// BWOTSHEWCHB

/**
 * A class to hold details for each person
 * 
 * @author Manni Moghimi
 * @version v1.0
 */
public final class Person {
	// Fields
	private final String firstName ;
	private final String lastName ;
	// Constructor
	/**
	 * Constructor method : Creates Person object
	 *
	 * @param firstName Person's name
	 * @param lastName Person's surename
	 */
	public Person(String firstName , String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName ;
	}
	// Methods
	/**
	 * Getter method : returns person's name
	 * 
	 * @return person's name
	 */
	public String getFirstName() {
		return firstName ;
	}
	/**
	 * Getter method : returns person's surename
	 * 
	 * @return person's surename
	 */
	public String getLastName() {
		return lastName ;
	}
	/**
	 * Converts Person to string
	 * 
	 * @return person's fullname
	 */
	public String toString() {
		return firstName + " " + lastName ;
	}
	/**
	 * Override method : Checks if two Person objects are equal
	 * 
	 * @param person Person object
	 */
	public boolean equals(Object person) {
		if ( !(person instanceof Person) )
			return false ;
		if ( person == this )
			return true ;
		return person.toString().equals(this.toString()) ;
	}
}

