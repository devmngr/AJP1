package parking;


public class displayParking extends Thread{
private ParkingPlace parking;
	
	public displayParking(String name,ParkingPlace parking) {
		// TODO Auto-generated constructor stub
		super(name);
		this.parking=parking;
	}
	
	public  void run(){
		while(true){
			System.out.println("Free places: "+parking.freePlaces());
		}
	}
}
