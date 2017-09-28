package ajp_Task_1_3_June2015;

public class Task2 {

	public static int[] linearSearch(int[][] matrix, int key) {

		int rows = matrix.length;
		int columns = matrix[0].length;

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {

				if (matrix[i][j] == key) {
					int[] temp = { i, j };
					return temp;
				}

			}

		return null;
	}

	public static int[] binarySearch(int[][] matrix, int key, int left,
			int right) {
		int mid;
		for (int i = 0; i < matrix.length; i++) {

			if (matrix[i] != null && 0 <= left && left <= right
					&& right < matrix[i].length) {

				mid = (left + right) / 2;
				if (matrix[i][mid] == key) {
					int[] temp = { i, mid };
					return temp;
				} else if (key < matrix[i][mid])
					return binarySearch(matrix, key, left, mid - 1);

				else
					return binarySearch(matrix, key, mid + 1, right);

			}
		}
		return null;
	}
	
	public static int[] binarySearchTreePattern(int[][] matrix, int key){
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		while(0<=rows && rows<matrix.length
				&& 0<=columns && columns<matrix[0].length){
			if(matrix[rows][columns] == key)
			{
				return new int[] {rows, columns};
			}
			else if (key<matrix[rows][columns])
			rows--;
			else 
				columns--;
			}	
		return null;	
	}

	
	
	
	
	
}
