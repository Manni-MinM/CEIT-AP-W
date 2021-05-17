// BWOTSHEWCB

/**
 * A Class to hold information about Notes
 *
 * @author Manni Moghimi
 * @version v1.0
 */
public class Note {
	// Fields
	private String filePath ;
	private String context ;
	// Constructor
	/**
	 * Creates Note Object
	 *
	 * @param filePath The path of the Note File
	 * @param context The context of the Note File
	 */
	public Note(String filePath , String context) {
		this.filePath = filePath ;
		this.context = context ;
	}
	// Methods
	/**
	 * Returns the path of the Note File
	 *
	 * @return The path of the Note File
	 */
	public String getFilePath() {
		return filePath ;
	}
	/**
	 * Returns the context of the File
	 *
	 * @return The context of the File
	 */
	public String getContext() {
		return context ;
	}
}

