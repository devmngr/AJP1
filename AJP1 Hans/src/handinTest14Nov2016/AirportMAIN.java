package handinTest14Nov2016;

public class AirportMAIN {

	public static void main(String[] args) {
		
		PassengerQueue US = new PassengerQueue();
		PassengerQueue nonUS = new PassengerQueue();
		
		Guide guide = new Guide("Guide1", US, nonUS);
		
		PassportController control1 = new PassportController("Control-1: ", US);
		PassportController control2 = new PassportController("Control-2: ", nonUS);
		
		
		
		guide.start();
		control1.start();
		control2.start();
		
		
	}

}
