// *****************************************************************************
// File name  : Main2Exercise5.java.
// Start date : 
// Programmer : Hans So.
// Java       : Java 
// Description: Main to Exercise 5 using a menu
//
// *****************************************************************************

package handin.handin1;

import util.Cin;

public class Main2Exercise5
{
  public static void main(String[] args)
  {    
    int choice;
    
    int n;
    long result;
     
    do
    {
      menu();
      choice = Cin.readInt();
      switch (choice)
      {
        case 1 : // Exercise 5 solving 1
          System.out.print("Type N ( 0 < N < 10):");
          n = Cin.readInt ();
          System.out.println();
          
          Exercise5.solving1 (n);          
          System.out.println();
          break;  
        case 2 : // Exercise 5 solving 2
            System.out.print("Type N (10, 100, 1000, ...):");
            n = Cin.readInt ();
            System.out.println();
            
            result = Exercise5.solving2 (n);          
            System.out.println("Number of triples: " + result + "\n");
            break; 
        default :
          break;
          
        case 3 : //Exercise 5 solving 3
        	System.out.println("Type N(100, 1000, 10000, 100000...):");
        	n = Cin.readInt();
        	System.out.println();
        	
        	result = Exercise5.solving3(n);
        	System.out.println("Number of itinerations: " + result + "\n");
        	break;
        	
      }
    }
    while (choice > 0);
    System.out.println("** End of test Hand-in 1 **");
  } 
  
  private static void menu()
  {
    System.out.println(" TEST-MENU for Hand-in 1");
    System.out.println(" 1) Solving 1:  ");
    System.out.println(" 2) Solving 2");
    System.out.println(" 3) Solving 3");
    System.out.println(" 0) Quit");
    System.out.print(" Type your choice: ");
  }
}

