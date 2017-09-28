package ajp_Task_1_3_June2015;

public class Reciever extends Thread {

	private Port port;

	public Reciever(String name, Port port) {
		super(name);
		this.port = port;

	}

	public void run() {
		while (true)
		recieve();

	}

	public void recieve() {

		String msg = port.receive();
		System.out.println(getName() + " recieved Message: " + msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
