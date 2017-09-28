package task3;

public class Channel implements IChannel {

	private String[] queue;
	private int count;

	public Channel() {

		queue = new String[1];
		count = 0;
	}

	@Override
	public synchronized void send(String message) {

		while (isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		queue[count] = message;
		count++;
		notify();

	}

	@Override
	public synchronized String receive() {

		while (isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		String temp = queue[count-1];
		queue[count-1] = null;
		count--;
		notify();
		return temp;

	}

	private boolean isFull() {
		return count == queue.length;
	}

	private boolean isEmpty() {

		return count == 0;
	}
}
