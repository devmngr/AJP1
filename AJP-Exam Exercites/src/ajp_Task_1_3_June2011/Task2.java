package ajp_Task_1_3_June2011;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Task2 {

	public static int getNumberOfNonZeros(int[][] matrix) {

		int rows = matrix.length;
		int columns = matrix[0].length;
		int count = 0;

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				if (matrix[i][j] != 0)
					count++;
		return count;
	}

	public static int[] getArrayRepr(int[][] matrix) {

		int[] temp = new int[getNumberOfNonZeros(matrix)];
		int idx = 0;

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j] != 0) {
					temp[idx] = matrix[i][j];
					idx++;
				}
		return temp;

	}

	public static int[][] getMatrixFromArr(int[] array, int n) {

		int[][] matrix = new int[n][n];
		int row = 0;
		int col = 0;
		for (int i = 0; i < array.length; i += 3) {
			row = array[i + 1];
			col = array[i + 2];
			matrix[row][col] = array[i];
		}
		return matrix;
	}

//	public static String asString(int[][] A) {
//		int m = A.length;
//		int n = A[0].length;
//
//		StringBuffer buf = new StringBuffer();
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				buf.append(A[i][j]);
//				buf.append('\t');
//			}
//			buf.append('\n');
//		}
//
//		return buf.toString();
//	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 3 }, { 0, 0, 1 }, { 0, 3, 3 } };
		// System.out.println(getNumberOfNonZeros(matrix));
		int[] arr = getArrayRepr(matrix);
		for (int i = 0; i < arr.length; i++)
			// System.out.print(arr[i] + " ");

			System.out.println();
		int A[] = { 1, 0, 2, 2, 0, 3, 3, 1, 0, 4, 1, 3, 5, 3, 2 };
		//System.out.println(asString(getMatrixFromArr(A, 4)));

	}
}
