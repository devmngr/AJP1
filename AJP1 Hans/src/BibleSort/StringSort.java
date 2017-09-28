package BibleSort;

public class StringSort {
	public static void quickSort(String[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q);
			quickSort(A, q + 1, r);
		}
	}

	public static int partition(String[] A, int p, int r) {
		String x = A[p]; // pivot element x
		int i = p - 1;
		int j = r + 1;

		// partition
		while (true) {
			do {
				j--;
			} while (A[j].compareTo(x) > 0);
			do {
				i++;
			} while (A[i].compareTo(x) < 0);

			if (i < j)
				swap(A, i, j);
			else
				return j;
		}

	}

	private static void swap(String[] A, int i, int j) {
		String tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

}
