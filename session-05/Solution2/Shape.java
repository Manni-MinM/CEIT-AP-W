// BWOTSHEWCHB

/**
 * A Class to hold information about Shapes
 */
public abstract class Shape {
	// Methods
	/**
         * Returns the perimeter of the Shape
         *
         * @return Perimeter of the Shape
         */
	public abstract double calculatePerimeter() ;
	/**
         * Returns the area of the Shape
         *
         * @return Area of the Shape
         */
	public abstract double calculateArea() ;
	/**
         * Prints details about the Shape
         */
	public abstract void draw() ;
	/** Checks if two Shape Objects are equal
         *
         * @param object Object to be checked
         * @return True if Objects are the same otherwise returns False
         */
	public abstract boolean equals(Object object) ;
	/**
         * Converts Shape Object to String format
         *
         * @return Shape Object in String format
         */
	public abstract String toString() ; 
}
