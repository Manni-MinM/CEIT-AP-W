// BWOTSHEWCHB

import java.io.IOException ;

import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.InputMismatchException ;

public class NotesApp {
	// Fields
	private final String mainFolderPath = "./notes" ;
	private final String mainFilePath = "main.txt" ;
	private Scanner scanner ;
	private FileUtils fileUtils ;
	// Constructor
	public NotesApp() {
		fileUtils = new FileUtils() ;
		scanner = new Scanner(System.in) ;
	}
	// Methods
	public void newNote(String filename) {
		System.out.print("Context : ") ;
		String context = scanner.nextLine() ;
		String filePath = fileUtils.joinPath(mainFolderPath , filename) ;
		Note newNote = new Note(filePath , context) ;
		try {
			fileUtils.writeOutputStream(newNote) ;
		}
		catch ( IOException exception ) {
			System.err.println("[CANNOT CREATE NEW NOTE]") ;
			exception.printStackTrace() ;
		}
		// TODO : Check filename duplicates 
	}
	public ArrayList<String> getFiles() {
		try {
			String data = fileUtils.readInputStream(mainFilePath) ;
			String[] split = data.split(" ") ;
			ArrayList<String> files = new ArrayList<String>() ;
			for ( String file : split )
				files.add(file) ;
			return files ;
		}
		catch ( IOException exception ) {
			return null ;
		}
	}
	public void showNotes() {
		ArrayList<String> files = getFiles() ;
		if ( files == null ) {
			System.out.println("=> No Files Found") ;
			return ;
		}
		System.out.println("Files Found : " + files.size()) ;
		for ( String file : files )
			System.out.println("=> " + file) ;
		System.out.println() ;
	}
	public void previewNote(String filename) {
		try {
			String path = fileUtils.joinPath(mainFolderPath , filename) ;
			System.out.println("=> " + filename) ;
			System.out.println("\"" + fileUtils.readInputStream(path) + "\"") ;
		}
		catch ( IOException exception ) {
			System.err.println("[CANNOT PREVIEW FILE]") ;
			exception.printStackTrace() ;
		}
	}
	public void deleteNote(String filename) {
		try {
			String path = fileUtils.joinPath(mainFolderPath , filename) ;
			fileUtils.delete(path) ;
		}
		catch ( IOException exception ) {
			System.err.println("[CANNOT DELETE FILE]") ;
			exception.printStackTrace() ;
		}
	}
}

