package asynchronousMessage;

public class Sender extends Thread {

	private Port port;
	private String message;

	public Sender(String name, String message, Port port) {
		super(name);
		this.port = port;
		this.message = message;

	}

	public void run() {
		while (true)
		{
			sendMsg();
		}
		

	}

	private synchronized void sendMsg() {
		port.send(message);
		System.out.println("Send message: " + message);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
