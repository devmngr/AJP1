package integarArraysWithDuplicates;

public class ArrWithDuplicateMAIN {
	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 3, 4, 5, 5, 7,8};

		int[] arr2 = { 2, 3, 4, 5, 7,8,8};
		
		System.out.println("ARR has duplicate: " + ArrWithDuplicate.hasDuplicates(arr));
		System.out.println("nr of different elements in ARR: "+ArrWithDuplicate.countDifferentElements(arr));
		 
		
		int[] x =ArrWithDuplicate.removeDuplicates(arr);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}

}
