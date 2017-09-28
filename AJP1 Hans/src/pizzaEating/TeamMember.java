package pizzaEating;

public class TeamMember extends Thread {
	// get a pizza slice
	// program

	PizzaMethods pizza;

	public TeamMember(String name, PizzaMethods pizza) {
		super(name);
		this.pizza = pizza;
	}

	public void run() {
		while (true) {
			//pizza.getAPizzaSlice();
			getSlice();
			program();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			///without try catch. move it somewhere else
		}
	}

	private void program() {
		System.out.println(getName() + " programs");
	}
	private void getSlice()
	{
		pizza.getAPizzaSlice();
		System.out.println(getName() + " get's pizza slice");
	}

}
