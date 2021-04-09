// BWOTSHEWCHB

final class Person {
	// Fields
	private final String firstName ;
	private final String lastName ;
	// Constructor
	public Person(String firstName , String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName ;
	}
	// Methods
	public String getFirstName() {
		return firstName ;
	}
	public String getLastName() {
		return lastName ;
	}
	public String toString() {
		return firstName + " " + lastName ;
	}
}

