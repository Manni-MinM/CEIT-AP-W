public class Lab {
	// Attributes
	private Student[] students ;
	private int avg ;
	private String day ;
	private int capacity ;
	private int currentSize ;
	// Constructor
	public Lab(int cap , String d) {
		this.capacity = cap ;
		this.day = d ;
		
		students = new Student[capacity] ;
	}
	// Getters
	public Student[] getStudents() 
		{ return students ; }
	public int getAvg() 
		{ return avg ; }
	public String getDay() 
		{ return day ; }
	public int getCapacity() 
		{ return capacity ; }
	// Setters
	public void setStudents(Student[] students)
		{ this.students = students ; }
	public void calculateAvg() {
		int sum = 0 ;
		for ( int i = 0 ; i < currentSize ; i ++ )
			sum += students[i].getGrade() ;
		this.avg = sum / currentSize ;
	}
	public void setDay(String day) 
		{ this.day = day ; }
	public void setCapacity(int capacity) 
		{ this.capacity = capacity ; }
	// Methods
	public void enrollStudent(Student std) {
		if ( currentSize < capacity ) {
			students[currentSize] = std ;
			currentSize++ ;
		}
		else
			System.out.println("Lab is full!!!") ;
	}
	public void print() {
		for ( int i = 0 ; i < currentSize ; i ++ )
			System.out.printf("Name : %s / Surename : %s / ID : %s / Grade : %d\n" ,
				students[i].getName() , students[i].getSurename() , students[i].getId() , students[i].getGrade() ) ; 
		
		calculateAvg() ;
		System.out.printf("Class Average : %d\n" , getAvg()) ;
	}
}

