package handin5.Search;

public class search {

	public static int linearSearch(int[] arr, int key, int left, int right) {
		if (arr != null && 0 <= left && left <= right && right < arr.length) {
			for (int i = left; i <= right; i++) {
				if (arr[i] == key) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int key, int left, int right) {
		int mid;
		if (arr != null && 0 <= left && left <= right && right < arr.length) {

			mid = (left + right) / 2;

			if (arr[mid] == key)
				return mid;

			else if (key < arr[mid])
				return binarySearch(arr, key, left, mid - 1);
			else
				return binarySearch(arr, key, mid + 1, right);

		}
		return -1;
	}
	
	
	public static int search(int[] arr, int key, int left, int right)
	{
		if((right-left) < 10){
			System.out.println("LiniarSearch used");
			return linearSearch(arr, key, left, right);
		}
		else
			System.out.println("BinarySearch used");
		
		return binarySearch(arr, key, left, right);
	}
	
	
}
