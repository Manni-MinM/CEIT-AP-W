// BWOTSHEWCHB

public class Main {
	public static void main(String[] args) {
		Paint paint = new Paint() ;
		
		Triangle myTriangle = new Triangle(3 , 3 , 3) ;
		paint.addTriangle(myTriangle) ;
		
		Circle myCircle = new Circle(4) ;
		paint.addCircle(myCircle) ;
		
		myTriangle.draw() ;
		myCircle.draw() ;
	}
}

