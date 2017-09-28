package ajp_Task_1_3_June2012;

public class MainMonitor {

	public static void main(String[] args) {

		MonitorQueue monitor = new MonitorQueue(100);
		
		Application a = new Application("APP1: ", monitor, "OK! ");
		Application b = new Application("App2", monitor, "Fail! ");
		
		Serial s = new Serial("Serial: ", monitor);
		
		
		a.start();
		b.start();
		s.start();
	
		
	}

}
