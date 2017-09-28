// ***************************************************
// File name  : Task2.java
// Start date : 2015
// Programmer : Hans So.
// Java       : Java 1.7 
// Description: 
// ***************************************************

package exam1;
// Task2: about 25%
public class Task2
{
  // Question 2.1 (about 10%)
  public static int[] linearSearch( int[][] matrix, int key )
  {
    for( int row = 0; row < matrix.length; row++ )
      for( int col = 0; col < matrix[row].length; col++ )
        if( key == matrix[row][col] )
          return new int[]{ row, col };  // found
    
    return null;  // not found
  }
  
  // Question 2.2 (about 15%)  
  public static int[] binarySearchTreePattern( int[][] matrix, int key )
  {
    int row = matrix.length - 1;
    int col = 0;
    
    while( row >= 0 && col < matrix[row].length )
      if ( matrix[row][col] == key)
        return new int[]{ row, col }; // found
      else if( key < matrix[row][col] )
        row--;
      else
        col++;
    
    return null;  // not found
  }
  
  public static void main( String[] args )
  {
    int[][] m = {
      {  2,  8, 17, 31, 45, 53, 76 },
      {  5, 12, 21, 33, 47, 68, 79 },
      {  9, 13, 23, 38, 52, 69, 82 },
      { 11, 16, 24, 42, 54, 71, 85 },
      { 14, 18, 25, 43, 55, 72, 86 },
      { 19, 22, 28, 46, 58, 75, 89 },
      { 27, 30, 32, 48, 61, 83, 99 },
    };
    
    int[] res = linearSearch( m, 71 );
    System.out.println( res[0] + " " + res[1] );
    
    res = linearSearch( m, 70 );
    System.out.println( res );
    
    res = binarySearchTreePattern( m, 71 );
    System.out.println( res[0] + " " + res[1] );
    
    res = binarySearchTreePattern( m, 70 );
    System.out.println( res );
  }
}



