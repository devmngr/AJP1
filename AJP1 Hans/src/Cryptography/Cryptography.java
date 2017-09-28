// ***************************************************
// File name  : Cryptography.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: Application to Cryptography
//              http://aix1.uottawa.ca/~jkhoury/cryptography.htm
// ***************************************************

package Cryptography;

import javax.swing.text.StyleContext.SmallAttributeSet;

import util.Cin;
import Matrix.MatrixIntOp;

public final class Cryptography {
	private Cryptography() {
	}

	public static int[] stringToArray(String message) {		
		int[] toArrayMessage = new int[message.length()];
		for (int i = 0; i < toArrayMessage.length; i++) {
			toArrayMessage[i] = message.charAt(i);
		}
		return toArrayMessage;

	}

	// size means number of rows im matrix

	public static int[][] arrayToUncodedMatrix(int[] arr, int size) {

		int col = (arr.length + size - 1) / size;
		int[][] matrix = new int[size][col];
		int k = 0;

		for (int i = 0; i < col; i++)
			for (int j = 0; j < size; j++) {
				if (k < arr.length) {
					matrix[j][i] = arr[k];
					k++;
				} else {
					break;
				}
			}
		return matrix;
	}

	public static int[][] encodeMatrix(int[][] encodingMatrix,
			int[][] uncodedMatrix) {

		/*
		 * int m = encodingMatrix.length; int n = encodingMatrix[0].length; int
		 * o = uncodedMatrix.length; int p = uncodedMatrix[0].length; int[][] C
		 * = new int[m][p]; if (n == o) { for (int i = 0; i < m; i++) for (int j
		 * = 0; j < p; j++) for (int k = 0; k < n; k++)
		 * 
		 * C[i][j] += encodingMatrix[i][k] * uncodedMatrix[k][j]; }
		 */
		return MatrixIntOp.multiply(encodingMatrix, uncodedMatrix);
	}

	public static int[][] decodeMatrix(int[][] decodingMatrix,
			int[][] codedMatrix) {
		return MatrixIntOp.multiply(decodingMatrix, codedMatrix);
	}

	public static int[] matrixToArray(int[][] matrix) {
		int[] arr = new int[matrix.length * matrix[0].length];

		int k = 0;
		for (int j = 0; j < matrix[0].length; j++)
			for (int i = 0; i < matrix.length; i++) {
				arr[k] = matrix[i][j];
				k++;
			}
		return arr;

	}

