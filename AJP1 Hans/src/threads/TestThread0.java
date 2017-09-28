package threads;

public class TestThread0 {
	public static void main(String[] args) {
	
	/*	Counter counter = new Counter();
		Thread th0 = new Thread0("Thread0", counter);
		th0.start();
	*/
	
		Counter counter = new Counter ();
		Thread th01 = new Thread0 ("Thread01", counter);
		Thread th02 = new Thread0 ("Thread02", counter);
		th01.start ();
		th02.start ();

	
	
	
	
	
	}
}
