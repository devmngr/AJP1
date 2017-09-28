package asynchronousMessage;

public class Reciever extends Thread {

	private Port port;

	public Reciever(String name, Port port) {
		super(name);
		this.port = port;

	}

	public void run() {
		while (true) {
			recieveMsg();
		}
	}

	private synchronized void recieveMsg() {

		System.out.println(getName() + " recieved message " + port.receive());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
