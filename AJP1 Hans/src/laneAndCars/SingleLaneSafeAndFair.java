package laneAndCars;

public class SingleLaneSafeAndFair implements ILane{

	private int leftCarsOnLane, rightCarsOnLane;
	private int leftCarsWaiting, rightCarsWaiting;
	private boolean leftTurn;
	
public SingleLaneSafeAndFair() {
	leftCarsOnLane = 0;
	rightCarsOnLane = 0;
}
	
	
	@Override
	public synchronized void enterFromTheLeft() {
		leftCarsWaiting++;
		while (rightCarsOnLane > 0 || rightCarsWaiting>0 && !leftTurn) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		leftCarsOnLane++; 
		leftCarsWaiting--;
	}

	@Override
	public synchronized void exitToTheRight() {

		leftCarsOnLane--;
		leftTurn = false;
		if (leftCarsOnLane == 0)
			notifyAll();
	}

	@Override
	public synchronized void enterFromTheRight() {
		rightCarsWaiting++;
		while (leftCarsOnLane > 0 || leftCarsWaiting>0 && leftTurn) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		rightCarsOnLane++;
		rightCarsWaiting--;
	}

	@Override
	public synchronized void exitToTheLeft() {
		rightCarsOnLane--;
		leftTurn = true;
		if (rightCarsOnLane == 0)
			notifyAll();
		
	}

}
