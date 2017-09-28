package ajp_Task_1_3_January2016;

public class Supermarket implements ISuperMarket {

	private int customers;
	private int serving;

	public Supermarket() {
		customers = 0;
		serving = 0;
	}

	@Override
	public synchronized void enterWaitingLine() {
		while(serving >0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}	
		customers++;
		notifyAll();
	}

	@Override
	public synchronized void startNextServing() {

		while (customers == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		serving++;
		notifyAll();
		

	}

	@Override
	public synchronized void serviceFinished() {
		customers--;
		serving --;
		notifyAll();
	}

}
