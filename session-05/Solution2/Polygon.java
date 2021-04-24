// BWOTSHEWCHB

import java.util.ArrayList ;
import java.util.Collections ;

/**
 * A Class to hold information about Polygons
 */
public abstract class Polygon extends Shape {
	// Fields
	ArrayList<Integer> sides ;
	// Constructor
	/**
	 * Creates Polygon Object
	 *
	 * @param sides Sides of the Polygon
	 */
	public Polygon(int... sides) {
		this.sides = new ArrayList<Integer>() ;
		for ( int side : sides )
			this.sides.add(side) ;
		Collections.sort(this.sides) ;
	}
	// Methods
	/**
	 * Returns the sides of the Polygon
	 *
	 * @return sides An ArrayList containing the sides of the Polygon
	 */
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	/**
         * Returns the perimeter of the Polygon
         *
         * @return Perimeter of the Polygon
         */
	public abstract double calculatePerimeter() ;
	/**
         * Returns the area of the Polygon
         *
         * @return Area of the Polygon
         */
	public abstract double calculateArea() ;
	/**
         * Prints details about the Polygon
         */
	public abstract void draw() ;
	/** Checks if two Polygon Objects are equal
         *
         * @param object Object to be checked
         * @return True if Objects are the same otherwise returns False
         */
	public abstract boolean equals(Object object) ;
	/**
         * Converts Polygon Object to String format
         *
         * @return Polygon Object in String format
         */
	public abstract String toString() ; 
}

