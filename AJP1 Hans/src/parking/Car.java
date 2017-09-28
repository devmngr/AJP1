package parking;

public class Car extends Thread {

	private ParkingPlace parkingPlace;

	public Car(String name, ParkingPlace parking) {
		super(name);
		this.parkingPlace = parking;
	}

	public void run() {
		drive();
		parkingPlace.arrive();
		parkCar();
		parkingPlace.leave();
		driveAway();
	}

	private synchronized void drive() {
		System.out.println(getName() + "driving to parking place");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	private synchronized void parkCar() {
		System.out.println(getName() + "parked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}
	private synchronized void driveAway() {
		System.out.println(getName() + "Left parking");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	
	}
}
