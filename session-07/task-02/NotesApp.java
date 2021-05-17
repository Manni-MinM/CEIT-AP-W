// BWOTSHEWCHB

import java.io.IOException ;

import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.InputMismatchException ;

/**
 * A Class to hold information about the NotesApp
 *
 * @author Manni Moghimi
 * @version v2.0
 */
public class NotesApp {
	// Fields
	private final String mainFilePath = "main.txt" ;
	private Scanner scanner ;
	private FileUtils fileUtils ;
	// Constructor
	/**
	 * Creates NotesApp Object
	 */
	public NotesApp() {
		scanner = new Scanner(System.in) ;
		fileUtils = new FileUtils(mainFilePath) ;
	}
	// Methods
	/**
	 * Creates a new Note
	 *
	 * @param filename The name of the File
	 */
	public void newNote(String filename) {
		System.out.print("Context : ") ;
		String context = scanner.nextLine() ;
		System.out.print("Date : ") ;
		String date = scanner.nextLine() ;
		Note note = new Note(filename , context , date) ;
		ArrayList<Note> notes = getNotes() ;
		if ( notes.contains(note) ) {
			System.err.println("[FILE WITH SPECIFIED NAME ALREADY EXISTS]") ;
			return ;
		}
		notes.add(note) ;
		try {
			fileUtils.writeNotes(notes) ;
		} catch ( IOException exception ) {
			System.err.println("[CANNOT CREATE NEW NOTE]") ;
		}
	}
	/**
	 * Reads the main.txt File and gets a list of all the Notes
	 *
	 * @return An ArrayList containing the filename of the Notes
	 */
	public ArrayList<Note> getNotes() {
		try {
			return fileUtils.readNotes() ;
		} catch ( IOException exception ) {
			return (new ArrayList<Note>()) ;
		}
	}
	/**
	 * Shows all available Notes
	 */
	public void showNotes() {
		ArrayList<Note> notes = getNotes() ;
		System.out.println("[Files Found] : " + notes.size()) ;
		for ( Note note : notes )
			System.out.println("=> " + "\"" + note.getFilename() + "@" + note.getDate() + "\"") ;
		System.out.println() ;
	}
	/**
	 * Previews a Note
	 *
	 * @param filename The filename of the Note to be previewed
	 */
	public void previewNote(String filename) {
		ArrayList<Note> notes = getNotes() ;
		Note targetNote = null ;
		for ( Note note : notes )
			if ( filename.equals(note.getFilename()) ) {
				targetNote = note ;
				break ;
			}
		if ( targetNote == null ) {
			System.err.println("[FILE NOT FOUND]") ;
			return ;
		}
		System.out.println("=> " + targetNote.getFilename() + " @" + targetNote.getDate()) ;
		System.out.println("\"" + targetNote.getContext() + "\"") ;
	}
	/**
	 * Deletes a Note
	 *
	 * @param filename The filename of the Note to be previewed
	 */
	public void deleteNote(String filename) {
		ArrayList<Note> notes = getNotes() ;
		Note targetNote = null ;
		for ( Note note : notes ) 
			if ( filename.equals(note.getFilename()) ) {
				targetNote = note ;
				break ;
			}
		if ( targetNote == null ) {
			System.err.println("[FILE NOT FOUND]") ;
			return ;
		}
		try {
			notes.remove(targetNote) ;
			fileUtils.writeNotes(notes) ;
		} catch ( IOException exception ) {
			System.err.println("[CANNOT DELETE FILE]") ;
			exception.printStackTrace() ;
		}
	}
}

