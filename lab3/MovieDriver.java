import java.util.Scanner;

/**
 * Class: CMSC203 Spring 2020
 * Program: Lab3 MovieDriver
 * Instructor: Prof. Gregoriy Grinberg
 * Description: Create a program that asks the user for the name of a movie, 
 * 		the rating, the number of tickets sold for the movie and then asks if they would like to create the ratings for a new movie
 * Due: 02/16/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

public class MovieDriver {

	public static void main(String[] args) {
		//initializes a new scanner object
		Scanner stdin = new Scanner(System.in);
		char response;
		
		//do-while loop that proceeds through once and then asks if the user would like to continue
		do
		{
			//creates a new movie object
			Movie movie = new Movie();
			
			//outputs and asks for the user to enter a movie
			System.out.println("Enter the name of a movie");
			String title = stdin.next() + stdin.nextLine();
			movie.setTitle(title);
			
			//outputs and asks for the user to enter the rating for a movie
			System.out.println("Enter the rating of the movie");
			String rating = stdin.next();
			movie.setRating(rating);
			
			//outputs and asks for the user to enter the number of tickets sold for the movie
			System.out.println("Enter the number of tickets sold for this movie");
			int ticketsSold = stdin.nextInt();
			movie.setSoldTickets(ticketsSold);
			
			//output using the toString method on the movie object
			System.out.println(movie.toString());
			
			//outputs asking if the user would like enter another movie, loops while the response is 'y'
			System.out.println("Would you like to enter another movie");
			response = stdin.next().charAt(0);
			
		}while(response == 'y');
		
		stdin.close();
		
		System.out.println("goodbye");
	
	}

}
