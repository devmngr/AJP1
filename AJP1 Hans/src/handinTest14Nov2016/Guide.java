package handinTest14Nov2016;

//TASK 3

public class Guide extends Thread{

	PassengerQueue US;
	PassengerQueue nonUS;
	Passenger passenger;
	
	public Guide(String name, PassengerQueue US, PassengerQueue nonUS)
	{
		super(name);
		this.US = US;
		this.nonUS = nonUS;
	}
	public void run()
	{
		while (true)
		{
			appearUS();
			putPassengerInRightQueue();
			appearNonUS();
			putPassengerInRightQueue();
			
		}
		
	}
	private synchronized void putPassengerInRightQueue()
	{
		if (passenger.getNationality().equals("US") )
		{
			US.putPassengerInQueue(passenger);
		}
		else
			nonUS.putPassengerInQueue(passenger);
		System.out.println(passenger);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private synchronized void appearUS()
	{
		passenger = new Passenger("US", 123456);
		
	}
	private synchronized void appearNonUS()
	{
		passenger = new Passenger("nonUS", 1456);
		
	}
	
	
}
