// BWOTSHECHB

import java.lang.Math ;

public class Circle {
	// Fields
	private int radius ;
	// Constructor
	public Circle(int radius) {
		this.radius = radius ;
	}
	// Methods
	public int getRadius() {
		return radius ;
	}
	public double calculatePerimeter() {
		return (2.0 * Math.PI * (double)radius) ;
	}
	public double calculateArea() {
		return (Math.PI * (double)radius * (double)radius) ;
	}
	public void draw() {
		System.out.println("This is a Circle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
	@Override
	public boolean equals(Object object) {
		if ( !(object instanceof Circle) )
			return false ;
		if ( object == this )
			return true ;
		Circle circle = (Circle)object ;
		return (this.getRadius() == circle.getRadius()) ;
	}
	@Override
	public String toString() {
		return "This is a Circle\n" +
			"Radius : " + radius ;
	}
}

