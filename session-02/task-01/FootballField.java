public class FootballField {
	// Attributes
	private Student[] teamRed ;
	private Student[] teamBlue ;
	private String day ;
	private int capacityRed ;
	private int capacityBlue ;
	private int currentSizeRed ;
	private int currentSizeBlue ;
	// Constructor
	public FootballField(int capRed , int capBlue , String d) {
		this.capacityRed = capRed ;
		this.capacityBlue = capBlue ;
		this.day = d ;
		
		teamRed = new Student[capacityRed] ;
		teamBlue = new Student[capacityBlue] ;
	}
	// Getters
	public Student[] getTeamRed() 
		{ return teamRed ; }
	public Student[] getTeamBlue() 
		{ return teamBlue ; }
	public String getDay() 
		{ return day ; }
	public int getCapacityRed() 
		{ return capacityRed ; }
	public int getCapacityBlue() 
		{ return capacityBlue ; }
	// Setters
	public void setTeamRed(Student[] teamRed)
		{ this.teamRed = teamRed ; }
	public void setTeamBlue(Student[] teamBlue)
		{ this.teamBlue = teamBlue ; }
	public void setDay(String day) 
		{ this.day = day ; }
	public void setCapacityRed(int capacity) 
		{ this.capacityRed = capacity ; }
	public void setCapacityBlue(int capacity) 
		{ this.capacityBlue = capacity ; }
	// Methods
	public void addToTeamRed(Student std) {
		if ( currentSizeRed < capacityRed ) {
			teamRed[currentSizeRed] = std ;
			currentSizeRed ++ ;
		}
		else
			System.out.println("Red team is full!!!") ;
	}
	public void addToTeamBlue(Student std) {
		if ( currentSizeBlue < capacityBlue ) {
			teamRed[currentSizeBlue] = std ;
			currentSizeBlue ++ ;
		}
		else
			System.out.println("Blue team is full!!!") ;
	}
	public void printRed() {
		for ( int i = 0 ; i < currentSizeRed ; i ++ )
			System.out.printf("Name : %s / Surename : %s / ID : %s\n" ,
				teamRed[i].getName() , teamRed[i].getSurename() , teamRed[i].getId()) ; 	
	}
	public void printBlue() {
		for ( int i = 0 ; i < currentSizeBlue ; i ++ )
			System.out.printf("Name : %s / Surename : %s / ID : %s\n" ,
				teamBlue[i].getName() , teamBlue[i].getSurename() , teamBlue[i].getId()) ; 	
	}
}

