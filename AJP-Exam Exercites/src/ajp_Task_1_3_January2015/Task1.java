package ajp_Task_1_3_January2015;

public class Task1 {

	// formula 1
	public static long recFib(int n) {

		if (n == 1 || n == 2)
			return 1;
		else
			return recFib(n - 1) + recFib(n - 2);
	}

	public static long iterativeFib(int n) {

		long result = 0;
		long x = 1;
		long y = 1;
		for (int i = 0; i < n; i++) {
			x = y;
			y = result;
			result = x + y;
		}
		return result;
	}

	// formula 2
	public static long recFib2(int n)
	{
		if(n==1 || n==2)
			return 1;
		 if (n%2 == 0)
			// return (long) Math.pow(recFib2(n/2+1), 2) -(long) Math.pow(recFib2(n/2-1), 2);
			return recFib2(n/2+1) * recFib2(n/2+1)- recFib2(n/2-1) * recFib2(n/2-1);
		else 
		//	return (long) Math.pow(recFib2((n+1)/2),2)+ (long) Math.pow(recFib2((n-1)/2),2);
			return recFib2((n+1)/2)* recFib2((n+1)/2)+ recFib2((n-1)/2)* recFib2((n-1)/2);
	}

	public static void main(String[] args) {

		System.out.println(recFib(27));
		System.out.println(iterativeFib(27));
		System.out.println(recFib2(27));
	}

}
