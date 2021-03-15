import java.util.* ;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2011.07.31
 */

public class MusicCollection {
	// An ArrayList for storing the file names of music files.
	private ArrayList<Music> files ;
	private ArrayList<Music> favourites ;
	// A player for the music files.
	private MusicPlayer player ;

	/**
	 * Create a MusicCollection
	 */

	public MusicCollection() {
		files = new ArrayList<Music>() ;
		favourites = new ArrayList<Music>() ;
		player = new MusicPlayer() ;
	}

	/**
	 * Add a file to the collection.
	 * @param filename The file to be added.
	 */

	public void addFile(Music filename) {
		files.add(filename) ;
	}
	
	/**
	 * Add a file to the favourites collection.
	 * @param filename The file to be added.
	 */
	
	public void addFav(Music filename) {
		favourites.add(filename) ;
	}

	/**
	 * Removes a file from the favourites collection.
	 * @param filename The file to be removed.
	 * @param index The index of the file to be removed.
	 */
	
	public void removeFav(Music filename) {
		int index = -1 ;
		int counter = 0 ;
		for ( Music track : favourites ) {
			if ( track.getName().equals(filename.getName()) )
				index = counter ;
			counter ++ ;	
		}
		if ( validIndex(index) )
			favourites.remove(index) ;
	}

	public void removeFav(int index) {
		if ( validIndex(index) )
			favourites.remove(index) ;
	}

	/**
	 * Return the number of files in the collection.
	 * @return The number of files in the collection.
	 */

	public int getNumberOfFiles() {
		return files.size() ;
	}

	/**
	 * List a file from the collection.
	 * @param index The index of the file to be listed.
	 */

	public void listFile(int index) {
		if ( validIndex(index) ) {
			Music currentTrack = files.get(index) ;
			System.out.printf("%s - %s (%s)\n" , currentTrack.getBandName() , currentTrack.getName() , currentTrack.getReleaseDate()) ;
		}
	}

	/**
	 * Show a list of all the files in the collection.
	 */

	public void listAllFiles() {
		for ( Music track : files ) {
			System.out.printf("%s - %s (%s)\n" , track.getBandName() , track.getName() , track.getReleaseDate()) ;
		}
	}

	/**
	 * Show a list of all the files in the favourites collection.
	 */
	
	public void listAllFavs() {
		for ( Music track : favourites ) {
			System.out.printf("%s - %s (%s)\n" , track.getBandName() , track.getName() , track.getReleaseDate()) ;
		}
	}

	/**
	 * Remove a file from the collection.
	 * @param index The index of the file to be removed.
	 */

	public void removeFile(int index) {
		if ( validIndex(index) )
			files.remove(index) ;
	}

	/**
	 * Start playing a file in the collection.
	 * Use stopPlaying() to stop it playing.
	 * @param index The index of the file to be played.
	 */

	public void startPlaying(int index) {
		if ( validIndex(index) )
			player.startPlaying(files.get(index).getName()) ;
	}

	/**
	 * Stop the player.
	 */

	public void stopPlaying() {
		player.stop() ;
	}

	/**
	 * Finds a song with desired name in favourites collection.
	 * Use findTrack() to find a song.
	 * @param name The name of the file wanted.
	 */
	
	public void findTrack(String name) {
		Iterator<Music> it = favourites.iterator() ;
		while ( it.hasNext() ) {
			Music track = it.next() ;
			if ( track.getName().equals(name) )
				System.out.printf("%s - %s (%s)\n" , track.getBandName() , track.getName() , track.getReleaseDate()) ;
		}
	}

	/**
	 * Determine whether the given index is valid for the collection.
	 * Print an error message if it is not.
	 * @param index The index to be checked.
	 * @return true if the index is valid, false otherwise.
	 */

	private boolean validIndex(int index) {
		// The return value.
		// Set according to whether the index is valid or not.
		if ( index < files.size() && index >= 0 )
			return true ;
		else {
			System.out.println("Invalid Index") ;
			return false ;
		}
	}
}
