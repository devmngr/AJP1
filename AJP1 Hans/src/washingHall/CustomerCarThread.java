package washingHall;

public class CustomerCarThread extends Thread{

	private IWashingHall hall;
	
	public CustomerCarThread(String name, IWashingHall hall)
	{
		super(name);
		this.hall=hall;
	}
	
	public void run()
	{
		while (true)
		{
			enterWashing();
			washing();
			leave();
			sleep();
			
		}
	}
	
	private synchronized void enterWashing()
	{
		hall.enterForWashing();
		System.out.println(getName() + " enters" );
	}
	
	private synchronized void leave()
	{
		hall.leaveWashing();
		System.out.println(getName() + " leaving");
		
		
	}
	private synchronized void washing()
	{
		System.out.println("washing..."+ getName());

	}
	private synchronized void sleep()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
