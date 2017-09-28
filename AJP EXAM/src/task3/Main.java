package task3;

public class Main {

	public static void main(String[] args) {

		Channel channel = new Channel();

		Receiver receiver = new Receiver("Receiver", channel);

		Sender sender = new Sender("Sender", channel);

		sender.start();
		receiver.start();

	}

}
