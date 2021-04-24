// BWOTSHEWCHB

import java.lang.Math ;
import java.util.ArrayList ;

/**
 * A Class to hold information about Triangles
 */
public class Triangle {
	// Fields
	private ArrayList<Integer> sides ;
	// Constructor
	/**
	 * Creates Triangle Object
	 *
	 * @param side1 Side 1
	 * @param side2 Side 2
	 * @param side3 Side 3
	 */
	public Triangle(int side1 , int side2 , int side3) {
		sides = new ArrayList<Integer>() ;
		sides.add(side1) ;
		sides.add(side2) ;
		sides.add(side3) ;
	}
	// Methods
	/**
	 * Returns the sides of the Triangle
	 *
	 * @return An ArrayList Containing the sides of the Triangle
	 */
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	/**
	 * Checks if the Triangle is Equilateral
	 *
	 * @return True if the Triangle is Equilateral otherwise False
	 */
	public boolean isEquilateral() {
		return (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)) ;
	}
	/**
	 * Returns the perimeter of the Triangle 
	 *
	 * @return Perimeter of the Triangle
	 */
	public double calculatePerimeter() {
		return ((double)sides.get(0) + (double)sides.get(1) + (double)sides.get(2)) ;
	}
	/**
	 * Returns the area of the Triangle
	 *
	 * @return Area of the Triangle
	 */
	public double calculateArea() {
		double semiPerimeter = calculatePerimeter() / 2.0 ;
		return Math.sqrt(semiPerimeter * (semiPerimeter - (double)sides.get(0)) * (semiPerimeter - (double)sides.get(1)) * (semiPerimeter - (double)sides.get(2))) ;
	}
	/**
	 * Prints details about the Triangle
	 */
	public void draw() {
		System.out.println("This is a Triangle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
	/**
	 * Checks if two Triangle Objects are equal
	 *
	 * @param object Object to be checked
	 * @return True if Objects are the same otherwise returns False
	 */
	@Override
	public boolean equals(Object object) {
		if ( !(object instanceof Triangle) )
			return false ;
		if ( object == this )
			return true ;
		Triangle triangle = (Triangle)object ;
		return (this.getSides().get(0) == triangle.getSides().get(0) &&
			this.getSides().get(1) == triangle.getSides().get(1) &&
			this.getSides().get(2) == triangle.getSides().get(2)) ;
	}
	/**
	 * Converts Triangle Object to String format
	 *
	 * @return Triangle Object in String format
	 */
	@Override
	public String toString() {
		return ("This is a Triangle\n" +
				"Sides : {" + sides.get(0) + " , " + sides.get(1) + " , " + sides.get(2) + "}") ;
	}
}

