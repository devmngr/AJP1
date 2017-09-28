package pizzaEating;

public class PizzaMethods implements IPizzaMethods {

	private final int Slices_IN_Pizza;
	private int slices;
	private boolean order;

	public PizzaMethods(int max) {

		Slices_IN_Pizza = max;
		slices = 0;
		order = false;

	}

	@Override
	public synchronized void orderAPizza() {

		while (slices > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}		order = true;
		notifyAll();
	}

	@Override
	public synchronized void getAPizzaSlice() {

		while (slices == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		slices--;
		notifyAll();
	}

	@Override
	public synchronized void receiveAPizzaOrder() {

		while (!order) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
	}

	@Override
	public synchronized void deliverAPizza() {

		while(!order)
		{
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		order = false;
		slices += Slices_IN_Pizza;
		notifyAll();
	}

}
