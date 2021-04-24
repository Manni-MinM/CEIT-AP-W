// BWOTSHEWCHB

import java.util.ArrayList ;

/**
 * A Class to hold information about all Paint Objects
 */
public class Paint {
	// Fields
	ArrayList<Shape> shapes ;
	// Constructor
	/**
	 * Creates Paint Object
	 */
	public Paint() {
		shapes = new ArrayList<Shape>() ;
	}
	// Methods
	/**
	 * Adds Shape Object to the list of Shapes
	 *
	 * @param shape The Shape to be added to the list
	 */
	public void addShape(Shape shape) {
		shapes.add(shape) ;
	}
	/**
         * Prints details about every Object in the list
         */
	public void drawAll() {
		for ( Shape shape : shapes )
			shape.draw() ;
	}
	/**
         * Converts each Object in the list to String format and prints it
         */
	public void printAll() {
		for ( Shape shape : shapes )
			System.out.println(shape.toString()) ;
	}
	/**
	 * Prints details about Objects with equal sides
	 */
	public void describeEqualSides() {
		for ( Shape shape : shapes ) {
			if ( shape instanceof Triangle ) {
				Triangle triangle = (Triangle)shape ;
				if ( triangle.isEquilateral() )
					System.out.println(triangle.toString()) ;
			}
			else if ( shape instanceof Rectangle ) {
				Rectangle rectangle = (Rectangle)shape ;
				if ( rectangle.isSquare() )
					System.out.println(rectangle.toString()) ;
			}
		}
	}
}
