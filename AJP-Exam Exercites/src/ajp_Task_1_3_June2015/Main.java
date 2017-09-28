package ajp_Task_1_3_June2015;

public class Main {

	public static void main(String[] args) {
		Port port = new Port();

		Sender sender = new Sender("A", port, "HI");
		Sender s = new Sender("B", port, "Bye");

		Reciever reciever = new Reciever("Z", port);

	sender.start();
	s.start();
	reciever.start();
	}

}
