package ajp_Task_1_3_June2015;

public class Task1 {

	public static int factorial(int n) {
		int result = 1;
		if (n == 1)
			return 1;

		else
			while (n >= 1) {
				result *= n;
				n--;
			}
		return result;
	}

	public static int binomial(int n, int q) {

		if (0 <= q && q <= n) {
			return factorial(n) / (factorial(n - q) * factorial(q));
		} else
			return 0;
	}

	public static int binominalRecursive(int n, int q) {

		if (q == 0 || n == q)
			return 1;

		else
			return binominalRecursive(n - 1, q)
					+ binominalRecursive(n - 1, q - 1);

	}

	public static void main(String[] args) {

		System.out.println(Task1.factorial(5));
		System.out.println(Task1.binomial(4, 2));
		System.out.println(Task1.binominalRecursive(4, 2));
	}

}
