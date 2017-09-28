// ****************************************************
// File name  : Guide.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0 
// ****************************************************

package exam1;

import java.util.Random;

public class Guide extends Thread
{
  private IPassengerQueue citizens;
  private IPassengerQueue nonCitizens;
  
  private Random random = new Random();
    
  public Guide( IPassengerQueue citizens, 
                IPassengerQueue nonCitizens )
  {
    this.citizens = citizens;
    this.nonCitizens = nonCitizens;
  }  
  
  public void run()
  {
    while( true ) {
      Passenger p = appear();
      //System.out.println( "New passenger: " + p );
      
      if( p.getNationality().equals( "USA" ) )
        citizens.putPassengerInQueue( p );
      else
        nonCitizens.putPassengerInQueue( p );
    }
  }  
  
  private Passenger appear()
  {
    delay();
    if( random.nextBoolean() )
      return new Passenger( "USA", random.nextInt( 100000000 ) );
    else
      return new Passenger( "NON-CITIZEN", random.nextInt( 100000000 ) );
  }
  
  private void delay()
  {
    try {Thread.sleep( 2000L + random.nextInt( 5000 ) ); } 
    catch( Exception ex ) { }
  }
}
