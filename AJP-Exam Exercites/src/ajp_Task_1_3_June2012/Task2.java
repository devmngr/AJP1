package ajp_Task_1_3_June2012;

public class Task2 {

	public static int max(int[] A) {

		int max = 0;

		for (int i = 0; i < A.length; i++)
			if (A[i] > max)
				max = A[i];

		return max;

	}

	public static int[] createCountersArray(int[] A) {
		int[] res = new int[max(A) + 1];
		for (int i = 0; i < res.length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++)
				if (A[j] == i)
					count++;

			res[i] = count;
		}
		return res;
	}

	public static void countingSort(int[] A) {

		int[] temp = createCountersArray(A);
		int idx = 0;
		for (int j = 0; j < temp.length; j++)
			for (int k = 0; k < temp[j]; k++) {

				A[idx] = j;
				idx++;

			}
	}

	public static void main(String[] args) {

		int[] A = { 4, 2, 1, 3, 4, 1, 2, 1, 0, 6, 4 };

		System.out.println(max(A));
		String str = "";
		int[] x = createCountersArray(A);
		for (int i = 0; i < x.length; i++) {
			str += x[i] + ", ";
		}
		System.out.println(str);

		String s = "";
		countingSort(A);
		for (int i = 0; i < A.length; i++) {
			s += A[i] + ", ";
		}
		System.out.println(s);
	}
}
