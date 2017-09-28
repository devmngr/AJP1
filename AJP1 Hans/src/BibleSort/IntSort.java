package BibleSort;
import java.util.Arrays;

public class IntSort {

	private int[] arr;
	private int count;

	public IntSort(int size) {
		arr = new int[size];
		count = 0;
	}

	public void insert(int x) {
		arr[count] = x;
		count++;
	}

	public void selectionSort() {
		int i = 0;

		while (i < count - 1) {
			int idx = findSmallestElemIn(arr, i, count - 1);
			swap(arr, idx, i);
			i++;
		}
	}

	public void insertionSort() {
		int i = 1;
		while (i <= count - 1) {
			int idx = i;
			putIntoRightPlace(arr, idx);
			i++;
		}
	}

	public static void quickSort(int[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q);
			quickSort(A, q + 1, r);
		}
	}
	
	
	public static void bubbleSort(int[] array){
		int position, scan;
		int temp;
		
		for (int i = array.length-1; i >= array.length-1; i--) 
			for (int j = 0; j <=i-1; j++) 
				if(array[j].co)
		
		
	}

	public static int partition(int[] A, int p, int r) {
		int x = A[p]; // pivot element x
		int i = p - 1;
		int j = r + 1;

		// partition
		while (true) {
			do {
				j--;
			} while (A[j] > x);
			do {
				i++;
			} while (A[i] < x);

			if (i < j)
				swap(A, i, j);
			else
				return j;
		}

	}

	private static void putIntoRightPlace(int[] A, int index) {
		int element = A[index];// get element at place index
		for (int i = index; i > 0; i--) {
			if (A[i] < A[i - 1]) {
				swap(A, i, i - 1);
			}
		}

	}

	private static int findSmallestElemIn(int[] A, int from, int to) {
		int idxToSmallest = from;

		for (int i = from + 1; i <= to; i++) {
			if (A[i] < A[idxToSmallest])
				idxToSmallest = i;
		}
		return idxToSmallest;
	}

	private static void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += arr[i];
			if (i < count - 1) {
				str += ", ";
			}
		}
		return str;
	}
}
