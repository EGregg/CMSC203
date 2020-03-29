
public class Property {

	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;

	public Property() {
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0;
		this.plot = new Plot();
	}

	public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);

	}

	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x, y, width, depth);
	}

	public String getCity() {
		return city;
	}

	public void setCity() {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner() {
		this.owner = owner;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName() {
		this.propertyName = propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount() {
		this.rentAmount = rentAmount;
	}

	public Plot setPlot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		this.plot = new Plot(x,y,width,depth);
		return plot;
	}

	@Override
	public String toString() {
		return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to " + owner + "\nRent Amount: "
				+ rentAmount;
	}
}
