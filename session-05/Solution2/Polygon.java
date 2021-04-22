// BWOTSHECHB

import java.util.ArrayList ;
import java.util.Collections ;

public abstract class Polygon extends Shape {
	// Fields
	ArrayList<Integer> sides ;
	// Constructor
	public Polygon(int... sides) {
		this.sides = new ArrayList<Integer>() ;
		for ( int side : sides )
			this.sides.add(side) ;
		Collections.sort(this.sides) ;
	}
	// Methods
	public ArrayList<Integer> getSides() {
		return sides ;
	}
	public abstract double calculatePerimeter() ;
	public abstract double calculateArea() ;
	public abstract void draw() ;
	public abstract boolean equals(Object object) ;
	public abstract String toString() ; 
}

