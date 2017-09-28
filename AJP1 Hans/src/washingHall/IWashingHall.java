package washingHall;

public interface IWashingHall {
	
	public void enterForWashing(); // The customer enters for washing the car;
									// the customer is waiting if all washing places
									// are occupied.
	public void leaveWashing(); 	// The car washing has finished and the customer
									// leaves the washing place so that the next waiting
									// car can enter.
	public int getFreePlaces(); 	// Returns how many washing places are available.

}
