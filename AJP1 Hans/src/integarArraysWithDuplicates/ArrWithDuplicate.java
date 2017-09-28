package integarArraysWithDuplicates;

public class ArrWithDuplicate {
	private int arr[];

	public static boolean hasDuplicates(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return true;
		}
		return false;
	}

	public static int countDifferentElements(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				count++;
			}
		}

		return count;
	}

	public static int[] removeDuplicates(int[] arr) {

		sort(arr);

		if (hasDuplicates(arr)) {
			int[] temp = new int[countDifferentElements(arr)];
			int index = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					temp[index] = arr[i];
					index++;
					if (i + 1 == arr.length - 1 && arr[i] != arr[i + 1]) {
						temp[index] = arr[i + 1];
					}
				}
			}
			return temp;
		}

		else
			return arr;

	}


	private static int findSmallestElemIn(int[] A, int from, int to) {
		int idxToSmallest = from;

		for (int i = from + 1; i <= to; i++) {
			if (A[i] < A[idxToSmallest])
				idxToSmallest = i;
		}
		return idxToSmallest;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i < arr.length - 1) {
				str += ", ";
			}
		}
		return str;
	}

	private static void sort(int[] arr) {
		int i = 0;
		int[] temp = arr;
		while (i < temp.length) {
			int idx = findSmallestElemIn(arr, i, temp.length - 1);
			swap(temp, idx, i);
			i++;
		}

	}

}
