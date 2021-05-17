// BWOTSHEWCB

import java.io.Serializable ;

/**
 * A Class to hold information about Notes
 *
 * @author Manni Moghimi
 * @version v2.0
 */
public class Note implements Serializable {
	// Fields
	private String filename ;
	private String context ;
	private String date ;
	// Constructor
	/**
	 * Creates Note Object
	 *
	 * @param filePath The path of the Note File
	 * @param context The context of the Note File
	 * @param date The date of the Note File
	 */
	public Note(String filename , String context , String date) {
		this.filename = filename ;
		this.context = context ;
		this.date = date ;
	}
	// Methods
	/**
	 * Returns the name of the Note File
	 *
	 * @return The name of the Note File
	 */
	public String getFilename() {
		return filename ;
	}
	/**
	 * Returns the context of the File
	 *
	 * @return The context of the File
	 */
	public String getContext() {
		return context ;
	}
	/**
	 * Returns the date of the File
	 *
	 * @return The date of the File
	 */
	public String getDate() {
		return date ;
	}
	/**
	 * Checks if two Note Objects are equal
	 *
	 * @param object The Object to be checked
	 * @return True if equals otherwise False 
	 */
	public boolean equals(Object object) {
		if ( !(object instanceof Note) )
			return false ;
		if ( this == object )
			return true ;
		Note note = (Note)object ;
		return this.getFilename().equals(note.getFilename()) ;
	}
}

