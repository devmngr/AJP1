package washingHall;

public class WashingHallMain {

	public static void main(String[] args) {
		//sdasdsadasd
		
		IWashingHall hall = new WashingHall(0);		
		DisplayThread display = new DisplayThread("display", hall);
		
		CustomerCarThread car1 = new CustomerCarThread("VW", hall);
		CustomerCarThread car2 = new CustomerCarThread("BMW", hall);
		CustomerCarThread car3 = new CustomerCarThread("Dacia", hall);
		
		
		
		car1.start();
		car2.start();
		//car3.start();
		display.start();
		
	}

}
