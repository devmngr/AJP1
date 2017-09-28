package handinTest14Nov2016;
//TASK 3

public class PassportController extends Thread{

	PassengerQueue queue;
	public PassportController(String name, PassengerQueue queue)
	{
		super(name);
		this.queue=queue;
	}
	public void run()
	{
		
		while (true)
		{
			controlPassport();
		}
	}
	
	private synchronized void controlPassport()
	{
		
		System.out.println(queue.getNextPassenger().getPassportNumber());	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
