// BWOTSHEWCHB

import java.io.File ;
import java.io.IOException ;
import java.io.FileWriter ;
import java.io.FileReader ;
import java.io.BufferedWriter ;
import java.io.BufferedReader ;
import java.io.FileInputStream ;
import java.io.FileOutputStream ;

import java.util.Scanner ;
import java.util.ArrayList ;

public class FileUtils {
	// Fields
	private Scanner scanner ;
	private FileInputStream fin ;
	private FileOutputStream fout ;
	private FileWriter writer ;
	private FileReader reader ;
	private BufferedWriter bufferedWriter ;
	private BufferedReader bufferedReader ;
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
	public void writeBuffered(String filePath , ArrayList<String> files) throws IOException {
		writer = new FileWriter(filePath) ;
		bufferedWriter = new BufferedWriter(writer) ;
		String output = "" ;
		for ( String file : files )
			output += file + " " ;
		output.strip() ;
		bufferedWriter.write(output) ;
		bufferedWriter.close() ;
	}
	public String readBuffered(String filePath) throws IOException {
		String returnValue = "" ;
		reader = new FileReader(filePath) ;
		bufferedReader = new BufferedReader(reader) ;
		int input ;
		while ( (input = bufferedReader.read()) != -1 )
			returnValue += (char)input ;
		reader.close() ;
		bufferedReader.close() ;
		return returnValue ;
	}
	public void delete(String filePath) throws IOException {
		File file = new File(filePath) ;
		file.delete() ;
	}
}

