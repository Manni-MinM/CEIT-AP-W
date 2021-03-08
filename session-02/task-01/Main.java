public class Main {
	public static void main(String[] args) {
		Student std1 = new Student("Ehsan","Edalat", "9031066") ;
		Student std2 = new Student("Seyed", "Ahmadpanah", "9031806") ;
		Student std3 = new Student("Ahmad", "Asadi", "9031054") ;

		std1.print() ;
		std1.setGrade(15) ;
		std1.print() ;

		std2.print() ;
		std2.setGrade(11) ;
		std2.print() ;

		std3.print() ;
		std3.setName("HamidReza") ;
		std3.print() ;
		
		Lab lab = new Lab(5 , "monday") ;
		
		lab.enrollStudent(std1) ;
		lab.enrollStudent(std2) ;
		lab.enrollStudent(std3) ;
		
		lab.print() ;
	
		FootballField field = new FootballField(4 , 5 , "friday") ;
		
		field.addToTeamRed(std1) ;
		field.addToTeamRed(std2) ;
	
		field.addToTeamBlue(std3) ;
		
		field.printRed() ;
	}
}
