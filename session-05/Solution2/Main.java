// BWOTSHEWCHB

/**
 * Main Class
 */
public class Main {
	public static void main(String[] args) {
		Shape circle1 = new Circle(19) ;
		Circle circle2 = new Circle(3) ;
		Shape rect1 = new Rectangle(1 , 4 , 1 , 4) ;
		Polygon rect2 = new Rectangle(8 , 5,  8 , 5) ;
		Rectangle rect3 = new Rectangle(6 , 6 , 6 , 6) ;
		Shape tri1 = new Triangle(2 , 2 , 2) ;
		Triangle tri2 = new Triangle(4 , 4 , 6) ;
		Paint paint = new Paint() ;
		paint.addShape(circle1) ;
		paint.addShape(circle2) ;
		paint.addShape(rect1) ;
		paint.addShape(rect2) ;
		paint.addShape(rect3) ;
		paint.addShape(tri1) ;
		paint.addShape(tri2) ;
		paint.drawAll() ;
		paint.printAll() ;
		System.out.println("##########################################") ;
		paint.describeEqualSides() ;
	}
}

