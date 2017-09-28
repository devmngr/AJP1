package ajp_Task_1_3_June2011;

public class Task1 {

public static double calcPower(double x, int n){
		
		if(n == 0)
			return 1;
		else if(x == 0)
			return 0;
		else if(n==1 && x!=0)
			return x;
		else 
			return x * calcPower(x,	 n-1);
		
	}
	
	public static long factorial(int n){
		long result = 1;
			while (n>0){
				
				result *= n;
				n--;
			}
		return result;
	}
	
	public static double exp(double x, int k)
	{
	
		double sum = 0.0;
		for (int n = 0; n <=k ; n++) {
			sum += calcPower(x, n) / factorial(n);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(calcPower(10, 2));
		System.out.println(factorial(5));
		System.out.println(exp(3.0, 5));
	}
}
