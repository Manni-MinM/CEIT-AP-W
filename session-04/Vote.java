// BWOTSHEWCHB

final class Vote {
	// Fields
	private final Person person ;
	private final String date ;
	// Constructor
	public Vote(Person person , String date) {
		this.person = person ;
		this.date = date ;
	}
	// Methods
	public Person getPerson() {
		return person ;
	}
	public String getDate() {
		return date ;
	}
	public boolean equals(Object vote) {
		if ( !(vote instanceof Vote) )
			return false ;
		if ( vote == this )
			return true ;
		Vote currentVote = (Vote) vote ;
		return currentVote.getPerson().toString().equals(this.person.toString()) && currentVote.getDate().equals(this.date) ;
	}
	public int hashCode() {
		final int prime = 31 ;
		int hashValue = 1 ;
		hashValue = hashValue * prime + (person == null ? 0 : person.toString().hashCode()) ;
		hashValue = hashValue * prime + (date == null ? 0 : date.hashCode()) ;
		return hashValue ;
	}
}

