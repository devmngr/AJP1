/*
 * This monitor implementation suffers from the WRITE progress problem: 
 * possible writer starvation if the number of readers never drops to zero
*/
package readWrite;

public class ReadWriteSafe implements IReadWrite {

	private int readers;
	private boolean writing; // or: int writers = 0;

	public ReadWriteSafe() {

		readers = 0;
		writing = false;
	}

	@Override
	public synchronized void acquireRead() {

		while (writing) {
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
		if (readers == 0)
			notify(); // Unblock a single writer when no more readers

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
		notifyAll();	//Unblock all readers
	}

}
