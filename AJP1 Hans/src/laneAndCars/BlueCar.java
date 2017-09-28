package laneAndCars;

public class BlueCar extends Thread {

	//private SingleLaneSafe lane;
	private SingleLaneSafeAndFair lane;
	
	
	/*public BlueCar(String name, SingleLaneSafe lane) {
		super(name);
		this.lane = lane;
	}*/
	public BlueCar(String name, SingleLaneSafeAndFair lane) {
		super(name);
		this.lane = lane;
	}

	public void run() {
		comingFromRight();
		enterFromRight();
		onLane();
		exitToLeft();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private synchronized void comingFromRight() {
		System.out.println(getName() + " coming from right");
	}
	private synchronized void enterFromRight()
	{
		lane.enterFromTheRight();
		System.out.println(getName() + " enter from Right");
	}

	private synchronized void onLane() {
		System.out.println(getName() + " on Lane");
	}
	private synchronized void exitToLeft()
	{
		lane.exitToTheLeft();
		System.out.println(getName() + " exit to Left");
	}

}
