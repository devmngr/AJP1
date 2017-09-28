package ajp_Task_1_3_January2016;

public class Cashier extends Thread {
	private ISuperMarket supermarket;

	public Cashier(String name, Supermarket supermarket) {
		super(name);
		this.supermarket = supermarket;
	}

	public void run() {
		while (true) {
			try {
				prepare();
				starServing();
				execute();
				finishService();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void prepare() throws InterruptedException
	{
		System.out.println(getName() + " preparing");
		Thread.sleep(3000);
	}
	public synchronized void starServing() throws InterruptedException
	{
		supermarket.startNextServing();
		System.out.println( getName() + " started serving");
		Thread.sleep(3000);
	}
	
	public synchronized void execute() throws InterruptedException
	{
		System.out.println(getName() + " serving");
		Thread.sleep(3000);
	}
	public synchronized void finishService() throws InterruptedException
	{
		supermarket.serviceFinished();
		System.out.println( getName() + " finished service");
		Thread.sleep(3000);
	}
	
	

}
