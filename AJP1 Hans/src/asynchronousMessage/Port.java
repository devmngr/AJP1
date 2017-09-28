package asynchronousMessage;

import barberShop.QueueAsCircularArray;

public class Port implements IPort {

	private QueueAsCircularArray queue;
	private final int DEFAULT_VALUE = 5;

	public Port() {
		queue = new QueueAsCircularArray(DEFAULT_VALUE);
	}

	@Override
	public synchronized boolean send(String message) {

		if (queue.isFull())
			return false;

		queue.put(message);
		notify();
		return true;

	}

	@Override
	public synchronized String receive() {

		while (queue.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String message = (String) queue.take();

		return message;

	}

}
