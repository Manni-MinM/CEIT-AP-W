class Music {
	// Fields
	private String name ;
	private String bandName ;
	private String releaseDate ;
	// Constructor 
	public Music(String name , String bandName , String releaseDate) {
		this.name = name ;
		this.bandName = bandName ;
		this.releaseDate = releaseDate ;
	}
	// Setters
	public void setName(String name) {
		this.name = name ;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName ;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate ;
	}
	// Getters
	public String getName() {
		return name ;
	}
	public String getBandName() {
		return bandName ;
	}
	public String getReleaseDate() {
		return releaseDate ;
	}
}
