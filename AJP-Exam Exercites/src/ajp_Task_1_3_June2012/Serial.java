package ajp_Task_1_3_June2012;

public class Serial extends Thread {
	private IMonitorQueue monitor;

	public Serial(String name, MonitorQueue monitor) {
		super(name);
		this.monitor = monitor;
	}

	public void run() {
		read();
	}

	private void read() {
		while (true) {

			System.out.print(monitor.take());
		}

	}

}
