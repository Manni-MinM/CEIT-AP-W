// BWOTSHEWCHB

import ir.huri.jcal.JalaliCalendar ;

import java.util.Random ;
import java.util.HashSet ;
import java.util.HashMap ;
import java.util.ArrayList ;
import java.util.GregorianCalendar ;

/**
 * A class to hold details about each voting
 * 
 * @author Manni Moghimi
 * @version v1.0
 */
public class Voting {
	// Fields
	private int type ;
	private String question ;
	private ArrayList<Person> voters ;
	private HashMap<String , HashSet<Vote>> choices ;
	// Constructor
	/**
	 * Constructor method : Creates Voting object
	 * 
	 * @param type type of voting (0 : single choice | 1 : multiple choice)
	 * @param question question of voting
	 */
	public Voting(int type , String question) {
		this.type = type ;
		this.question = question ;
		voters = new ArrayList<Person>() ;
		choices = new HashMap<String , HashSet<Vote>>() ;
	}
	// Methods
	/**
	 * Getter method : returns question of voting
	 * 
	 * @return question of voting
	 */
	public String getQuestion() {
		return question ;
	}
	/**
	 * Getter method : returns an array list of avaliable choices for the voting
	 * 
	 * @return avaliable choices for the voting
	 */
	public ArrayList<String> getChoices() {	
		ArrayList<String> currentChoices = new ArrayList<String>() ;
		for ( String choice : choices.keySet() )
			currentChoices.add(choice) ;
		return currentChoices ;
	}
	/**
	 * Adds a new choice to the list of avaliable choices
	 * 
	 * @param choice choice to be added to list of avaliable choices
	 */
	public void createChoice(String choice) {
		choices.put(choice , new HashSet<Vote>()) ;
	}
	/**
	 * Adds a new vote the list of votes
	 * 
	 * @param person person who has submitted the vote
	 * @param personChoices an array list of choices person has voted for
	 */
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
	/**
	 * Prints a list of all voters of the voting
	 */
	public void printVoters() {
		for ( Person voter : voters )
			System.out.println(voter.toString()) ;
	}
	/**
	 * Prints every choice and number of votes for each vote
	 */
	public void printVotes() {
		for ( String choice : choices.keySet() )
			System.out.printf("[%s => %s]\n" , choice , choices.get(choice).size()) ;
	}
}

