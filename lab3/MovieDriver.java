import java.util.Scanner;

//Programmer: Edward Gregg

public class MovieDriver {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		char response;
		
		do
		{
			Movie movie = new Movie();
			
			System.out.println("Enter the name of a movie");
			String title = stdin.next() + stdin.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the rating of the movie");
			String rating = stdin.next();
			movie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			int ticketsSold = stdin.nextInt();
			movie.setSoldTickets(ticketsSold);
			
			System.out.println(movie.toString());
			
			System.out.println("Would you like to enter another movie");
			response = stdin.next().charAt(0);
			
		}while(response == 'y');
		
		stdin.close();
		
		System.out.println("goodbye");
	
	}

}
