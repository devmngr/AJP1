package task3;

import java.io.StringWriter;
import java.util.Random;

public class Sender extends Thread {

	private Channel channel;

	public Sender(String name, Channel channel) {
		super(name);
		this.channel = channel;

	}

	public void run() {
		while (true) {
			send();
		}
	}

	private void send() {
		int nr = new Random().nextInt();
		String message = nr + "";
		channel.send(message);
	}
}
