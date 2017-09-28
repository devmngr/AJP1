package handin7.Museum;


//simulates a display which is updated every time
// the number of visitors changes
public class DisplayThread extends Thread{

	private MuseumCounter mc;
	
	public DisplayThread(String name,MuseumCounter mc) {

		super(name);
		this.mc=mc;
	}
	
	public void run(){
		while(true){
			System.out.println("Number of visitors: " + mc.getNumber());
		}
	}
	
	
}
