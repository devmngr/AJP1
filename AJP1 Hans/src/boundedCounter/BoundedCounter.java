// *****************************************************************************
// File name  : BoundedCounter.java.
// Start date : 
// Programmer : Hans So.
// Java       : 
// Description: Bounded Counter implemented by subclassing and with synchronization.
//   The InterruptedException is caught in the methods with wait.
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************

package boundedCounter;

public class BoundedCounter extends Counter
{
  private final long MIN = 0;
  private final long MAX;

  BoundedCounter (long max)
  {
    super ();
    MAX = max;
  }
  
  public synchronized void inc ()
  {
    while (super.value()>= MAX)
    {      
      try { wait (); }
      catch (InterruptedException e) {};
    }
    super.inc ();   
    notifyAll ();    
  }
  
  public synchronized void dec ()
  {
    while (super.value()<= MIN)
    {
      try { wait (); }
      catch (InterruptedException e) {};
    }
    super.dec ();
    
    notifyAll ();   
  }
  
  public synchronized long value ()
  {
    return super.value();
  }
  
  private boolean isFull()
  {
    return super.value() >= MAX;
  }
  
  private boolean isEmpty()
  {
    return super.value() <= MIN;
  }
}
