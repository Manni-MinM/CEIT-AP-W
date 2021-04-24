// BWOTSHEWCHB

import java.util.ArrayList ;

/**
 * A Class to hold information about all Paint Objects
 */
public class Paint {
	// Fields
	private ArrayList<Triangle> triangles ;
	private ArrayList<Circle> circles ;
	private ArrayList<Rectangle> rectangles ;
	// Constructor
	/**
	 * Creates Paint Object
	 */
	public Paint() {
		triangles = new ArrayList<Triangle>() ;
		circles = new ArrayList<Circle>() ;
		rectangles = new ArrayList<Rectangle>() ;
	}
	// Methods
	/**
	 * Adds Triangle Object to the list of Triangles
	 *
	 * @param triangle The Triangle to be added to the list
	 */
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle) ;
	}
	/**
	 * Adds Circle Object to the list of Circles
	 *
	 * @param circle The Circle to be added to the list
	 */
	public void addCircle(Circle circle) {
		circles.add(circle) ;
	}
	/**
	 * Adds Rectangle Object to the list of Rectangles
	 *
	 * @param rectangle The Rectangle to be added to the list
	 */
	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle) ;
	}
	/**
	 * Prints details about every Object in the list
	 */
	public void drawAll() {
		for ( Triangle triangle : triangles )
			triangle.draw() ;
		for ( Circle circle : circles )
			circle.draw() ;
		for ( Rectangle rectangle : rectangles )
			rectangle.draw() ;
	}
	/**
	 * Converts each Object in the list to String format and prints it
	 */
	public void printAll() {
		for ( Triangle triangle : triangles )
			System.out.println(triangle.toString()) ;
		for ( Circle circle : circles )
			System.out.println(circle) ;
		for ( Rectangle rectangle : rectangles )
			System.out.println(rectangle) ;
	}
}

