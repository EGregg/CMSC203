import java.util.Scanner;
import java.lang.Math;

/**
 * Class: CMSC203 Spring 2020
 * Program: Lab2 SphereVolume
 * Instructor: Prof. Gregoriy Grinberg
 * Description: a Java program to calculate volume of a sphere when a user inputs the diameter
 * Due: 02/09/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

public class SphereVolume {
	public static void main(String[] args) {
		//creates new scanner object
		Scanner stdin = new Scanner(System.in);
		
		//variable initialization
		double userDiameter, radius;
		double volumeSphere;

		//outputs to the terminal asking for the diameter and then accepts the next double entered from keyboard
		System.out.println("What is the diameter of a sphere");
		userDiameter = stdin.nextDouble();
		
		//the radius is 1/2 of the diameter of the circle
		radius = (double) (userDiameter / 2.0);

		//volume of the sphere is calculated using the formula 4/3 * PI * r ^ 2
		volumeSphere = ((double) (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));

		//ouput displaying the input diameter and the calculated volume of sphere
		System.out.println("Given a diameter of " + userDiameter + ", the volume of the sphere is " + volumeSphere);
		
		stdin.close();
	}
}
