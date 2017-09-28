package ajp_Task_1_June209;

public class Task1 {
	// /recursive
	public static double golden1(int n) {

		if (n == 0)
			return 1;

		else
			return 1 + 1 / golden1(n - 1);
	}
	// iterative
	public static double golden2(int n){
		
		int result = 1;
		if (n == 0)
			return 1;
		while(n>0){
			
			result = 1 + 1/result;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(golden1(10));
		System.out.println(golden2(10));
	}
}
