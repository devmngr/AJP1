package ajp_Task_1_3_June2012;

import java.io.ObjectOutputStream.PutField;

public class Application extends Thread {

	private IMonitorQueue monitor;
	private String text;

	public Application(String name, MonitorQueue monitor, String text) {
		super(name);
		this.monitor = monitor;
		this.text = text;
	}

	public void run() {

		monitor.putAll(text);
	}

}
