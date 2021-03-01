import java.util.Scanner ;

public class Main {
	static int gcd(int x , int y) {
		if ( y == 0 )
			return x ;
		return gcd(y , x % y) ;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int x = input.nextInt() ;
		int y = input.nextInt() ;
		boolean ans = (gcd(x , y) == 1 ? true : false) ;
		if ( ans )
			System.out.println("YES") ;
		else
			System.out.println("NO") ;
	}
}
