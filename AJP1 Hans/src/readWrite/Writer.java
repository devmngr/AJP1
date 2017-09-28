package readWrite;

public class Writer extends Thread {
	private ReadWriteSafe lock;
	private ReadWriteSafeAndBetterForWriting lock2;
	private ReadWriteSafeAndFair2 lock3;

	private String writer;
	private int count = 0;;

	public Writer(String writer, ReadWriteSafe lock) {

		this.lock = lock;
		this.writer = writer;
	}

	public Writer(String writer, ReadWriteSafeAndBetterForWriting lock) {

		this.lock2 = lock;
		this.writer = writer;
		
	}
	public Writer(String writer, ReadWriteSafeAndFair2 lock) {

		this.lock3 = lock;
		this.writer = writer;
		
	}

	/*
	   //ReadWriteSafe
	   public void run() {

			while (count < 5) {
				beforeReading();
				lock.acquireWrite();
				reading();
				lock.releaseWrite();
				afterReading();
				count++;
			}
		} 
		*/

	/*
	//ReadWriteSafeAndBetterForWriting
		public void run() {
			while (count < 5) {
				beforeReading();
				lock2.acquireWrite();
				reading();
				lock2.releaseWrite();
				afterReading();
				count++;
			}
		}

	*/
	
	//ReadWriteSafeAndFair2
	public void run() {
		while (count < 5) {
			beforeReading();
			lock3.acquireWrite();
			reading();
			lock3.releaseWrite();
			afterReading();
			count++;
		}
	}
	
	

	private synchronized void beforeReading() {
		System.out.println(writer + " write started");
	}

	private synchronized void reading() {
		System.out.println(writer + " writing");
	}

	private synchronized void afterReading() {
		System.out.println(writer + " write ended");
	}
}
