package handinTest14Nov2016;

import java.util.Queue;

public class PassengerQueue implements IPassengerQueue {

	private LinkedQueue<Passenger> queue;

	public PassengerQueue() {
		this.queue = new LinkedQueue<Passenger>(true);

	}

	@Override
	public synchronized void putPassengerInQueue(Passenger p) {
		queue.enqueue(p);
	/*	if (queue.size() == 1)
			notify();
*/
	}

	@Override
	public synchronized Passenger getNextPassenger() {
	/*	while (queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}*/
		Passenger temp = queue.dequeue();
		return temp;
	}
}
