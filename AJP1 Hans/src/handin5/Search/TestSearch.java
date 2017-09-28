package handin5.Search;

import recursiveLinkedList.Cin;

public class TestSearch {

	public static void main(String[] args) {
		
		int size = 50;
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		
		
		System.out.println("Enter left: ");
		int left = Cin.readInt();
		
		System.out.println("Enter right; ");
		int right = Cin.readInt();
		
		System.out.println("Enter key: ");
		int key = Cin.readInt();
		
		System.out.println("Linear search: " + search.linearSearch(arr, key, left, right) );
		System.out.println("Binary search: " + search.binarySearch(arr, key, left, right));
		System.out.println("index: " +search.search(arr, key, left, right));
		
		

	}

}
