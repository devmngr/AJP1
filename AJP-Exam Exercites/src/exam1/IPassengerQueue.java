// ***************************************************
// File name  : IPassengerQueue.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0
// ***************************************************

package exam1;

public interface IPassengerQueue
{
  void putPassengerInQueue( Passenger p );
  Passenger getNextPassenger();
}
