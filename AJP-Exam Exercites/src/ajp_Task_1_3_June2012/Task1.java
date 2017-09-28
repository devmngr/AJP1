package ajp_Task_1_3_June2012;

public class Task1 {

	public static boolean isPalindrome(char[] A) {

		int left = 0;
		int right = A.length - 1;

		while (left < right) {
			if (A[left] != A[right])
				return false;

			left++;
			right--;

		}
		return true;

	}

	public static boolean isRecPalindrome(char[] A, int left, int right) {

		if (left == right)
			return true;
		else if (left < right) {

			if (A[left] == A[right])
				return isRecPalindrome(A, left + 1, right - 1);
		}

		return false;

	}
	
	

	public static void main(String[] args) {

		char[] A = { 'l', 'o', 'l' };
		System.out.println(isPalindrome(A));
		System.out.println(isRecPalindrome(A, 0, 2));

	}

}
