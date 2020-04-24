/**
 * Class: CMSC203 Spring 2020
 * Program: lab11
 * Instructor: Prof. Gregoriy Grinberg
 * Description: extends graphing applications to estimate the optimal solutions
 * Due: 04/26/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

public class Function1 extends Function {
	@Override
	public double fnValue(double x) {
		if (x <= 0.0)
			return Double.MAX_VALUE;
		else
			return (0.8 * Math.PI * Math.pow(x, 2)) + (800 / x);
	}

	@Override
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

	@Override
	public String answerString(double cost, double radius, double y, double z) {

		return "a string that describes the result of the optimization";
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return 2000 / (Math.PI * Math.pow(x, 2));
	}

	public double getZVal(double x) {
		return -1.0;
	}

}
