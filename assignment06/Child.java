//refered back to module 16 for inheritance and extending
public class Child extends Ticket {
	
	  private final double BEFORE_6PM = 5.75;
	  private final double AFTER_6PM = 10.75;
	  private final double IMAX_PRICE = 2;
	  private final double THREE_D_PRICE = 1.5;

	// slide 21
	  public Child() {
		    super.type = "Child";
		  }
	  		//("Little Mermaid", "G", 5,19,"NONE");
		  public Child(String movieName, String rating, int day, int time, Format format) {
			  super(movieName, rating, day, time, format);
		    super.type = "Child";
		  }

	@Override
	public double calculateTicketPrice() {
		double price = (time < EVENING) ? BEFORE_6PM : AFTER_6PM;
	    if (format.equals(Format.IMAX)) {
	      price += IMAX_PRICE;
	      //System.out.println("IMAX!");
	    } else if (format.equals(Format.THREE_D)) {
	      price += THREE_D_PRICE;
	    }
	    return price * TAXES;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return -1;
	}

}