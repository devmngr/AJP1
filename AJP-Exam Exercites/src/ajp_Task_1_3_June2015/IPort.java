package ajp_Task_1_3_June2015;

public interface IPort {

	public boolean send(String message);

	// send a message to the port.
	// If the message queue is full, send returns false (the calling thread is
	// not
	// blocked), else the message is queued at the port.
	public String receive();
	// receive a message from the port.
	// The calling thread is blocked if there are no messages queued to the
	// port.

}
