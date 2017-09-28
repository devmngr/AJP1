package readWrite;

public class ReadWriteSafeAndBetterForWriting implements IReadWrite {

	private int readers;
	private boolean writing;
	private int waitingWriters; // number of waiting writers

	public ReadWriteSafeAndBetterForWriting() {
		readers = 0;
		writing = false;
		waitingWriters = 0;

	}

	@Override
	public synchronized void acquireRead() {

		while (writing || waitingWriters > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		readers++;

	}

	@Override
	public synchronized void releaseRead() {
		readers--;
		if (waitingWriters > 0)
			notify();
	}

	@Override
	public synchronized void acquireWrite() {

		while (readers > 0 || writing) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		writing = true;
		
	}

	@Override
	public synchronized void releaseWrite() {
		writing = false;
		notifyAll();
	}

}
