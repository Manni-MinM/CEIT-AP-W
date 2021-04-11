// BWOTSHEWCHB

import java.util.ArrayList ;

/**
 * A class for the main voting system
 * 
 * @author Manni Moghimi
 * @version v1.0
 */
public class VotingSystem {
	// Fields
	private ArrayList<Voting> votingList ;
	// Constructor
	/**
	 * Constructor method : Creates a VotingSystem object
	 */
	public VotingSystem() {
		votingList = new ArrayList<Voting>() ;
	}
	// Methods
	/**
	 * Creates a new voting
	 * 
	 * @param question question of voting
	 * @param type type of voting (0 : single choice | 1 : multiple choice)
	 * @param choices list of avaliable choices for the voting
	 */
	public void createVoting(String question , int type , ArrayList<String> choices) {
		Voting voting = new Voting(type , question) ;
		for ( String choice : choices )
			voting.createChoice(choice) ;
		votingList.add(voting) ;
	}
	/**
	 * Adds a vote to the desired voting
	 * 
	 * @param id index of voting the vote is submitted for
	 * @param person person who has submitted the vote
	 * @param choices list of choices person has voted for
	 */
	public void vote(int id , Person person , ArrayList<String> choices) {
		if ( id < 0 || id >= votingList.size() ) {
			System.out.println("[Voting With Such Index Does Not Exist]") ;
			return ;
		}
		Voting currentVoting = votingList.get(id) ;
		currentVoting.vote(person , choices) ;
	}
	/**
	 * Prints details about the desired voting
	 * 
	 * @param id index of the desired voting
	 */
	public void printVoting(int id) {
		if ( id < 0 || id >= votingList.size() ) {
			System.out.println("[Voting With Such Index Does Not Exist]") ;
			return ;
		}
		Voting currentVoting = votingList.get(id) ;
		System.out.print(currentVoting.getQuestion() + " : ") ;
		for ( int i = 0 ; i < currentVoting.getChoices().size() ; i ++ ) {
			System.out.print(currentVoting.getChoices().get(i)) ;
			if ( i != currentVoting.getChoices().size() - 1 )
				System.out.print(" , ") ;
		}
		System.out.println() ;
	}
	/**
	 * Prints a list of all avaliable votings
	 */
	public void printVotingList() {
		for ( int i = 0 ; i < votingList.size() ; i ++ ) {
			System.out.println(i + ")") ;
			printVoting(i) ;
		}
	}
	/**
	 * Prints results of the desired voting
	 * 
	 * @param id index of the desired voting
	 */
	public void printResult(int id) {
		if ( id < 0 || id >= votingList.size() ) {
			System.out.println("[Voting With Such Index Does Not Exist]") ;
			return ;
		}
		Voting currentVoting = votingList.get(id) ;
		printVoting(id) ;
		currentVoting.printVotes() ;
	}
}

