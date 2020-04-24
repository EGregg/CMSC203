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

public class Function2 extends Function{
	@Override
	public double fnValue(double x) {
		return (x/3) + (2 *  Math.sqrt(Math.pow(x,2)- 8 * x + 25));
	}

	@Override
	public String toString() {
		return "Minimal amount of time for dog to fetch ball";
	}

	@Override
	public String answerString(double cost, double radius, double y, double z) {

		return "utilizes the pythagorean theorem";
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
