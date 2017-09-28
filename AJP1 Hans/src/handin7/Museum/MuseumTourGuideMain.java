package handin7.Museum;

public class MuseumTourGuideMain {

	public static void main(String[] args) {

		MuseumCounter mc = new MuseumCounter();
		
		TourGuidedThread tour1 = new TourGuidedThread("Tour1", mc, 7);
		TourGuidedThread tour2 = new TourGuidedThread("Tour2", mc, 15);
		TourGuidedThread tour3 = new TourGuidedThread("Tour3", mc, 12);
		TourGuidedThread tour4 = new TourGuidedThread("Tour4", mc, 11);
		TourGuidedThread tour5 = new TourGuidedThread("Tour5", mc, 10);
		
		DisplayThread dispaly = new DisplayThread("Display", mc);
		dispaly.start();
		
		//System.out.println(tour0.getName());
		tour1.start();
		//System.out.println(tour1.getName() + " starts tour");
		tour2.start();
		//System.out.println(tour2.getName() + " starts tour");
		tour3.start();
		//System.out.println(tour3.getName() + " starts tour");
		tour4.start();
		//System.out.println(tour4.getName() + " starts tour");
		tour5.start();	
	}

}
