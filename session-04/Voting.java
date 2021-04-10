// BWOTSHEWCHB

import ir.huri.jcal.JalaliCalendar ;

import java.util.Random ;
import java.util.HashSet ;
import java.util.HashMap ;
import java.util.ArrayList ;
import java.util.GregorianCalendar ;

class Voting {
	// Fields
	// Type 0 : Single Choice | Type 1 : Multiple Choices
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
		if ( voters.contains(person) ) {
			System.out.println("[Person Has Already Submitted Their Vote]") ;
			return ;
		}
		if ( type == 0 && personChoices.size() > 1 ) {
			System.out.printf("[Cannot Choose Multiple Choices For This Voting (Your Choices : %d)]\n" , personChoices.size()) ;
			return ;
		}
		voters.add(person) ;
		JalaliCalendar date = new JalaliCalendar(new GregorianCalendar()) ;
		if ( type == 0 && personChoices.isEmpty() ) {
			Random random = new Random() ;
			int choiceIndex = random.nextInt(choices.keySet().size()) ;
			personChoices.add(getChoices().get(choiceIndex)) ;
		}
		for ( String choice : personChoices ) {
			Vote newVote = new Vote(person , date.toString()) ;
			if ( choices.containsKey(choice) )
				choices.get(choice).add(newVote) ;
		}
	}
	public void printVoters() {
		for ( Person voter : voters )
			System.out.println(voter.toString()) ;
	}
	public void printVotes() {
		for ( String choice : choices.keySet() )
			System.out.printf("[%s => %s]\n" , choice , choices.get(choice).size()) ;
	}
}

