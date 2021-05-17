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

/**
 * A Class used to write IO to files
 *
 * @author Manni Moghimi
 * @version v1.0
 */
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
	/**
	 * Joins Path of two or more paths by concatenation
	 *
	 * @param args List of arguments to be conatenated
	 * @return The concatenated path in String format
	 */
	public String joinPath(String... args) {
		String returnValue = "" ;
		for ( String currentPath : args )
			returnValue += currentPath + "/" ;
		return returnValue ;
	}
	/**
	 * Writes input to File using FileOutputStream
	 *
	 * @param note The Note to be written to the File
	 * @throws IOException
	 */
	public void writeOutputStream(Note note) throws IOException {
		File file = new File(note.getFilePath()) ;
		fout = new FileOutputStream(note.getFilePath()) ;
		byte bytes[] = note.getContext().getBytes() ;
		fout.write(bytes) ;
		fout.close() ;
	}
	/**
	 * Reads input from a File using FileInputStream
	 *
	 * @param filePath The Path of the File to be read
	 * @return The input read from the File
	 * @throws IOException
	 */
	public String readInputStream(String filePath) throws IOException {
		String returnValue = "" ;
		fin = new FileInputStream(filePath) ;
		int input ;
		while ( (input = fin.read()) != -1 )
			returnValue += (char)input ;
		fin.close() ;
		return returnValue ;
	}
	/**
	 * Writes an ArrayList to a File using BufferedWriter
	 *
	 * @param filePath The path of the File to be written
	 * @param files The ArrayList to be written to the File
	 * @throws IOException
	 */
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
	/**
	 * Reads input from a File using BufferedReader
	 *
	 * @param filePath The path of the File to be read
	 * @return The input read from the File
	 * @throws IOException
	 */
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
	/**
	 * Deletes a File
	 *
	 * @param filePath The path of the File to be deleted
	 * @throws IOException
	 */
	public void delete(String filePath) throws IOException {
		File file = new File(filePath) ;
		file.delete() ;
	}
}