	public static String arrayToString(int[] arr) {

		String[] letters = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				letters[i] = String.valueOf(Character.toChars(32));
			} else {
				letters[i] = String.valueOf(Character.toChars(arr[i]));
			}

		}
		return MatrixIntOp.asString(letters);

	}

	public static void main(String[] args) {
		int[][] A = { { -3, -3, -4 }, { 0, 1, 1 }, { 4, 3, 4 } };

		int[][] inverseA = { { 1, 0, 1 }, { 4, 4, 3 }, { -4, -3, -3 } };

		int[][] B = { { 3, 5 }, { 1, 2 } };

		int[][] inverseB = { { 2, -5 }, { -1, 3 } };

		// Show that A and inverseA really are inverse to each other.
		// The same for B and inverseB.

		// Use both A and B as examples of encoding matrices

		// Some messages:
		String message1 = "AABBCCC";
		String message2 = "Help me";
		String message3 = "PREPARE TO NEGOTIATE";

		int choice;

		do {
			menu(message1, message2, message3);
			choice = Cin.readInt();
			switch (choice) {

			case 1: // message1
				int rows = 3;
				int[][] encM = A;
				int[][] decM = inverseA;
				String msg = message1;

				int[] arr = Cryptography.stringToArray(msg);
				int[][] uncodedMatrix = Cryptography.arrayToUncodedMatrix(arr,
						rows);
				int[][] codedMatrix = Cryptography.encodeMatrix(encM,
						uncodedMatrix);
				int[][] decodedMatrix = Cryptography.decodeMatrix(decM,
						codedMatrix);
				int[] decodedMatrixToArray = Cryptography
						.matrixToArray(decodedMatrix);
				String finalMessage = Cryptography
						.arrayToString(decodedMatrixToArray);

				System.out.println("Message sent: " + message1 + "\n");
				System.out.println("Message to array \n"
						+ MatrixIntOp.asString(arr) + "\n");
				System.out.println("Array of the message to matrix\n"
						+ MatrixIntOp.asString(uncodedMatrix) + "\n");
				System.out.println("Matrix used for encoding \n"
						+ MatrixIntOp.asString(encM) + "\n");
				System.out.println("Encoded Matrix\n"
						+ MatrixIntOp.asString(codedMatrix) + "\n");
				System.out.println("Matrix used for decoding \n"
						+ MatrixIntOp.asString(decM) + "\n");
				System.out.println("Decoded Matrix\n"
						+ MatrixIntOp.asString(decodedMatrix) + "\n");
				System.out.println("Array of the decoded matrix\n"
						+ MatrixIntOp.asString(decodedMatrixToArray) + "\n");
				System.out.println("Arrived and decoded\n" + finalMessage);
				break;

			case 2: // message2
				int rows2 = 3;
				int[][] encM2 = A;
				int[][] decM2 = inverseA;
				String msg2 = message2;

				int[] arr2 = Cryptography.stringToArray(msg2);
				int[][] uncodedMatrix2 = Cryptography.arrayToUncodedMatrix(
						arr2, rows2);
				int[][] codedMatrix2 = Cryptography.encodeMatrix(encM2,
						uncodedMatrix2);
				int[][] decodedMatrix2 = Cryptography.decodeMatrix(decM2,
						codedMatrix2);
				int[] decodedMatrixToArray2 = Cryptography
						.matrixToArray(decodedMatrix2);
				String finalMessage2 = Cryptography
						.arrayToString(decodedMatrixToArray2);

				System.out.println("Message sent: " + message1 + "\n");
				System.out.println("Message to array \n"
						+ MatrixIntOp.asString(arr2) + "\n");
				System.out.println("Array of the message to matrix\n"
						+ MatrixIntOp.asString(uncodedMatrix2) + "\n");
				System.out.println("Matrix used for encoding \n"
						+ MatrixIntOp.asString(encM2) + "\n");
				System.out.println("Encoded Matrix\n"
						+ MatrixIntOp.asString(codedMatrix2) + "\n");
				System.out.println("Matrix used for decoding \n"
						+ MatrixIntOp.asString(decM2) + "\n");
				System.out.println("Decoded Matrix\n"
						+ MatrixIntOp.asString(decodedMatrix2) + "\n");
				System.out.println("Array of the decoded matrix\n"
						+ MatrixIntOp.asString(decodedMatrixToArray2) + "\n");
				System.out.println("Arrived and decoded\n" + finalMessage2);
				break;

			case 3: // message3
				int rows3 = 2;
				int[][] encM3 = B;
				int[][] decM3 = inverseB;
				String msg3 = message3;

				int[] arr3 = Cryptography.stringToArray(msg3);
				int[][] uncodedMatrix3 = Cryptography.arrayToUncodedMatrix(
						arr3, rows3);
				int[][] codedMatrix3 = Cryptography.encodeMatrix(encM3,
						uncodedMatrix3);
				int[][] decodedMatrix3 = Cryptography.decodeMatrix(decM3,
						codedMatrix3);
				int[] decodedMatrixToArray3 = Cryptography
						.matrixToArray(decodedMatrix3);
				String finalMessage3 = Cryptography
						.arrayToString(decodedMatrixToArray3);

				System.out.println("Message sent: " + message3 + "\n");
				System.out.println("Message to array \n"
						+ MatrixIntOp.asString(arr3) + "\n");
				System.out.println("Array of the message to matrix\n"
						+ MatrixIntOp.asString(uncodedMatrix3) + "\n");
				System.out.println("Matrix used for encoding \n"
						+ MatrixIntOp.asString(encM3) + "\n");
				System.out.println("Encoded Matrix\n"
						+ MatrixIntOp.asString(codedMatrix3) + "\n");
				System.out.println("Matrix used for decoding \n"
						+ MatrixIntOp.asString(decM3) + "\n");
				System.out.println("Decoded Matrix\n"
						+ MatrixIntOp.asString(decodedMatrix3) + "\n");
				System.out.println("Array of the decoded matrix\n"
						+ MatrixIntOp.asString(decodedMatrixToArray3) + "\n");
				System.out.println("Arrived and decoded\n" + finalMessage3);
				break;
			case 4: // inverse A

				int I[][] = MatrixIntOp.multiply(A, inverseA);
				System.out.println("A\n" + MatrixIntOp.asString(A) + "\n");
				System.out.println("B\n" + MatrixIntOp.asString(inverseA)
						+ "\n");
				System.out.println("A * inverseA = I\n"
						+ MatrixIntOp.asString(I) + "\n");
				System.out
						.println("inverseA is the inverse of A because the result is I\n");
				System.out.println();
				break;
			case 5: // inverse B

				int I1[][] = MatrixIntOp.multiply(B, inverseB);
				System.out.println("A\n" + MatrixIntOp.asString(B) + "\n");
				System.out.println("B\n" + MatrixIntOp.asString(inverseB)
						+ "\n");
				System.out.println("B * inverseB = I\n"
						+ MatrixIntOp.asString(I1) + "\n");
				System.out
						.println("inverseB is the inverse of B because the result is I");
				break;
			}

		} while (choice > 0);
		System.out.println("** End of test **");

	}

	private static void menu(String msg1, String msg2, String msg3) {
		System.out.println();
		System.out.println(" TEST-MENU for Cryprography");
		System.out.println(" 1) Message to crypt: " + msg1);
		System.out.println(" 2) Message to crypt: " + msg2);
		System.out.println(" 3) Message to crypt: " + msg3);
		System.out.println(" 4) A and inverse of A ");
		System.out.println(" 5) B and inverse of B ");
		System.out.println(" 0) Quit");
		System.out.print(" Type your choice: ");
		System.out.println();
	}

}
