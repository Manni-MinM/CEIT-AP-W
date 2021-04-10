// BWOTSHEWCHB

import java.util.Scanner ;
import java.util.ArrayList ;

public class Main {
	public static void main(String[] args) {
		VotingSystem VS = new VotingSystem() ;
		Scanner input = new Scanner(System.in) ;
		while ( true ) {
			// Print menu
			System.out.println("1) Create Voting") ;
			System.out.println("2) Get Voting List") ;
			System.out.println("3) Get Voting With Index $indx") ;
			System.out.println("4) Vote") ;
			System.out.println("5) Get Result of Voting With Index $indx") ;
			System.out.println() ;
			String line = input.nextLine() ;
			if ( line.equals("1") ) {
				// Get info
				System.out.print("Question : ") ;
				String question = input.nextLine() ;
				System.out.print("type : ") ;
				int type = input.nextInt() ;
				String trash = input.nextLine() ;
				ArrayList<String> choices = new ArrayList<String>() ;
				String choice = "" ;
				System.out.println("Choices : ") ;
				while ( true ) {
					choice = input.nextLine() ;
					if ( choice.equals("$EXIT") )
						break ;
					choices.add(choice) ;
				}
				// Create new voting
				VS.createVoting(question , type , choices) ;
			}
			else if ( line.equals("2") ) {
				// Get voting list
				VS.printVotingList() ;
			}
			else if ( line.equals("3") ) {
				// Get info
				System.out.print("Index of Voting : ") ;
				int indx = input.nextInt() ;
				String trash = input.nextLine() ;
				// Get details about voting with index $indx
				VS.printVoting(indx) ;
			}
			else if ( line.equals("4") ) {
				// Get info
				System.out.print("Index of Voting : ") ;
				int indx = input.nextInt() ;
				String trash = input.nextLine() ;
				System.out.print("First Name : ") ;
				String firstName = input.nextLine() ;
				System.out.print("Last Name : ") ;
				String lastName = input.nextLine() ;	
				ArrayList<String> choices = new ArrayList<String>() ;
				String choice = "" ;
				System.out.println("Choices : ") ;
				while ( true ) {
					choice = input.nextLine() ;
					if ( choice.equals("$EXIT") )
						break ;
					choices.add(choice) ;
				}
				Person person = new Person(firstName , lastName) ;
				// Add new vote
				VS.vote(indx , person , choices) ;
			}
			else if ( line.equals("5") ) {
				// Get info
				System.out.print("Index of Voting : ") ;
				int indx = input.nextInt() ;
				String trash = input.nextLine() ;
				// Get details about voting with index $indx
				VS.printResult(indx) ;
			}
			else 
				handleMenuException() ;
			System.out.println() ;
		}
	}
	public static void handleMenuException() {
		System.out.println("[Command Not Found]") ;
	}
}
