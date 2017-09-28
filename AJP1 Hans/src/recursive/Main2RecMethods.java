//*****************************************************************************
//File name  : Main2RecMethods.java.
//Start date :
//Programmer : Hans So.
//Java       : Java 1.7
//Description: see http://en.wikipedia.org/wiki/Recursion_(computer_science)
//*****************************************************************************
package recursive;

public class Main2RecMethods
{
  public static void main (String[] args)
  {
    System.out.println ("*** Start of recursion, call and test the recursive methods here ***");

    
    int i = 3;
    int power = 3;
    System.out.println("Sum of " + i + ": " + Recursive.sum(i));
    System.out.println(i + " at power of " + power + ": " + Recursive.power(i, power));
    System.out.println("FIB: " + i + Recursive.fib(i));
    
    System.out.println ("*** End of recursion ***");
  }
}
