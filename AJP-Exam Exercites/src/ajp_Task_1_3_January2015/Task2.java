package ajp_Task_1_3_January2015;

public class Task2 {

	public static double mean(double[] data) {

		double result = 0;
		for (int i = 0; i < data.length; i++)
			result += data[i];

		return result / data.length;
	}

	public static double median(double[] data) {

		int middle = data.length / 2;

		if (data.length % 2 == 0)
			return (data[middle] + data[middle - 1]) / 2;
		else
			return data[middle];
	}

	public static double standardDeviation(double[] data) {

		double result = 0;
		for (int i = 0; i < data.length; i++) {
			result += ((data[i] - mean(data)) * (data[i] - mean(data)));
		}

		result = Math.sqrt(result / (data.length-1));
		return result;

	}

	private boolean isSorted(double[] data) {
		double value = 0;
		int idx = 0;

		for (int i = 0; i < data.length; i++) {
			if (value > data[i])
				return false;

			else if (i == data.length - 1 && idx != data.length) {
				idx++;
				value = data[idx];
				i = idx;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		double[] a = { 4, 5, 7, 2, 1 };
		double[] arr = { 1, 2, 3, 4 };
		double[] arr2 = { 1, 2, 3, 4, 5 };

		System.out.println(mean(arr2));
		System.out.println(median(arr));
		System.out.println(median(arr2));
		System.out.println(standardDeviation(a));
	}

}
