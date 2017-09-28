// ****************************************************
// File name  : PassengerQueue.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0 
// ****************************************************

package exam1;
import java.util.ArrayList;

public class PassengerQueue implements IPassengerQueue
{
  private ArrayList<Passenger> queue 
    = new ArrayList<Passenger>();
  
  public synchronized void putPassengerInQueue( Passenger p )
  {
    queue.add( p );
    if (queue.size() == 1)
      notify();
  }  
  
  public synchronized Passenger getNextPassenger()
  {
    while( queue.size() == 0 )
    {
      try { wait(); } 
      catch( Exception ex ) { }
    }
    
    return queue.remove( 0 );
  }
}
