package pizzaEating;

public class PizzaGuy extends Thread {
	// receive a pizza order
	// make a pizza
	// deliver pizza

	PizzaMethods pizza;

	public PizzaGuy(String name, PizzaMethods pizza) {
		super(name);
		this.pizza = pizza;

	}

	public void run() {
		while (true) {
			//pizza.receiveAPizzaOrder();
			recieveOrder();
			makePizza();
			//pizza.deliverAPizza();
			deliverPizza();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			
			///without try catch. move it somewhere else
		}
	}

	private void makePizza() {
		System.out.println(getName() + " makes Pizza");
	}
	private void recieveOrder()
	{
		pizza.receiveAPizzaOrder();
		System.out.println(getName()+ " recieves order");
	}
	private void deliverPizza()
	{
		pizza.deliverAPizza();
		System.out.println(getName() + " delivered pizza");
	}
}
