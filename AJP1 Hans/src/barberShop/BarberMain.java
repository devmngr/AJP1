package barberShop;

public class BarberMain {

	public static void main(String[] args) {
		
		
		BarberShop barber = new BarberShop(5);
		
		Arrivals arr = new Arrivals("Arival1", barber);
		Serving serv = new Serving("Serving", barber);
		
		serv.start();
		arr.start();
		
	}

}
