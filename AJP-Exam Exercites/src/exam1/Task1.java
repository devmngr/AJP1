// *****************************************************************************
// File name  : Task1.java
// Start date : 16/06/2011
// Programmer : Hans So.
// Java       : Java 1.6.0 
// Description: 
// *****************************************************************************
package exam1;
public class Task1
{
  // Question 1.1
  public static double calcPower( double x, int n )
  // pre: n >= 0
  {
    if( n == 0 )
      return 1.0;
    else
      return x * calcPower( x, n - 1 );
  }
  
  // Question 1.2
  public static int factorial( int n )
  // pre: n >= 0 
  {
    int product = 1;
    
    for (int i = 1; i <= n; i++)   
      product *= i;
    
    return product;
  }
  
  //Question 1.3
  public static double exp( double x, int k )
  // pre: k >= 0
  {
    double sum = 0.0;
    
    for( int n = 0; n <= k; n++ )
      sum += calcPower( x, n ) / factorial( n );
      
    return sum;
  }

  // Testing  ==============================================================

  public static void main( String[] args )
  {
    for( int n = 0; n <= 10; ++n )
      System.out.println( "2.0^" + n + "=" + calcPower( 2.0, n ) );
      
    for( int n = 0; n <= 10; ++n )
      System.out.println( "" + n + "!=" + factorial( n ) );
      
    for( int k = 0; k <= 10; ++k )
      System.out.println( "exp(3.0," + k + ")=" + exp( 3.0, k ) );
  }
}