package task3;

public interface IChannel {

	public void send(String message);

	// Put a message to the channel.
	// The sender thread is blocked until the message is received (and removed)
	// from the channel.

	public String receive();
	// Remove a message from the channel.
	// The receiver thread is blocked while no message is on the channel.

}
