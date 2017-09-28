package handin7.Museum;

public class MuseumCounter {

	private final long MAX = 30;
	private int noOfVisitors;
	private boolean changed;

	MuseumCounter() {
		noOfVisitors = 0;
		changed = true;
	}

	// numberInGroup is the number of
	// visitors entering the museum
	// with a guide
	public synchronized void enter(int numberInGroup) {
		System.out.println(numberInGroup + " enter Museum");
		while ((numberInGroup + noOfVisitors) > MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
			}

		}
		noOfVisitors += numberInGroup;
		changed =true;
		notifyAll();
		
	}

	// numberInGroup is the (same) number
	// of visitors leaving the museum
	// with the guide
	public synchronized void leave(int numberInGroup) {
		System.out.println(numberInGroup + " leave Museum");
		noOfVisitors -= numberInGroup;
		changed =true;
		notifyAll();
		
	}

	// returns the number of visitors in the museum;
	// if no change in the number, the calling thread
	// is blocked (a condition wait)

	public synchronized int getNumber() {
		while (!changed) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		changed = false;
		return noOfVisitors;
	}

}
