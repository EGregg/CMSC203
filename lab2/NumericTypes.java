/**
 * Class: CMSC203 Spring 2020
 * Program: Lab2 NumericTypes
 * Instructor: Prof. Gregoriy Grinberg
 * Description: This program demonstrates how numeric types and operators behave in Java
 * Due: 02/09/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

import java.util.Scanner; //import the Scanner class

public class NumericTypes {
	public static void main(String[] args) {
		//creates new scanner object
		Scanner stdin = new Scanner(System.in);// TASK #2 Create a Scanner object here

		// identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double userTemp;// Task #2 declare a variable to hold the userâ€™s temperature

		System.out.println("Please input score1:");// Task #2 prompt user to input score1
		score1 = stdin.nextInt();// Task #2 read score1
		System.out.println("Please input score2:");// Task #2 prompt user to input score2
		score2 = stdin.nextInt();// Task #2 read score2

		// Find an arithmetic average
		average = (double) (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0 / 9.0) * (BOILING_IN_F - 32);
		//output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		//System.out.println(output);
		System.out.println("Please enter a temperature:");
		userTemp = stdin.nextDouble();// Task #2 prompt user to input another temperature
		// Task #2 read the userâ€™s temperature in Fahrenheit
		fToC = (5.0 / 9.0) * (userTemp - 32); // Task #2 convert the userâ€™s temperature to Celsius
		System.out.println("The users temp in Celsius is: " + fToC);// Task #2 print the userâ€™s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended
		
		stdin.close();
	}
}
