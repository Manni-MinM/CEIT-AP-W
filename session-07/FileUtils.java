// BWOTSHEWCHB

import java.io.File ;
import java.io.IOException ;
import java.io.FileInputStream ;
import java.io.FileOutputStream ;

import java.util.Scanner ;

public class FileUtils {
	// Fields
	private Scanner scanner ;
	private FileInputStream fin ;
	private FileOutputStream fout ;
	// Methods
	public String joinPath(String... args) {
		String returnValue = "" ;
		for ( String currentPath : args )
			returnValue += currentPath + "/" ;
		return returnValue ;
	}
	public void writeOutputStream(Note note) throws IOException {
		File file = new File(note.getFilePath()) ;
		fout = new FileOutputStream(note.getFilePath()) ;
		byte bytes[] = note.getContext().getBytes() ;
		fout.write(bytes) ;
		fout.close() ;
	}
	public String readInputStream(String filePath) throws IOException {
		String returnValue = "" ;
		fin = new FileInputStream(filePath) ;
		int input ;
		while ( (input = fin.read()) != -1 )
			returnValue += (char)input ;
		fin.close() ;
		return returnValue ;
	}
	public void delete(String filePath) throws IOException {
		File file = new File(filePath) ;
		file.delete() ;
	}
}

