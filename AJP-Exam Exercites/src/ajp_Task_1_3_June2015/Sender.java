package ajp_Task_1_3_June2015;

public class Sender extends Thread {

	private Port port;
	private String message;

	public Sender(String name, Port port, String message) {
		super(name);
		this.port = port;
		this.message=message;
	}
	public void run()
	{
		while (true)
		send("Hello");
		
	}
	
	public void send(String message){
		message=this.message;
		port.send(message);
		System.out.println(getName() + " sent message: " + message);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
