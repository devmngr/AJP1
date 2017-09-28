package laneAndCars;

public class SingleLaneSafe implements ILane {

	private int leftCarsOnLane, rightCarsOnLane;

	public SingleLaneSafe() {
		leftCarsOnLane = 0;
		rightCarsOnLane = 0;

	}

	@Override
	public synchronized void enterFromTheLeft() {

		while (rightCarsOnLane > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		leftCarsOnLane++;
	}

	@Override
	public synchronized void exitToTheRight() {
		leftCarsOnLane--;
		if (leftCarsOnLane == 0)
			notifyAll();
	}

	@Override
	public synchronized void enterFromTheRight() {
		while (leftCarsOnLane > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		rightCarsOnLane++;
	}

	@Override
	public synchronized void exitToTheLeft() {
		rightCarsOnLane--;
		if (rightCarsOnLane == 0)
			notifyAll();
	}

}
