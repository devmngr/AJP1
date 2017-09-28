package asynchronousMessage;

public class PortMAIN {

	public static void main(String[] args) {

		Port port = new Port();
		Reciever rec = new Reciever("1.Reciecer", port);
		Sender send = new Sender("S1-P1", "HelloWorld", port);
		Sender send2 = new Sender("S2-P1", "Hi", port);
		Sender send3 = new Sender("S3-P1", "Good", port);
			
		Port port2 = new Port();
		Reciever rec2 = new Reciever("Rec2", port2);
		Sender s1 = new Sender("S1-P2", "Message S1", port2);
		Sender s2 = new Sender("S2-P2", "Message S2", port2);
		Sender s3 = new Sender("S3-P2", "Message S3", port2);		

		rec.start();
		rec2.start();
		
		send.start();
		send2.start();
		send3.start();
		
		s1.start();
		s2.start();
		s3.start();
	}

}
