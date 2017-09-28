package washingHall;

public class DisplayThread extends Thread {

	private IWashingHall hall;

	public DisplayThread(String name, IWashingHall hall) {
		super(name);
		this.hall = hall;
	}

	public void run() {
		while (true) {
			freePlaces();
		}

	}

	private synchronized void freePlaces() {
		int free = hall.getFreePlaces();
		System.out.println("Free places; " + free);
	}

	private synchronized void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
