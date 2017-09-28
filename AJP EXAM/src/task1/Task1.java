package task1;

public class Task1 {
	// Question 1.1
	public static int gcd(int a, int b) {

		do {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		} while (a != b);
		return a;
	}

	// Question 1.2
	public static int recursiveGcd1(int a, int b) {

		if (a % b == 0)
			return b;

		else
			return recursiveGcd1(b, a % b);
	}

	// Question 1.3
	public static int recursiveGcd2(int a, int b) {

		if(a==b)
			return a;
		else if(a%2 ==0 && b%2==0)
			return 2*recursiveGcd2(a/2, b/2);
		else if (a%2!=0 && b%2==0)
			return recursiveGcd2(a, b/2);
		else if (a%2==0 && b%2!=0)
			return recursiveGcd2(a/2, b);
		else if(a>b)
			return recursiveGcd2(a-b, b);
		else 
			return recursiveGcd2(a, b-a);	
	}

	public static void main(String[] args) {

		System.out.println(gcd(42, 54));
		System.out.println(recursiveGcd1(42, 54));
		System.out.println(recursiveGcd2(42, 54));
		System.out.println(11%4);
	}

}
