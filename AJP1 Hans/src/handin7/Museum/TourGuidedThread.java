package handin7.Museum;

//simulates the tour guide
public class TourGuidedThread extends Thread {

	private final int MAX = 15;
	private final int MIN = 1;
	private MuseumCounter mc;
	private int numberInGroup;
	private int times = 10;

	public TourGuidedThread(String name, MuseumCounter mc, int numberInGroup) {
		super(name);	
		this.numberInGroup = numberInGroup;
			this.mc = mc;
	}

	public void run() {
		for(int i=0;i<times; i++)
		{
		arrivalOfVisitors();
		mc.enter(numberInGroup);
		visiting();
		mc.leave(numberInGroup);
		}
	}
	private synchronized void arrivalOfVisitors() {
		System.out.println(getName() + " Visitors arriving: " + numberInGroup);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}
	private synchronized void visiting() {
		System.out.println(getName() + " Visiting");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

	}
}
