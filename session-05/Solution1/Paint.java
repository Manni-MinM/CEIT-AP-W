// BWOTSHEWCHB

import java.util.ArrayList ;

public class Paint {
	// Fields
	private ArrayList<Triangle> triangles ;
	private ArrayList<Circle> circles ;
	private ArrayList<Rectangle> rectangles ;
	// Constructor
	public Paint() {
		triangles = new ArrayList<Triangle>() ;
		circles = new ArrayList<Circle>() ;
		rectangles = new ArrayList<Rectangle>() ;
	}
	// Methods
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle) ;
	}
	public void addCircle(Circle circle) {
		circles.add(circle) ;
	}
	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle) ;
	}
	public void drawAll() {
		for ( Triangle triangle : triangles )
			triangle.draw() ;
		for ( Circle circle : circles )
			circle.draw() ;
		for ( Rectangle rectangle : rectangles )
			rectangle.draw() ;
	}
	public void printAll() {
		for ( Triangle triangle : triangles )
			System.out.println(triangle.toString()) ;
		for ( Circle circle : circles )
			System.out.println(circle) ;
		for ( Rectangle rectangle : rectangles )
			System.out.println(rectangle) ;
	}
}

