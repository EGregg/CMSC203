
import java.text.DecimalFormat;

public abstract class Ticket {
	protected String type;
	protected String movieName;
	protected String rating;
	protected int day;
	protected int time;
	protected int id;
	protected double price;
	protected final int EVENING = 18;
	protected final double TAXES = 1.096;
	
	//review enumerated type
	protected Format format;
	
	  public Ticket() {
		    this.type = "Ticket";
		    this.movieName = "";
		    this.rating = "";
		    this.format = Format.NONE;
		    this.day = 1;
		    this.time = 8;
		    this.price = -1;
		  }

		  public Ticket(String movieName, String rating, int day, Format format, int time, int id) {
		    this.type = "Ticket";
		    this.movieName = movieName;
		    this.rating = rating;
		    this.day = day;
		    this.format = format;
		    this.time = time;
		    this.id = id;
		    this.price = -1;
		  }
		  
		//("Little Mermaid", "G", 5,19,"NONE");
		  public Ticket(String movieName, String rating, int day, int time, Format format) {
			    this.type = "Ticket";
			    this.movieName = movieName;
			    this.rating = rating;
			    this.day = day;
			    this.format = format;
			    this.time = time;
			    this.id = id;
			    this.price = -1;
			  }
		  
		  public Ticket(String movieName, String rating, int day, int time, String formatString) {
			    this.type = "Ticket";
			    this.movieName = movieName;
			    this.rating = rating;
			    this.day = day;
			    this.format = Format.NONE;
			    this.time = time;
			    this.id = id;
			    this.price = -1;
		  }
	
	public abstract double calculateTicketPrice();

	public abstract int getId();
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFormat(Format format) {
		this.format = format;
	}
	
	public Format getFormat() {
		return format;
	}
	
	  @Override
	  public String toString() {
	    DecimalFormat df = new DecimalFormat("##0.00");

	    String typeID = type.toUpperCase();

	    if (getId() != 0) {
	      typeID += "-" + id;
	    }

	    String view = "";
	    if (format.equals(Format.THREE_D)) {
	      view = "3D";
	    } else if (format.equals(Format.IMAX)) {
	      view = format.toString();
	    }
	    return typeID + " " + view + " Movie: " + movieName + " Rating: " + rating + " Day: " + day
	        + " Time: " + time + " Price: $" + df.format(price);
	  }
}
