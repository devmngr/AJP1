package handin6.Sort;

public class Test {

	public static void main(String[] args) {

		Bucket bucket = new Bucket(99);

		bucket.insert(78);
		bucket.insert(17);
		bucket.insert(39);
		bucket.insert(26);
		bucket.insert(72);
		bucket.insert(94);
		bucket.insert(21);
		bucket.insert(4);
		bucket.insert(47);
		bucket.insert(12);
		bucket.insert(68);
		bucket.insert(87);

		System.out.println("Bucket Unsorted: " + bucket);
		bucket.sort();
		System.out.println("Bucket Sorted: " + bucket);
		System.out.println();

		int[] A = { 78, 17, 39, 26, 72, 94, 21, 4, 47, 12, 68, 87 };

		System.out.println("A[] unsorted: " + Bucket.asString(A));
		Bucket.bucketSort(A, 5);

		System.out.println("A[] sorted: " + Bucket.asString(A));
	}
}
