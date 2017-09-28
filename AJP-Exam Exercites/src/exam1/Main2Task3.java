// ****************************************************
// File name  : Main2Task3.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0 
// ****************************************************

package exam1;
public class Main2Task3
{
  public static void main( String[] args )
  {
    IPassengerQueue citizensQueue    = new PassengerQueue();
    IPassengerQueue nonCitizensQueue = new PassengerQueue();
    
    Guide guide = new Guide( citizensQueue, nonCitizensQueue );
    
    PassportController citizensController 
      = new PassportController( citizensQueue );
    PassportController nonCitizensController 
      = new PassportController( nonCitizensQueue );
    
    guide.start();
    citizensController.start();
    nonCitizensController.start();
  }
}
