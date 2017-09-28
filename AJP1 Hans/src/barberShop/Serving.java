package barberShop;

public class Serving extends Thread {

	private BarberShop barberShop;

	public Serving(String name, BarberShop barberShop) {
		super(name);
		this.barberShop = barberShop;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			barberShop.cuttingTheNext();
		}
	}

}
