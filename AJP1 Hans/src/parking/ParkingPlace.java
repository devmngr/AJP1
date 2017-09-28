package parking;

public class ParkingPlace implements IParkingPlace {

	private final int MAX;
	private int nrOfCars;
	private boolean changed;

	public ParkingPlace(int max) {
		this.MAX = max;
		nrOfCars = 0;
		changed = true;
	}

	public synchronized void arrive() {
		System.out.println("Arrive at Parking Palce");
		while (nrOfCars == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		nrOfCars++;
		changed = true;
		notifyAll();
	}

	@Override
	public synchronized void leave() {
		System.out.println("Leaving Parking");
		nrOfCars--;
		changed = true;
		notifyAll();
	}

	@Override
	public synchronized int freePlaces() {
		while (!changed) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		changed = false;
		return MAX - nrOfCars;
	}

	private boolean isFull() {
		return MAX == nrOfCars;
	}

}
