package barberShop;

public class Arrivals extends Thread {

	private BarberShop barberShop;
	private int number = 1;

	public Arrivals(String name, BarberShop barberShop) {
		super(name);
		this.barberShop = barberShop;

	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Customer c = customerIsComing(number);
			barberShop.wantsToBeCut(c);
			number++;

		}

		/*
		 * for (int i = 1; i <= cnr; i++) { Customer c = customerIsComing(i);
		 * barberShop.wantsToBeCut(c); }
		 */

	}

	private synchronized Customer customerIsComing(int number) {
		return new Customer(number);
	}

}
