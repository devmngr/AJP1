package task3;

public class Receiver extends Thread {

	private Channel channel;

	public Receiver(String name, Channel channel) {
		super(name);
		this.channel = channel;

	}

	public void run() {
		while (true) {
			receive();
		}
	}

	private void receive() {

		String message = channel.receive();
		System.out.println(getName() + ": " + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}