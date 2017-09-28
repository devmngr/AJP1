package laneAndCars;

public class MainLaneAndCars {

	public static void main(String[] args) {
		
		//SingleLaneSafe lane = new SingleLaneSafe();
		SingleLaneSafeAndFair lane = new SingleLaneSafeAndFair();
		
		RedCar red1 = new RedCar("Red1", lane);
		RedCar red2 = new RedCar("Red2", lane);
		RedCar red3 = new RedCar("Red3", lane);

		
		BlueCar blue1 = new BlueCar("Blue1", lane);
		BlueCar blue2 = new BlueCar("Blue2", lane);
		BlueCar blue3 = new BlueCar("Blue3", lane);

		
		red1.start();
		red2.start();
		//red3.start();

		
		blue1.start();
		blue2.start();
		//blue3.start();


	}

}
