
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

/**
 * Movie class, represents a Movie object
 * @author ralexander
 *
 */
public class Movie {

	private String title;
	private String rating;
	private int  soldTickets;
	 
	/**
	 * Default no-arg Constructor
	 */
	public  Movie ()
	{
		title = "";
		rating = "";
		soldTickets = 0;	
	}
	/**
	 * Copy Constructor that produces a deep copy of the argument
	 * @param m A Movie Object
	 */
	public  Movie (Movie m)
	{
		title = m.title;
		rating = m.rating;
		soldTickets = m.soldTickets;	
	}
	
	/**
	 * Constructor that takes data as input and sets them.
	 * @param title the title of the movie
	 * @param rating the rating of the movie
	 * @param soldTickets number of tickets sold at this theater
	 */
	public Movie(String title, String rating, int soldTickets) {
	 
		this.title = title;
		this.rating = rating;
		this.soldTickets = soldTickets;
	}
	/**
	 * Returns the movie's title
	 * @return a String corresponding to the movie title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * sets movie's title
	 * @param title the title of the movie
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * returns movie's rating
	 * @return a string for movie rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * sets movie's rating
	 * @param rate movie rating
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * returns number of sold tickets
	 * @return an int representing number of tickets sold
	 * 	 */
	public int getSoldTickets() {
		return soldTickets;
	}
	/**
	 * sets number of sold tickets
	 * @param soldTickets number of the soldTickets 
	 */
	public void setSoldTickets(int soldTickets) {
		this.soldTickets = soldTickets;
	}	
	
	/**
	 * Returns a string with relevant movie information
	 */
	public String toString() {
		return (this.title+" ("+this.rating+"): Tickets Sold: "+this.soldTickets);
	}
}
