// *****************************************************************************
// File name  : Exercise5.java.
// Start date : 
// Programmer : Hans So.
// Java       : 
// Description: Template to Exercise 5
//
// *****************************************************************************

package handin.handin1;

public class Exercise5 {

	public static void solving1(int N) {
		// System.out.println("ToDo: implement solving1");
		for (int a = 1; a <= 3 * N - 1 - 1; a++) {
			for (int b = 1; b <= 3 * N - a - 1; b++) {
				int c = 3 * N - a - b;

				printSolution(a, b, c);

			}

		}

	}

	public static long solving2(int N) {
		int count = 0;
		// ToDo: implement solving2
		for (int a = 1; a <= 3 * N - 1 - 1; a++) {
			for (int b = 1; b <= 3 * N - a - 1; b++) {
				int c = 3 * N - a - b;
				count++;
			}

		}
		return count;
	}

	public static long solving3(int N) {
		// ToDo: implement solving3
		int count = 0;
		
		for (int a = 1; a <= 3 * N - 1 - 1; a++) {
			for (int b = 1; b <= 3 * N - a - 1; b++) {
				int c = 3 * N - a - b;

				count++;
			}

		}
		return count;
		
		
	}

	// Private help-method to be used in solving1
	private static void printSolution(int a, int b, int c) {
		System.out.println("<" + a + ", " + b + ", " + c + ">");
	}
}
