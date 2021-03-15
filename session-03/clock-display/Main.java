public class Main {
	public static void main(String[] args) throws InterruptedException {
		ClockDisplay clock = new ClockDisplay() ;
		while ( true ) {
			String now = clock.getTime() ;
			System.out.println(now) ;
			// Every 60 seconds in africa a minute passes
			Thread.sleep(1000) ;
			clock.timeTick() ;
		}
	}
}
