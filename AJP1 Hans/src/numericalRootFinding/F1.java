// *****************************************************************************
// File name  : F1.java
// Start date :
// Programmer : Hans So.
// Java       : Java 1.7.0
// Description:
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************
package numericalRootFinding;

public class F1 implements Function {

	public double f(double x) {
		return x * x * x + 4 * x * x - 10;
	}

}
