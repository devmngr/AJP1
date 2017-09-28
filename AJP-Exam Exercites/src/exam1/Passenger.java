// ****************************************************
// File name  : Passenger.java
// Start date : June, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0
// ****************************************************

package exam1;
public class Passenger
{
  private String nationality;
  private int passportNumber;
  
  public Passenger( String nationality, int passportNumber )
  {
    this.nationality = nationality;
    this.passportNumber = passportNumber;
  }  
  
  public String getNationality()
  {
    return nationality;
  }  
  
  public int getPassportNumber()
  {
    return passportNumber;
  }  
  
  public String toString()
  {
    return nationality + " " + passportNumber;
  }
}
