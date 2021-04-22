// BWOTSHECHB

import java.lang.Math ;
import java.util.ArrayList ;

public class Triangle extends Polygon {
	// Fields
	private ArrayList<Integer> sides ;
	// Constructor
	public Triangle(int side1 , int side2 , int side3) {
		sides = new ArrayList<Integer>() ;
		sides.add(side1) ;
		sides.add(side2) ;
		sides.add(side3) ;
	}
	// Methods
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	public boolean isEquilateral() {
		return (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)) ;
	}
	public double calculatePerimeter() {
		return ((double)sides.get(0) + (double)sides.get(1) + (double)sides.get(2)) ;
	}
	public double calculateArea() {
		double semiPerimeter = calculatePerimeter() / 2.0 ;
		return Math.sqrt(semiPerimeter * (semiPerimeter - (double)sides.get(0)) * (semiPerimeter - (double)sides.get(1)) * (semiPerimeter - (double)sides.get(2))) ;
	}
	public void draw() {
		System.out.println("This is a Triangle") ;
		System.out.printf("Perimeter : %f\n" , calculatePerimeter()) ;
		System.out.printf("Area : %f\n" , calculateArea()) ;
	}
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
	@Override
	public String toString() {
		return ("This is a Triangle\n" +
				"Sides : {" + sides.get(0) + " , " + sides.get(1) + " , " + sides.get(2) + "}") ;
	}
}

