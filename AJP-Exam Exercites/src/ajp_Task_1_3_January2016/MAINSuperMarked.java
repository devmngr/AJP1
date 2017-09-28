package ajp_Task_1_3_January2016;

public class MAINSuperMarked {

	public static void main(String[] args) {

		
		Supermarket s = new Supermarket();
		Cashier cashier = new Cashier("Cashier", s);
		
		Customer c = new Customer("Jony", s);
		Customer c1 = new Customer("Paul", s);
		Customer c2 = new Customer("Tomas", s);
		Customer c3 = new Customer("Marian", s);
		Customer c4 = new Customer("Alex", s);
		Customer c5 = new Customer("Bogdan", s);
		
		
		cashier.start();
		c.start();
		//c1.start();
		//c2.start();
		//c3.start();
		//c4.start();
		//c5.start();
		
	}

}
