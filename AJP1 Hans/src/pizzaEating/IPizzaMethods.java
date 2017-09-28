package pizzaEating;

public interface IPizzaMethods {
	public void orderAPizza(); 		// A pizza is ordered by Scrum master.
									// While still slices left, Scrum master is waiting.

	
	public void getAPizzaSlice(); 		// The number of slices is decremented by one.
										// While no more slices, the team member is waiting.

	
	public void receiveAPizzaOrder();		 // The pizza guy receives a pizza order.
											// While no order, the pizza guy is waiting.

	public void deliverAPizza(); 	// A pizza with S slices is delivered.
}
