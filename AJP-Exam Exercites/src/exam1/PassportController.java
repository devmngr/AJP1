// ***************************************************
// File name  : PassportController.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0 
// ****************************************************

package exam1;
import java.util.Random;

public class PassportController extends Thread
{
  private IPassengerQueue queue;
  
  private Random random = new Random();
  
  
  public PassportController( IPassengerQueue queue )
  {
    this.queue = queue;
  }
  
  
  public void run()
  {
    while( true ) {
      Passenger p = queue.getNextPassenger();
      check (p);
    }
  }
  
  private void check (Passenger p) {
    System.out.println( "Checking " + p );
    delay();
  }
  
  private void delay()
  {
    try {Thread.sleep( 3000L + random.nextInt( 5000 ) ); } 
    catch( Exception ex ) { }
  }
}
