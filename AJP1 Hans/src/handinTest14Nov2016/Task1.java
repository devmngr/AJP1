package handinTest14Nov2016;

public class Task1 {

	public static double calcPower(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1 && x != 0) {
			return x;
		} else if (x == 0) {
			return 0;
		}

		else

			return x * calcPower(x, n - 1);
	}

	public static long factorial(int n) {
		/*
		 * Recursive version
		 * if (n == 0) 
		 * return 1; 
		 * else 
		 * return n * factorial(n - 1);
		 */
		int result = n;
		for (int i = 1; i < n; i++) {
			result *=  i;
		}
		return result;
	}
	
	
	public static double exp(double x, int k)
	{
		double sum = 0.0;
		for (int n = 0; n <=k; n++) 
			sum+=calcPower(x, n) /factorial(n);
			
			return sum;
		
		
	}
	

	public static void main(String[] args) {

		
		System.out.println("Power: "+calcPower(12, 2));
		System.out.println("Factorial: "+factorial(5));
		System.out.println(exp(3, 2));

	}

}
