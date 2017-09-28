package ajp_Task_1_3_January2016;

public class Task1 {

	public static double sqrRoot(double a, double x, double epsilon) {
		while (Math.abs(x * x - a) > epsilon) {
			x = (x + a / x) / 2;
		}

		return x;
	}

	public static double sqrRootRecursive(double a, double x, double epsilon) {

		if (Math.abs(x * x - a) < epsilon) {
			x = (x + a / x) / 2;
			return x;
		} else {
			double avarage = (x + a / x) / 2;
			return sqrRootRecursive(a, avarage, epsilon);
		}

	}

	public static double biSection(Function fct, double a, double b,
			double epsilon) {
		double left = a;
		double right = b;
		if (Math.abs(right - left) < epsilon) {
			return (left + right) / 2;
		} else {
			double middle = (left + right) / 2;
			if (fct.f(left) * fct.f(middle) > 0)
				return biSection(fct, middle, right, epsilon);

			else
				return biSection(fct, left, middle, epsilon);

		}

	}

	

	public static void main(String[] args) {

		double root = Task1.sqrRoot(36, 1, 0.0001);
		double root1 = Task1.sqrRootRecursive(36, 1, 0.0001);

		System.out.println(root);
		System.out.println(root1);
		
		double bi = Task1.biSection( new F1(), 9, 3, 0.001);
		System.out.println(bi);
		
	}
}
