// BWOTSHEWCHB

import java.util.ArrayList ;
import java.util.Collections ;

public class Rectangle extends Polygon {
	// Fields 
	private ArrayList<Integer> sides ;
	// Constructor
	public Rectangle(int side1 , int side2 , int side3 , int side4) {
		sides = new ArrayList<Integer>() ;
		sides.add(side1) ;
		sides.add(side2) ;
		sides.add(side3) ;
		sides.add(side4) ;
		Collections.sort(sides) ;
	}
	// Methods
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	public boolean isSquare() {
		return (sides.get(0) == sides.get(3)) ;
	}
	public double calculatePerimeter() {
		return ((double)sides.get(0) + (double)sides.get(1) + (double)sides.get(2) + (double)sides.get(3)) ;
	}
	public double calculateArea() {
		return ((double)sides.get(0) * (double)sides.get(3)) ;
	}
	public void draw() {
		System.out.println("This is a Rectangle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
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
	@Override
	public String toString() {
		return ("This is a Rectangle\n" +
			"Sides : {" + getSides().get(0) + " , " + getSides().get(1) + " , " + getSides().get(2) + " , " + getSides().get(3) + "}") ;
	}
}

