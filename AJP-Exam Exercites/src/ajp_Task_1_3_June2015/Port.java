package ajp_Task_1_3_June2015;

import java.util.Queue;

public class Port implements IPort {

	private QueueAsCircularArray queue;

	public Port() {
		queue = new QueueAsCircularArray(5);

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

		if(queue.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		String msg = (String)queue.take();
		return msg;
		
	}

}
