package testingArea;

//found out I dont need to import the java.Math class
//found out how to use Math.pow, this will be usefull
import java.util.*;
import java.lang.*;

public class WindChill {

	public static void main(String[] args) {
		//Header
		System.out.println("***********************************************");
		System.out.println("**           Wind Chill Calculator           **");
		System.out.println("***********************************************");
		
		//declare variables that wil be useed through the program
		double windChill, userVel, userTemp;
		Scanner stdin = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		userTemp = stdin.nextDouble();
		System.out.println("Enter the wind speed (must be >= 5 and <= 60): ");
		userVel = stdin.nextDouble();
		
		//use formula to calculate windChill
		windChill = 35.74 + 0.6215*(userTemp) - 35.75*(Math.pow(userVel,0.16)) + 0.4275*(userTemp)*(Math.pow(userVel, 0.16));
		System.out.println("Wind chill temperature: " + windChill + " degrees Fahrenheit");
		
		System.out.println("Programmer: Edward Gregg");
	}
}
