// BWOTSHEWCHB

import java.util.Scanner ;

public class Main {
	public static void main(String[] args) {
		NotesApp notesApp = new NotesApp() ;
		Scanner scanner = new Scanner(System.in) ;

		boolean continueLoop = true ;
		do {
			showMenu() ;
			String input = scanner.nextLine() ;
			String split[] = input.split(" ") ;
			if ( split[0].equals("$show") ) {
				notesApp.showNotes() ;
			}
			else if ( split[0].equals("$add") ) {
				notesApp.newNote(split[1]) ;
			}
			else if ( split[0].equals("$preview") ) {
				notesApp.previewNote(split[1]) ;
			}
			else if ( split[0].equals("$delete") ) {
				notesApp.deleteNote(split[1]) ;
			}
			else if ( split[0].equals("$exit") ) {
				continueLoop = false ;
			}
			else {
				System.err.println("[INVALID COMMAND]") ;
			}
		} while ( continueLoop ) ;
	}
	public static void showMenu() {
		System.out.println("### Notes ###") ;
		System.out.println() ;
		System.out.println("Commands : ") ;
		System.out.println("[Shows All Notes] : $show") ;
		System.out.println("[Adds a Note] : $add filename.txt") ;
		System.out.println("[Previews a Note] : $preview filename.txt") ;
		System.out.println("[Deletes a Note] : $delete filename.txt") ;
		System.out.println("[Exit] : $exit") ;
		System.out.println() ;
	}
}

