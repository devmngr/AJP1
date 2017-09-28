package barberShop;

public class BarberShop extends QueueAsCircularArray {

	private int n;
	private QueueAsCircularArray queue;

	public BarberShop(int chairs) {
		super(chairs);
		n = chairs;
	}

	// A customer arrives, waiting on a chair until it is the customer’s turn
	// to be cut.
	// If all chairs are occupied, the customer goes again (leaves the shop).
	public synchronized void wantsToBeCut(Customer c) {
		if (super.isFull()) {
			System.out.println("Barber Shop is full, customer[" + c.getNumber() + "] is leaving");
			
			return;
		}
		System.out.println("Customer["+ c.getNumber() + "] takes a seat");
		
		super.put(c);
		notifyAll();
	}

	// The barber gets the next customer to cut him.
	// If no customers, the barber is waiting until a customer arrives.
	public synchronized Customer cuttingTheNext() {
		while (super.isEmpty()) {
			try {
				System.out.println("Barber is sleeping");
				wait();
			} catch (InterruptedException e) {			}
		}
		Customer cs = (Customer) super.take();
		System.out.println("Customer[" +  cs.getNumber() + "] is served");
		//notifyAll();
		return cs;
	}

}
