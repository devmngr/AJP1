package threads;

public class Thread0 extends Thread {
	private Counter counter;
	private final int N = 500 * 1000 * 1000;

	public Thread0(String name, Counter counter) {
		super(name);
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < N; i++)
			counter.inc();
		System.out.println(getName() + " finished: Counter.value = "
				+ counter.value());
	}
}
