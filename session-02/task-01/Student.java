/**
	@author MinM
	@version 1.0
	
	@param name : name of the student
	@param surename : surname of the student
	@param age : age of the student
*/

public class Student {
	// Attributes
	private String name ;
	private String surename ;
	private String id ;
	private int grade ;
	// Constructor
	public Student(String name , String surename , String id) {
		this.name = name ;
		this.surename = surename ;
		this.id = id ;
		this.grade = 0 ;
	}
	// Getters
	public String getName()
		{ return name ; }
	public String getSurename()
		{ return surename ; }
	public String getId()
		{ return id ; }
	public int getGrade()
		{ return grade ; }
	// Setters
	public void setName(String name)
		{ this.name = name ; }
	public void setSurename(String surename)
		{ this.surename = surename ; }
	public void setId(String id)
		{ this.id = id ; }
	public void setGrade(int grade)
		{ this.grade = grade ; }
	// Methods
	public void print()
		{ System.out.println(surename + ", student ID: " + id + ", grade: " + grade) ; }
}

