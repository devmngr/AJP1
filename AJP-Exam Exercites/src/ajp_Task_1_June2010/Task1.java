package ajp_Task_1_June2010;

public class Task1 {

	// recursive
	public static int intDivision(int m, int n) {

		if (m < n)
			return 0;

		else
			return 1 + intDivision(m - n, n);

	}
//iterative
	public static int iterativeIntDivision(int m, int n) {
		int count = 0;

		while (m > n) {
			m = m - n;
			count++;
		}
		return count;

	}

	public static void main(String[] args) {

		System.out.println(intDivision(15, 4));
		System.out.println(iterativeIntDivision(1, 2));

	}

}
