/**
 * Class: CMSC203 Spring 2020
 * Program: lab10
 * Instructor: Prof. Gregoriy Grinberg
 * Description: a Java program for graphing functions
 * Due: 04/12/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

public class Function4 extends Function {

	@Override
	public double fnValue(double x) {
		return (Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
	}
	
	public String toString () {
		return "x^3 - 7*x^2 + 15*x - 9";
	}

}