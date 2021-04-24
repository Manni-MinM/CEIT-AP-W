// BWOTSHEWCHB

import java.lang.Math ;

/**
 * A Class to hold information about Circles
 */
public class Circle extends Shape {
	// Fields
	private int radius ;
	// Constructor
	/**
	 * Creates Circle Object
	 *
	 * @param radius Radius of the Circle
	 */
	public Circle(int radius) {
		this.radius = radius ;
	}
	// Methods
	/**
	 * Returns the radius of the Circle 
	 *
	 * @return Radius of the Circle 
	 */
	public int getRadius() {
		return radius ;
	}
	/**
	 * Returns the perimeter of the Circle 
	 *
	 * @return Perimeter of the Circle 
	 */
	public double calculatePerimeter() {
		return (2.0 * Math.PI * (double)radius) ;
	}
	/**
	 * Returns the are of the Circle 
	 *
	 * @return Area of the Circle 
	 */
	public double calculateArea() {
		return (Math.PI * (double)radius * (double)radius) ;
	}
	/**
	 * Prints details about the Circle
	 */
	public void draw() {
		System.out.println("This is a Circle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
	/**
	 * Checks if two Circle Objects are equal
	 *
	 * @param object Object to be checked
	 * @return True if Objects are the same otherwise returns False
	 */
	@Override
	public boolean equals(Object object) {
		if ( !(object instanceof Circle) )
			return false ;
		if ( object == this )
			return true ;
		Circle circle = (Circle)object ;
		return (this.getRadius() == circle.getRadius()) ;
	}
	/**
	 * Converts Circle Object to String format
	 *
	 * @return Circle Object in String format
	 */
	@Override
	public String toString() {
		return "This is a Circle\n" +
			"Radius : " + radius ;
	}
}

