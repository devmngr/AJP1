package handin6.Sort;

public class Bucket {
	private int[] bucket;
	private int count; // the next free place in the bucket

	/*
	 * size is the maximum number of elements that can be held in this bucket.
	 * You may assume that the user of the bucket never inserts more than 'size'
	 * elements.
	 */

	public Bucket(int size) {
		bucket = new int[size];
		count = 0;
	}

	/* Inserts x on the next free place in the bucket */
	public void insert(int x) {
		bucket[count] = x;
		count++;
	}

	/* Sorts bucket, using a simple sorting method */

	//Selection Sort
	public void sort() {
		int i = 0;

		while (i < count - 1) {
			int idx = findSmallestElemIn(bucket, i, count - 1);
			swap(bucket, idx, i);
			i++;
		}

	}

	/*
	 * Copies the bucket elements into A; first is the first place in A to copy
	 * an element from the bucket. The method returns how many elements have
	 * been copied from the bucket
	 */
	public int copyBucketInto(int[] A, int first) {
		// System.out.println(first +", " + (first+count));
		int idx = first;
		for (int i = 0; i < count; i++) {
			A[idx] = bucket[i];
			idx++;
		}
		return count;
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += bucket[i];
			if (i < count - 1) {
				str += ", ";
			}
		}
		return str;
	}
	public static void bucketSort(int[] A, int m) {

		Bucket bucket0 = new Bucket(m);
		Bucket bucket1 = new Bucket(m);
		Bucket bucket2 = new Bucket(m);
		Bucket bucket3 = new Bucket(m);

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 25) {
				bucket0.insert(A[i]);
			}
			if (25 <= A[i] && A[i] < 50) {
				bucket1.insert(A[i]);
			}
			if (50 <= A[i] && A[i] < 75) {
				bucket2.insert(A[i]);
			}
			if (75 <= A[i] && A[i] < 100) {
				bucket3.insert(A[i]);
			}
		}
		bucket0.sort();
		bucket1.sort();
		bucket2.sort();
		bucket3.sort();

		int temp = bucket0.copyBucketInto(A, 0);
		int temp2 = temp + bucket1.copyBucketInto(A, temp);
		int temp3 = temp2 + bucket2.copyBucketInto(A, temp2);
		bucket3.copyBucketInto(A, temp3);

	}
	
	public static String asString(int[] A)
	{
		String str = "";
		for (int i = 0; i < A.length; i++) {
			str += A[i];
			
			if(i<A.length-1)
			{
				str += ", ";
			}
		}
		return str;
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
}
