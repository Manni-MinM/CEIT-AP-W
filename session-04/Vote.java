// BWOTSHEWCHB

/**
 * A class to hold details about each vote
 * 
 * @author Manni Moghimi
 * @version v1.0
 */
public final class Vote {
	// Fields
	private final Person person ;
	private final String date ;
	// Constructor
	/**
	 * Constructor method : Creates Vote object
	 * 
	 * @param person person who has submitted the vote
	 * @param date date of submission
	 */
	public Vote(Person person , String date) {
		this.person = person ;
		this.date = date ;
	}
	// Methods
	/**
	 * Getter method : returns person who has submitted the vote
	 * 
	 * @return person who has submitted the vote
	 */
	public Person getPerson() {
		return person ;
	}
	/**
	 * Getter method : returns vote's date of submission
	 * 
	 * @return date of submission
	 */
	public String getDate() {
		return date ;
	}
	/**
	 * Override method : Checks if two Vote objects are equal
	 * 
	 * @param vote Vote object
	 */
	public boolean equals(Object vote) {
		if ( !(vote instanceof Vote) )
			return false ;
		if ( vote == this )
			return true ;
		Vote currentVote = (Vote) vote ;
		return currentVote.getPerson().toString().equals(this.person.toString()) && currentVote.getDate().equals(this.date) ;
	}
	/**
	 * Override method : Returns hash code for Vote object
	 * 
	 * @return hash value 
	 */
	public int hashCode() {
		final int prime = 31 ;
		int hashValue = 1 ;
		hashValue = hashValue * prime + (person == null ? 0 : person.toString().hashCode()) ;
		hashValue = hashValue * prime + (date == null ? 0 : date.hashCode()) ;
		return hashValue ;
	}
}

