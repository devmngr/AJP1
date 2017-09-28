package readWrite;

public class ReadWriteSafeAndFair2 implements IReadWrite {

	private int activeReaders;
	private int activeWriters;
	private int waitingReaders;
	private int waitingWriters;

	public ReadWriteSafeAndFair2() {
		activeReaders = 0;
		activeWriters = 0;
		waitingReaders = 0;
		waitingWriters = 0;
	}

	@Override
	public synchronized void acquireRead() {
		waitingReaders++;
		while (activeReaders > 0 || waitingWriters > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		waitingReaders--;
		activeReaders++;
	}

	@Override
	public synchronized void releaseRead() {
		activeReaders--;

		if (waitingWriters > 0 || waitingReaders > 0)
			notify();

	}

	@Override
	public synchronized void acquireWrite() {

		waitingWriters++;
		while (activeWriters > 0 || waitingWriters > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		waitingWriters--;
		activeWriters++;
	}

	@Override
	public synchronized void releaseWrite() {

		activeWriters--;
		notifyAll();

	}

}
