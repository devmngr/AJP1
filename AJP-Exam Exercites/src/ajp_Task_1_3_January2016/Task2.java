package ajp_Task_1_3_January2016;

public class Task2 {

	public static int specialLinearSearch(int[] T, int key) {

		for (int i = 0; i < T.length; i++) {
			if (T[i] == key) {
				if (T[i] > key)
					break;
				return i;
			}
		}
		return -1;

	}

	public static int jumpSearch(int[] T, int key) {
		int j = (int) Math.floor(Math.sqrt(T.length));
		for (int i = 0; i < T.length; i += j)
		{
			int last = i;
			int first = last-j;
			if (T[i] > key) {
				for (int k = first+1; k < last; k++) {
					if (T[k] == key)
						return k;
				}
			}
			else if(j>T.length - i)
			{
				for (int k = first +1; k < T.length; k++) {
					if (T[k] == key)
						return k;
				}
			}
			else if(T[i] == key)
				return i;
		}
			
		return -1;
	}

	public static void main(String[] args) {

		//int[] T = { 2, 4, 5, 7, 9, 12 };
		int[] T = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 615, 678, 789};
		System.out.println(specialLinearSearch(T, 6));

		
		System.out.println(jumpSearch(T, 21));
		
		
		
	}

}
