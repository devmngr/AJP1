// ***************************************************
// File name  : MatrixIntOp.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7 
// Description: 
// ***************************************************

package Matrix;

import java.lang.reflect.Array;

import util.Cin;

public class MatrixIntOp {
	private MatrixIntOp() {
	}

	// Addition: A + B
	// Precondition: A and B have the same dimensions (m-by-n)
	public static int[][] add(int[][] A, int[][] B) {
		int m = A.length;
		int n = A[0].length;
		int[][] C = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				C[i][j] = A[i][j] + B[i][j];

		return C;
	}

	// Subtraction: A - B
	public static int[][] subtract(int[][] A, int[][] B) {
		int m = A.length;
		int n = A[0].length;
		int[][] C = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				C[i][j] = A[i][j] - B[i][j];
		return C;
	}

	// Scalar multiplication: cA
	public static int[][] multiply(int c, int[][] A) {
		int m = A.length;
		int n = A[0].length;
		int[][] C = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				C[i][j] = c * A[i][j];

		return C;

	}

	// Matrix multiplication: AB
	// Precondition: A (m-by-n), B (n-by-p)
	// Postcondition: AB (m-by-p)
	public static int[][] multiply(int[][] A, int[][] B) {
		int m = A.length;
		int n = A[0].length;
		int o = B.length;
		int p = B[0].length;
		int[][] C = new int[m][p];
		if (n == o) {
			
			for (int i = 0; i < m; i++)
				for (int j = 0; j < p; j++)
					for (int k = 0; k < n; k++)

						C[i][j] += A[i][k] * B[k][j];

			// OR C[i][j]= dotProduct(getRow(i, A), getCol(j, B));
		}

		return C;

	}

	// Get row number i of matrix A
	public static int[] getRow(int i, int[][] A) {
		return A[i - 1];
	}

	// Get column number j of matrix A
	public static int[] getCol(int j, int[][] A) {
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++)
			B[i] = A[i][j - 1];

		return B;
	}

	// Scalar product or dot product of to vectors a and b
	// Precondition: a and b has the same length
	public static int dotProduct(int[] a, int[] b) {
		int C = 0;

		for (int i = 0; i < a.length; i++)
			C += a[i] * b[i];

		return C;

	}

	/**
	 * asString can be called in this way: System.out.println
	 * (MatrixIntOp.asString(A));
	 */
	public static String asString(int[][] A) {
		int m = A.length;
		int n = A[0].length;

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				buf.append(A[i][j]);
				buf.append('\t');
			}
			buf.append('\n');
		}

		return buf.toString();
	}

	public static String asString(int A[]) {
		String str = "{";
		int m = A.length;

		for (int i = 0; i < m; i++) {
			str += A[i];
			if (i < m - 1) {
				str += ", ";
			}
		}
		return str + "}";
	}
public static String asString(String A[]) {
		
		int n = A.length;
		
		String string = "";
		for (int i = 0; i < n; i++) {
			string += (A[i]);
		}
		return string;
	}
	

	public static void main(String[] args) {
		int[][] A = { 
						{ 1, 0, 2 }, 
						{ -1, 3, 1 }
					};

		int[][] B = { 
						{ 3, 1 }, 
						{ 2, 1 }, 
						{ 1, 0 } 
					};

		int[][] C = { 
						{ 1, 1, 7 }, 
						{ 3, 3, 9 } 
					};


		int[] a = { 1, 3, -5 };
		int[] b = { 4, -2, -1 };
		int x = MatrixIntOp.dotProduct(a, b);
		int c = 3;
		int row = 2;
		int col = 1;
		
		System.out.println("A\n" + MatrixIntOp.asString(A));
		System.out.println();
		System.out.println("B\n" + MatrixIntOp.asString(B));
		System.out.println();
		System.out.println("C\n" + MatrixIntOp.asString(C));
		System.out.println();
		System.out.println("A + C\n" + MatrixIntOp.asString(MatrixIntOp.add(A, C)));
		System.out.println();
		System.out.println("A - C\n" + MatrixIntOp.asString(MatrixIntOp.subtract(A, C)));
		System.out.println();
		System.out.println(c+" * B\n" + MatrixIntOp.asString(MatrixIntOp.multiply(c, A)));
		System.out.println();
		System.out.println("A * B\n" + MatrixIntOp.asString(MatrixIntOp.multiply(A, B)));
		System.out.println();
		System.out.println("Row " + row + " of A\n" + MatrixIntOp.asString(MatrixIntOp.getRow(row, A)));
		System.out.println();
		System.out.println("Column " + col + " of A\n" + MatrixIntOp.asString(MatrixIntOp.getCol(col, A)));
		System.out.println();
		System.out.println("a = " + MatrixIntOp.asString(a));
		System.out.println("b = " + MatrixIntOp.asString(b));
		System.out.println("Dot product of a and b is " + x);
	}


}
