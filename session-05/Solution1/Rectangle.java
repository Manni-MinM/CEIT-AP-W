// BWOTSHEWCHB

import java.util.ArrayList ;
import java.util.Collections ;

/**
 * A Class to hold information about Rectangles
 */
public class Rectangle {
	// Fields 
	private ArrayList<Integer> sides ;
	// Constructor
	/**
	 * Creates Rectangle Object
	 *
	 * @param side1 Side 1
	 * @param side2 Side 2
	 * @param side3 Side 3
	 * @param side4 Side 4
	 */
	public Rectangle(int side1 , int side2 , int side3 , int side4) {
		sides = new ArrayList<Integer>() ;
		sides.add(side1) ;
		sides.add(side2) ;
		sides.add(side3) ;
		sides.add(side4) ;
		Collections.sort(sides) ;
	}
	// Methods
	/**
	 * Returns the sides of the Rectangle
	 *
	 * @return An ArrayList containing the sides of the Rectangle
	 */
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	/**
	 * Checks if the Rectangle is a square
	 *
	 * @return True if the Rectangle is a square otherwise False
	 */
	public boolean isSquare() {
		return (sides.get(0) == sides.get(3)) ;
	}
	/**
	 * Returns the perimeter of the Rectangle
	 *
	 * @return Perimeter of the rectangle
	 */
	public double calculatePerimeter() {
		return ((double)sides.get(0) + (double)sides.get(1) + (double)sides.get(2) + (double)sides.get(3)) ;
	}
	/**
	 * Returns the area of the Rectangle
	 *
	 * @return Area of the Rectangle
	 */
	public double calculateArea() {
		return ((double)sides.get(0) * (double)sides.get(3)) ;
	}
	/**
	 * Prints details about the Rectangle
	 */
	public void draw() {
		System.out.println("This is a Rectangle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
	/**
	 * Checks if two Rectangle Objects are equal
	 *
	 * @param object Object to be checked
	 * @return True if Objects are the same otherwise returns False
	 */
	@Override
	public boolean equals(Object object) {
		if ( !(object instanceof Rectangle) )
			return false ;
		if ( this == object )
			return true ;
		Rectangle rectangle = (Rectangle) object ;
		return (this.getSides().get(0) == rectangle.getSides().get(0) &&
			this.getSides().get(1) == rectangle.getSides().get(1) &&
			this.getSides().get(2) == rectangle.getSides().get(2) &&
			this.getSides().get(3) == rectangle.getSides().get(3)) ;
	}
	/**
	 * Converts Rectangle Object to String format
	 *
	 * @return Rectangle Object in String format
	 */
	@Override
	public String toString() {
		return ("This is a Rectangle\n" +
			"Sides : {" + getSides().get(0) + " , " + getSides().get(1) + " , " + getSides().get(2) + " , " + getSides().get(3) + "}") ;
	}
}

