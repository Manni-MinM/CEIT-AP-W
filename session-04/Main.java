// BWOTSHEWCHB

import java.util.ArrayList ;

public class Main {
	public static void main(String[] args) {
		// TODO : equals cant vote multiple times
		// TODO : fix voting type 
		VotingSystem VS = new VotingSystem() ;
		ArrayList<String> temp = new ArrayList<String>() ;
		temp.add("are") ;
		temp.add("bale") ;
		VS.createVoting("kargah khar ast ?" , 1 , temp) ;
		VS.printResult(0) ;
		Person manni = new Person("manni" , "moghimi") ;
		temp.clear() ;
		temp.add("are") ;
		VS.vote(0 , manni , temp) ;
		Person bagher = new Person("bagher" , "bagherzade") ;
		temp.clear() ;
		temp.add("bale") ;
		VS.vote(0 , bagher , temp) ;
		Person jaber = new Person("jaber" , "jaberkhani") ;
		temp.clear() ;
		temp.add("are") ;
		VS.vote(0 , jaber , temp) ;
		VS.printResult(0) ;
		System.out.println("KOS KHAR JAVA") ;
	}
}
