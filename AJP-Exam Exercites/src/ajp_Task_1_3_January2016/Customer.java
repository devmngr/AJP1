package ajp_Task_1_3_January2016;

public class Customer extends Thread {
	private ISuperMarket supermarket;

	public Customer(String name, Supermarket supermarket) {
		super(name);
		this.supermarket = supermarket;
	}

	public void run() {

		try {
			arrival();
			enterWaitingLine();
			leave();
		} catch (InterruptedException e) {

		}

	}

	private synchronized void arrival() throws InterruptedException {
		System.out.println(getName() + " arrives.");
		Thread.sleep(3000);
	}

	private synchronized void enterWaitingLine() throws InterruptedException {
		supermarket.enterWaitingLine();
		System.out.println(getName() + " waiting.");
		Thread.sleep(3000);
	}

	private synchronized void leave() throws InterruptedException {

		System.out.println(getName() + " leaves.");
		Thread.sleep(3000);
	}

}
