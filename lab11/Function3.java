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

public class Function3 extends Function{
	@Override
	public double fnValue(double x) {
		return Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1);
	}

	@Override
	public String toString() {
		return "Minimize the distance between two arbitrary points";
	}

	@Override
	public String answerString(double cost, double radius, double y, double z) {

		return "Formula for the distance between an arbitrary point P on the parabola to the point Q";
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
