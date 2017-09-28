package ajp_Task_1_3_June2013;

public class Task1 {

	public static long power(long x, int n){
		
		
		if(n == 0)
			return 1;
		
		else 
		return x *power(x, n-1);
	}
	
	public static long iterativePower(long x, int n){
		
		if (n==0)
			return 1;
		
		int result =1;
		while (n>0){
			result *=x;
			n--;
		}
		return result;
		
	}
	
	public static long pwr(long x, int n){
		
		if(n==0)
			return 1;
		int result = 1;
		if(n%2==0)
	return pwr(x, n/2) * pwr(x, n/2);
		
		else 
			return x* pwr(x, n-1);	
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(power(2, 10));
		System.out.println(iterativePower(2, 10));
		System.out.println(pwr(2, 12));
	}
}
