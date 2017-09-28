package numericalRootFinding;

import java.text.DecimalFormat;

public class RootFinding {

	public static double biSection1(Function fct,final double left, final double right, final double epsilon) {
		if (Math.abs(right - left) < epsilon)
			return (left + right )/ 2;
		else {
			double middle = (left + right) / 2;

			if (fct.f(left) * fct.f(middle) > 0) {
				return biSection1(fct, middle, right, epsilon);
			} else

				return biSection1(fct, left, middle, epsilon);
		}
	}

	public static double biSection2(Function fct, final double a, final double b,
		 double epsilon) {
		double left = a;
		double right = b;
		
		while (Math.abs(right - left) > epsilon) {
			double midpoint = (right + left) / 2;

			if (fct.f(left) * fct.f(midpoint) > 0) {
				left = midpoint;
			} else
				right = midpoint;
		}
		return (left + right) / 2;
	}

	public static void main(String[] args) {
		
		F1 f1 = new F1();
		double left = -4;
		double right = 5;
		double epsilon = 0.00001;
		
		 DecimalFormat formatter = new DecimalFormat("#0.0000");

		 

		System.out.println("Base case: " + formatter.format(RootFinding.biSection1(f1, left, right, epsilon)));
		System.out.println("Iteration case: " + formatter.format(RootFinding.biSection2(f1, left, right, epsilon)));
		
	}

}
