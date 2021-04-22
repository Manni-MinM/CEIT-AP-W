// BWOTSHEWCHB

import java.util.ArrayList ;

public class Paint {
	// Fields
	private ArrayList<Triangle> triangles ;
	private ArrayList<Circle> circles ;
//	private ArrayList<Rectangle> rectangles ;
	// Constructor
	public Paint() {
		triangles = new ArrayList<Triangle>() ;
		circles = new ArrayList<Circle>() ;
//		rectangles = new ArrayList<Rectangle>() ;
	}
	// Methods
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle) ;
	}
	public void addCircle(Circle circle) {
		circles.add(circle) ;
	}
}
