package laneAndCars;

public class RedCar extends Thread{

	//private SingleLaneSafe lane;	
	private SingleLaneSafeAndFair lane;
	
	
	
	/*public RedCar(String name, SingleLaneSafe lane)
	{
		super(name);
		this.lane = lane;
	}*/
	public RedCar(String name, SingleLaneSafeAndFair lane)
	{
		super(name);
		this.lane = lane;
	}
	
	
	public void run()
	{
		comingFromLeft();
		enterFromLeft();
		onLane();
		exitToRight();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private synchronized void comingFromLeft() {
		System.out.println(getName() + " coming from left");
		
	}
	
	private synchronized void enterFromLeft()
	{
		lane.enterFromTheLeft();
		System.out.println(getName() + " enter from Left");
	}
	private synchronized void onLane() {
		System.out.println(getName() + " on Lane");
	}
	private synchronized void exitToRight()
	{
		lane.exitToTheRight();
		System.out.println(getName() + " exit to right");
	}
	
	
}
