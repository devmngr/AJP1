package Fibonacci;

import util.Cin;

public class Fibonacci {

	public static long fib(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return fib(n - 2) + fib(n - 1);
	}

	public static String timeToString(double sec) {

		int min = 0;
		int hour =0;
		if (sec >= 60) {
			while (sec>=60)
			{
			min ++;
			sec = sec - 60;
			}
			
		}
		return min + " Min " + sec + " Sec ";	
	}

	public static void main(String[] args) {

		System.out.println("Fibonacci" + "\n\nEnter number: ");
		long n = Cin.readLong();
		System.out.println("Counting.........");
		System.out.println();
		double start = System.currentTimeMillis();
		double seconds = 0;

		for (long i = 0; i <= n; i++) {

			// System.out.print();
			double end = System.currentTimeMillis();
			seconds = (end - start) / 1000;

			System.out.println("Fibonacci " + i + " .... " + fib(i) + " .... "
					+ timeToString(seconds));
		}
		double totalTime = (System.currentTimeMillis() - start) / 1000;
		System.out.println();
		System.out.println("Done !");
		System.out.println("Number entered: " + n);
		System.out.println("Total time: " + timeToString(totalTime));
	}

}
