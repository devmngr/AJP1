//*****************************************************************************
//File name  : IntTable.java.
//Start date : 
//Programmer : Hans So.
//Java       : Java 1.7
//Description: 
//*****************************************************************************
package IntTable;

public class IntTable
{
  int[] table;  // instantiated in a constructor etc.
  int index;    // index is the first free place in the table;
                // it also counts the number of integers in table
  
  public IntTable (int length)
  {
    this.table = new int[length];
    this.index = 0;
  }
  
  /**
   * The element is inserted on the first free place in the table
   * Precondition:  The table is not full
   * Postcondition: The element has been inserted and now the table is not empty
   * @param element The element to insert 
   */
  public void insert (int element)
  {
    table[index++] = element;    
  }
  
  /**
   * Other methods:
   * removeLast
   * remove (int value) // removes one element with this value
   * removeAll (int value) // removes all elements with this value 
   * findIndex (int value)
   * isEmpty
   * isFull
   * size
   * length
   * 
   * getMax
   * getMin
   * howMany (int value) // finds how many of this value
   * sort  // sorts the table in ascending order
   * 
   * mean  (also called the average) returns the sum of the data divided with the number of data.
   * 
   * median returns the middle value of the given numbers in their ascending order.
   *        If the size of the data set is even, the median is the average value of the two middle elements.
   *        
   * standardDeviation
   *  use the formula at http://www.ajdesigner.com/phpstatistics/standard_deviation_sample.php.
   *  Also at: http://www.ltcconline.net/greenl/courses/201/descstat/mean.htm
   *
   */
  
  int getValue (int index)
  {
    return table[index];
  }
  
  /**
   * size tells how many elements are in the table; 
   * - not the length of the array.
   * @return the number of elements in the table
   */
  public int size ()
  {
    return index;
  }
  
  public int length()
  {
    return table.length;
  }
  
  public void print()
  {
	  System.out.println("ToDo: implement print method");
  }
}
