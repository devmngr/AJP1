// ***************************************************
// File name  : PizzaMethods.java
// Start date : 2015
// Programmer : Hans So.
// Java       : Java 1.7 
// Description: 
// ***************************************************

package pizzaEating;

public class PizzaMethodsBetter implements IPizzaMethods
{
  private final int SLICES_PER_PIZZA;
  private int slicesLeft = 0;
  private boolean pizzaOrdered = false;

  public PizzaMethodsBetter (int slicesPerPizza)   {
    this.SLICES_PER_PIZZA = slicesPerPizza;
  }

  public synchronized void orderAPizza ()   {
    while (slicesLeft > 0 || pizzaOrdered) 
    {
      try  { wait(); } catch (InterruptedException ex)  { }
    }

    pizzaOrdered = true;
    notifyAll();
  }

  public synchronized void getAPizzaSlice ()   {
    while (slicesLeft == 0)
    {
      try  { wait(); }  catch (InterruptedException ex)  { }
    }

    slicesLeft--;
    notifyAll();
  }

  public synchronized void receiveAPizzaOrder ()   {
    while (!pizzaOrdered)
    {
      try { wait(); } catch (InterruptedException ex)  { }
    }
  }

  public synchronized void deliverAPizza ()   {
    slicesLeft += SLICES_PER_PIZZA;
    pizzaOrdered = false;

    notifyAll();
  }
}
