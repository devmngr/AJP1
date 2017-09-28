package pizzaEating;

public class ScrumMaster extends Thread {
	// order a pizza
	// do other activities;

	private PizzaMethods pizza;

	public ScrumMaster(String name, PizzaMethods pizza) {
		super(name);
		this.pizza = pizza;
	}

	public void run() {
		while (true) {
			//pizza.orderAPizza();
			orderPizza();
			otherActivityes();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			///without try catch. move it somewhere else
		}
	}

	private void otherActivityes() {
		System.out.println(getName() + " does other activities");
	}
	private void orderPizza()
	{
		pizza.orderAPizza();
		System.out.println(getName()+" orders pizza");
	}
	
	
}
