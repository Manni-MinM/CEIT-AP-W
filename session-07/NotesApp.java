// BWOTSHEWCHB

import java.io.IOException ;

import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.InputMismatchException ;

public class NotesApp {
	// Fields
	private final String mainFolderPath = "./notes" ;
	private final String mainFilePath = "./main.txt" ;
	private Scanner scanner ;
	private FileUtils fileUtils ;
	// Constructor
	public NotesApp() {
		scanner = new Scanner(System.in) ;
		fileUtils = new FileUtils(mainFolderPath) ;
	}
	// Methods
	public void newNote(String filename) {
		System.out.print("Context : ") ;
		String context = scanner.nextLine() ;
		Note newNote = new Note(filename , context) ;
		try {
			fileUtils.write(newNote) ;
		}
		catch ( IOException exception ) {
			System.err.println("[CANNOT CREATE NEW NOTE]") ;
		}
		// TODO : Check filename duplicates 
	}
	public void showAll() {
	
	}
	public void previewNote(String filename) {
		
	}
	public void deleteNote(String filename) {
		
	}
}

