package readWrite;

public class Reader extends Thread {
	private ReadWriteSafe lock;
	private ReadWriteSafeAndBetterForWriting lock2;
	private ReadWriteSafeAndFair2 lock3;

	private int type;

	private String reader;
	private int count = 0;

	public Reader(String reader, ReadWriteSafe lock) {

		this.lock = lock;
		this.reader = reader;

	}

	public Reader(String reader, ReadWriteSafeAndBetterForWriting lock) {

		this.lock2 = lock;
		this.reader = reader;

	}

	public Reader(String reader, ReadWriteSafeAndFair2 lock) {

		this.lock3 = lock;
		this.reader = reader;

	}

	/*
	 * //ReadWriteSafe public void run() {
	 * 
	 * while (count < 5) { beforeReading(); lock.acquireRead(); reading();
	 * lock.releaseRead(); afterReading(); count++; } }
	 */
	/*
	 * //ReadWriteSafeAndBetterForWriting public void run() { while (count < 5)
	 * { beforeReading(); lock2.acquireRead(); reading(); lock2.releaseRead();
	 * afterReading(); count++; } }
	 */

	// ReadWriteSafeAndFair2
	public void run() {
		while (count < 5) {
			beforeReading();
			lock3.acquireRead();
			reading();
			lock3.releaseRead();
			afterReading();
			count++;
		}
	}

	private synchronized void beforeReading() {
		System.out.println(reader + " start read");
	}

	private synchronized void reading() {
		System.out.println(reader + "  reading");
	}

	private synchronized void afterReading() {
		System.out.println(reader + " end read");
	}

}
