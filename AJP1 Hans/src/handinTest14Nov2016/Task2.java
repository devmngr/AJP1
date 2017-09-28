package handinTest14Nov2016;

public class Task2 {

	public static int[] linearSearch(int[][] matrix, int key) {
		int[] result = new int[2];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == key) {
					//result[0] = i;
					//result[1] = j;
					//return result;
					return  new int[] {i, j};
				}

			}

		
		return null;
	}

	public static int[] binarySearchTreePattern(int[][] matrix, int key) {
		int columns = matrix[0].length-1;
		int rows = matrix.length-1;
		int[] result = new int[2];
	/*	
	 * For loop way
		for (int i = rows; i >=0; i--)
			for (int j = 0; j <= columns; j++) {

				if (matrix[i][j] == key)
				{
					result[0] = i;
					result[1] = j;
				return result;
				}
			}
		*/

		///While loop way
		while(rows>=0 && rows<matrix.length && columns>=0 &&columns<matrix[0].length)
		{
			if(matrix[rows][columns] == key)
			{
				result[0] = rows;
				result[1] = columns;
			return result;
			}
			else if(key<matrix[rows][columns])
			{
				rows--;
			}
			else
				columns ++;
			
		}
		return null;

	}

	private static String asString(int[] arr) {
		String str = "(";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i < arr.length - 1)
				str += ", ";

		}
		str += ")";
		return str;
	}

	public static void main(String[] args) {

		int[][] A = { 
				{ 3, 1 }, 
				{ 2, 1 }, 
				{ 1, 0 } 
				};

		int[] arr = linearSearch(A, 2);
		int[] arr2 = binarySearchTreePattern(A, 0);

		System.out.println(asString(arr));
		System.out.println(asString(arr2));

	}

}
