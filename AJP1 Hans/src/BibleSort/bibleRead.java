package BibleSort;

public class bibleRead {

	public static void main(String[] args) throws Exception {

		String fileName = "D:\\School\\Semester 2\\AJP1 Hans\\L13\\Bible\\Bible.txt";
		String[] result = textReader.readFile(fileName);
		System.out.println("#Words: " + result.length);
		double start = System.currentTimeMillis();
		StringSort.quickSort(result, 0, result.length - 1);
		double end = System.currentTimeMillis();
		double seconds = (end - start) / 1000;
		System.out.println("Seconds to sort bible: " + seconds);
		for (int i = 0; i < result.length; i++) {
			System.out.println(i + " " + result[i]);
		}

	}

}
