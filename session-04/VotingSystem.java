// BWOTSHEWCHB

import java.util.ArrayList ;

class VotingSystem {
	// Fields
	private ArrayList<Voting> votingList ;
	// Constructor
	public VotingSystem() {
		votingList = new ArrayList<Voting>() ;
	}
	// Methods
	public void createVoting(String question , int type , ArrayList<String> choices) {
		Voting voting = new Voting(type , question) ;
		for ( String choice : choices )
			voting.createChoice(choice) ;
		votingList.add(voting) ;
	}
	public void printVoting(int id) {
		Voting currentVoting = votingList.get(id) ;
		System.out.print(currentVoting.getQuestion() + " : ") ;
		for ( int i = 0 ; i < currentVoting.getChoices().size() ; i ++ ) {
			System.out.print(currentVoting.getChoices().get(i)) ;
			if ( i != currentVoting.getChoices().size() - 1 )
				System.out.print(" , ") ;
		}
		System.out.println() ;
	}
	public void printVotingList() {
		for ( int i = 0 ; i < votingList.size() ; i ++ )
			printVoting(i) ;
	}
	public void vote(int id , Person person , ArrayList<String> choices) {
		Voting currentVoting = votingList.get(id) ;
		currentVoting.vote(person , choices) ;
	}
	public void printResult(int id) {
		Voting currentVoting = votingList.get(id) ;
		printVoting(id) ;
		currentVoting.printVotes() ;
	}
}

