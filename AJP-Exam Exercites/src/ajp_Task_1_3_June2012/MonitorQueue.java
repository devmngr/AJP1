package ajp_Task_1_3_June2012;

public class MonitorQueue implements IMonitorQueue {

	private char[] queue;
	private int count, front;

	public MonitorQueue(int size) {
		queue = new char[size];
		count = 0;
		front = 0;
	}

	@Override
	public synchronized void put(char c) {
		if (!isFull()) {
			queue[count] = c;
			count++;
		}
	}

	@Override
	public synchronized char take() {
		while (isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		char temp = queue[front];
		front++;
		count--;
		return temp;

	}

	@Override
	public synchronized void putAll(String str) {

		for (int i = 0; i < str.length(); i++)
		{	char c = str.charAt(i);
			put(c);
			}
		
	}

	private boolean isFull() {
		return count == queue.length;
	}

	public boolean isEmpty() {
		return count == 0;
	}

}
