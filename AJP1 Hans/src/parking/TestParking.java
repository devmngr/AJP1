package parking;

public class TestParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingPlace parking=new ParkingPlace(3);
		Thread car1=new Car("VW", parking);
		Thread car2=new Car("BMW", parking);
		Thread car3=new Car("OPEL", parking);
		Thread car4=new Car("VECTRA", parking);
		Thread car5=new Car("TOYOTA", parking);
		Thread display=new displayParking("display", parking);
		display.start();
		System.out.println(car1.getName()+" started");
		car1.start();
		System.out.println(car2.getName()+" started");
		car2.start();
		System.out.println(car3.getName()+" started");
		car3.start();
		System.out.println(car4.getName()+" started");
		car4.start();
		System.out.println(car5.getName()+" started");
		car5.start();
	
	}

}
