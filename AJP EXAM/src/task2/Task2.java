package task2;

public class Task2 {

	// /Question 2.1

	/*
	 * arr - is an array of integars k - is a number returns - the k'th smallest
	 * element in arr Precondition: arr is not empty and has distinct
	 * numbers,and 1<=k <=arr.length
	 */

	public static int simpleSelect(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			int idx = findSmallestElemIn(arr, i, arr.length - 1);
			swap(arr, idx, i);

		}
		return arr[k - 1];
	}

	// Question 2.2

	public static int partialSelect(int[] arr, int k) {

		for (int i = 0; i < k - 1; i++) {
			int idx = findSmallestElemIn(arr, i, arr.length - 1);
			swap(arr, i, idx);
		}
		return arr[k - 1];

	}

	// Question 2.3

	public static int quickSelect(int[] arr, int k, int first, int last) {

		int pivotIdx = partition(arr, first, last);
		if (k < partition(arr, first, last) - first + 1)
			return quickSelect(arr, k, first, pivotIdx - 1);

		else if (k == pivotIdx - first + 1)
			return arr[pivotIdx];

		else
			return quickSelect(arr, k - pivotIdx, pivotIdx + 1, last);

	}

	private static int partition(int[] arr, int first, int last) {
		int pivot = arr[first]; // pivot element
		int k = first;

		for (int i = first + 1; i <= last; i++) {
			if (arr[i] < pivot) {
				k++;
				swap(arr, i, k);
			}
		}
		swap(arr, first, k);
		return k;
	}

	private static int findSmallestElemIn(int[] arr, int from, int to) {
		int idxToSmallest = from;

		for (int i = from + 1; i <= to; i++) {
			if (arr[i] < arr[idxToSmallest])
				idxToSmallest = i;
		}
		return idxToSmallest;
	}

	private static void swap(int[] arr, int i, int idx) {
		int tmp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = tmp;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 11, 2, 16, 27, 4, 8, 15, 9 };

		System.out.println(simpleSelect(arr, 4));
		System.out.println(partialSelect(arr, 4));
		System.out.println(quickSelect(arr, 4,0, arr.length - 1));
	}

}
