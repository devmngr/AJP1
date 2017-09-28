// *****************************************************************************
// File name  : Main2IntTable.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 
// Description: 
// *****************************************************************************

package IntTable;

import util.Cin;

public class Main2IntTable
{
  public static void main (String[] args)
  {
    int choice;
    
    IntTable intTable = null;
    int n;
    int value;
    
    do
    {
      menu();
      choice = Cin.readInt();
      switch (choice)
      {
        case 1 :  // create table
          System.out.print("Create table; type length: ");
          n = Cin.readInt();
          intTable = new IntTable (n);
          System.out.println("Table of length " + intTable.length() + " is created");
          break;
        case 2 :  // insert value
          System.out.print("Insert: type value: ");
          value = Cin.readInt();
          intTable.insert (value);
          System.out.println("Table has " + intTable.size() + " values");
          break;
        case 3 :  // remove value
          System.out.print("Remove: type value: ");
          value = Cin.readInt();
   //       intTable.remove (value);
          System.out.println("Table has " + intTable.size() + " values");
          break;
        case 4 :  // print table
          
          System.out.println("Not implemented");
          break;
        default :
          break;
      }
    }
    while (choice > 0);
    System.out.println("** End **");
  }
 
  private static void menu()
  {
    System.out.println(" MENU");
    System.out.println(" 1) create table");
    System.out.println(" 2) insert element");
    System.out.println(" 3) remove element");
    System.out.println(" 4) print table");
    System.out.println(" 0) Quit");
    System.out.print(" Type your choice: ");
  }
}
