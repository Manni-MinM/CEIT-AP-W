// BWOTSHEWCHB

import java.util.HashSet ;
import java.util.HashMap ;
import java.util.ArrayList ;
import java.util.GregorianCalendar ;

class Voting {
	// Fields
	private int type ;
	private String question ;
	private ArrayList<Person> voters ;
	private HashMap<String , HashSet<Vote>> choices ;
	// Constructor
	public Voting(int type , String question) {
		this.type = type ;
		this.question = question ;
		voters = new ArrayList<Person>() ;
		choices = new HashMap<String , HashSet<Vote>>() ;
	}
	// Methods
	public String getQuestion() {
		return question ;
	}
	public ArrayList<String> getChoices() {
		ArrayList<String> currentChoices = new ArrayList<String>() ;
		for ( String choice : choices.keySet() )
			currentChoices.add(choice) ;
		return currentChoices ;
	}
	public void createChoice(String choice) {
		choices.put(choice , new HashSet<Vote>()) ;
	}
	public void vote(Person person , ArrayList<String> personChoices) {
		voters.add(person) ;
		GregorianCalendar date = new GregorianCalendar() ;
		System.out.println(date.toString()) ;
		for ( String choice : personChoices ) {
			Vote newVote = new Vote(person , date.toString()) ;
			choices.get(choice).add(newVote) ;
		}
	}
	public void printVoters() {
		for ( Person voter : voters )
			System.out.println(voter.toString()) ;
	}
	public void printVotes() {
		for ( String choice : choices.keySet() )
			for ( Vote vote : choices.get(choice) )
				System.out.printf("%s (%s) : %s\n" , vote.getPerson() , vote.getDate() , choice) ;
	}
}

