public class Main {
	public static void main(String[] args) {
		MusicCollection metal = new MusicCollection() ;
		MusicCollection pop = new MusicCollection() ;
		MusicCollection rock = new MusicCollection() ;
		MusicCollection country = new MusicCollection() ;
		
		metal.addFile(new Music("13" , "Megadeth" , "2011")) ;
		metal.addFile(new Music("One" , "Metallica" , "1988")) ;
		metal.addFile(new Music("Nothing else matters" , "Metallica" , "1991")) ;
		metal.listFile(0) ;
		metal.listAllFiles() ;
		
		rock.addFile(new Music("Hey you" , "Pink Floyd" , "1979")) ;
		rock.listAllFiles() ;
		
		metal.addFav(new Music("13" , "Megadeth" , "2011")) ;
		metal.addFav(new Music("One" , "Metallica" , "1988")) ;
		metal.listAllFavs() ;
		metal.findTrack("One") ;
		metal.removeFav(new Music("One" , "Metallica" , "1988")) ;
		metal.listAllFavs() ;
	}
}
