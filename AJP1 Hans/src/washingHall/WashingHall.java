package washingHall;

public class WashingHall implements IWashingHall {

	private final int MAX = 5;
	private int washingPlaces;
	private boolean changed;

	public WashingHall(int washing) {
		washingPlaces = washing;
		changed = false;
	}

	@Override
	public synchronized void enterForWashing() {
		while (washingPlaces == MAX || changed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			washingPlaces++;
			changed = true;
			notifyAll();
		}

	}

	@Override
	public synchronized void leaveWashing() {

		washingPlaces--;
		changed = true;
		notifyAll();
	}

	@Override
	public synchronized int getFreePlaces() {

		while (!changed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		changed = false;;
		return MAX - washingPlaces;

	}

}
