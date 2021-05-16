// BWOTSHEWCHB

import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.IOException ;

import java.util.Scanner ;

public class FileUtils {
	// Fields
	private String folderPath ;
	private Scanner scanner ;
	private FileReader fileReader ;
	private FileWriter fileWriter ;
	// Constructor
	public FileUtils(String folderPath) {
		this.folderPath = folderPath ;
	}
	// Methods
	public String joinPath(String... args) {
		String returnValue = folderPath ;
		for ( String currentPath : args )
			returnValue += "/" + currentPath ;
		return returnValue ;
	}
	public void write(Note note) throws IOException {
		fileWriter = new FileWriter(joinPath(folderPath , note.getFilename())) ;
		fileWriter.write(note.getContext()) ;
	}
	public void read(String filename) {
		
	}
}

