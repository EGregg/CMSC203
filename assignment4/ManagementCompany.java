import javafx.beans.property.Property;

public class ManagementCompany {
	// initial field declarations
	private final int MAX_PROPERTY;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;

	/**
	 * No-Arg Constructor that creates a ManagementCompany object using empty
	 * strings and a default Plot. "properties" array is initialized here as well.
	 */
	public ManagementCompany() {
	    this.name = "";
	    this.taxID = "";
	    this.mgmFeePer = 0;
	    this.plot = new Plot();
	    this.properties = new Property[MAX_PROPERTY];
	}

	/**
	 * Constructor Creates a ManagementCompany object using the passed information.
	 * Mgmt Co plot is initialized to default Plot. "properties" array is
	 * initialized here as well.
	 * 
	 * @param name   - management company name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee) {
	    this.name = name;
	    this.taxID = taxID;
	    this.mgmFeePer = mgmFeePer;
	    this.plot = new Plot(0,0,MAX_WIDTH, MAX_DEPTH);
	    this.properties = new Property[MAX_PROPERTY];
	}

	/**
	 * Constructor Creates a ManagementCompany object using the passed information.
	 * "properties" array is initialized here as well.
	 * 
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
	    this.name = name;
	    this.taxID = taxID;
	    this.mgmFeePer = mgmFeePer;
	    this.plot = new Plot(x,y,width,depth);
	    this.properties = new Property[MAX_PROPERTY];
	}

	/**
	 * Copy Constructor creates a ManagementCompany object using another
	 * ManagementCompany object. "properties" array is initialized here as well.
	 * 
	 * @param otherCompany
	 */

	public ManagementCompany(ManagementCompany otherCompany) {

	}

	/**
	 * Return the MAX_PROPERTY constant that represent the size of the "properties"
	 * array.
	 * 
	 * @return - the MAX_PROPERTY a constant attribute for this class that is set 5
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	/**
	 * Adds the property object to the "properties" array.
	 * 
	 * @param property - a property object
	 * @return Returns either -1 if the array is full, -2 if property is null, -3 if
	 *         the plot is not contained by the MgmtCo plot, -4 of the plot overlaps
	 *         any other property, or the index in the array where the property was
	 *         added successfully.
	 */
	public int addProperty(Property property) {
		properties.add(property);
	}

	/**
	 * Creates a property object and adds it to the "properties" array, in a default
	 * plot.
	 * 
	 * @param name  - property name
	 * @param city  - location of the property
	 * @param rent  - monthly rent
	 * @param owner - owner of the property
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		this.name = name;
		this.city = city;
		this.rent = rent;
		this.owner = owner;
		

	}

	/**
	 * 
	 * @param name  - property name
	 * @param city  - location of the property
	 * @param rent  - monthly rent
	 * @param owner - owner of the property
	 * @param x     - x location of upper left corner of property's plot
	 * @param y-    y location of upper left corner of property's plot
	 * @param width - width of the property's plot
	 * @param depth - depth of the property's plot
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		properties.add(property);
	}

	/**
	 * This method accesses each "Property" object within the array "properties" and
	 * sums up the property rent and returns the total amount.
	 * 
	 * @return total rent
	 */
	public double totalRent() {
		double total = 0;
		for (int i = 0; i < properties.length(); i++) {
			total += properties[i];
		}
		return total;
	}

	/**
	 * This method finds the property with the maximum rent amount and returns its
	 * toString result. NOTE: For simplicity assume that each "Property" object's
	 * rent amount is different.
	 * 
	 * @return double, the maximum rent amount
	 */
	public double maxRentProp() {
		double maxRent = 0;
		for (int i = 0; i < properties.length(); i++) {
			if (properties[i] > maxRent) {
				maxRent = properties[i];
			}
		}
		return maxRent;
	}

	/**
	 * This method finds the index of the property with the maximum rent amount.
	 * NOTE: For simplicity assume that each "Property" object's rent amount is
	 * different.
	 * 
	 * @return int , the index of the property with the maximum rent amount
	 */
	private int maxRentPropertyIndex() {
		int maxIndex = 0;
		for (int i = 0; i < properties.length; i++) {
			if (properties[i] > properties[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * Displays the information of the property at index i
	 * 
	 * @param i - The index of the property within the array "properties"
	 * @return information of the property at index i
	 */
	private java.lang.String displayPropertyAtIndex(int i) {
		print(properties[i]);
	}

	/**
	 * Displays the information of all the properties in the "properties" array.
	 */
	public java.lang.String toString() {
		println(properties);
	}
}
