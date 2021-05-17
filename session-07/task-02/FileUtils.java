// BWOTSHEWCHB

import java.io.File ;
import java.io.IOException ;
import java.io.FileInputStream ;
import java.io.ObjectInputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectOutputStream ;

import java.util.ArrayList ;

/**
 * A Class used to write IO to files
 *
 * @author Manni Moghimi
 * @version v2.0
 */
public class FileUtils {
	// Fields
	private String filename ;
	private FileInputStream fin ;
	private ObjectInputStream in ;
	private FileOutputStream fout ;
	private ObjectOutputStream out ;
	// Constructor
	/**
	 * Creates FileUtils Object
	 *
	 * @param filename The name of the main File
	 */
	public FileUtils(String filename) {
		this.filename = filename ;
	}
	// Methods
	/**
	 * Writes output to File using ObjectOutputStream
	 *
	 * @param notes The list of Notes to be written to the File
	 */
	public void writeNotes(ArrayList<Note> notes) throws IOException {
		fout = new FileOutputStream(filename) ;
		out = new ObjectOutputStream(fout) ;
		for ( Note note : notes )
			out.writeObject(note) ;
		out.flush() ;
		out.close() ;
	}
	/**
	 * Reads all Notes from  File using ObjectInputStream
	 *
	 * @return The list of all Notes in the File
	 */
	public ArrayList<Note> readNotes() throws IOException {
		fin = new FileInputStream(filename) ;
		in = new ObjectInputStream(fin) ;
		ArrayList<Note> notes = new ArrayList<Note>() ;
		while ( fin.available() > 0 ) {
			try {
				Note note = (Note)in.readObject() ;
				notes.add(note) ;
			} catch ( ClassNotFoundException exception ) {
				exception.printStackTrace() ;
			} 
		}
		in.close() ;
		return notes ;
	}
}

