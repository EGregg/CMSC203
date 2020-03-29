
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	//I started out by accepting parameters x, y, width and depth then found out I wasn't allowed to do that
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Checking if the property is within the 
	 * @param p
	 * @return
	 */
	public boolean encompasses(Plot p) {
		boolean encompasses1 = x > p.x && x >= (p.x + width);
		boolean encompasses2 = y > p.y && y >= (p.y + depth);
		boolean encompasses3 = (x + width) >= (p.x + p.width);
		boolean encompasses4 = (y + depth) >= (p.y + p.depth);
		
		return encompasses1 && encompasses2 && encompasses3 && encompasses4;
	}
	
	/**
	 * Had to think of it as an object and a box
	 * is x == to x? is x >= x + width? This was an absolute pain
	 * I would've appreciated a better idea of how to think about this is the description for the assignment,
	 * absolutely took the most time
	 * @return true or false if it overlaps with each other
	 */
	/**
	 * 
	 * @param p = Plot object
	 * @return
	 */
	public boolean overlaps(Plot p) {
	//first is checking if the property object is within bounds
	boolean xyOverlaps1 = (x >= p.x && x <= (p.x + width)) && (y >= p.y && y <= (p.y + depth));
	//second is checking if the property object overlaps
	boolean xyOverlaps2 = (p.x <= x && p.x >= (x + width)) && (p.y <= y && p.y >= (y + depth));
	//reversed
	boolean xyOverlaps3 = (x + width) > p.x && (x + width) < (p.x + p.width) && y >= p.y && y <= (p.y + p.depth); 
	boolean xyOverlaps4 = (p.x + p.width) > x && (p.x + p.width) < (x + width) && p.y >= y && p.y <= (y + depth); 
	//continued with each different permutation and checking that the property is within bounds
	boolean xyOverlaps5 = x >= p.x && x < (p.x +  p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
	boolean xyOverlaps6 = p.x >= x && p.x < (x +  width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
	boolean xyOverlaps7 = (x + width) > p.x && (x + width) <= (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
	boolean xyOverlaps8 = (p.x + p.width) > x && (p.x +p.width) <= (x + width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
	
	return xyOverlaps1 && xyOverlaps2 && xyOverlaps3 && xyOverlaps4 && xyOverlaps5 && xyOverlaps6 && xyOverlaps7 && xyOverlaps8;
	}
	
	/**
	 * returns the x
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * sets the x
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * returns the y
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * sets the y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * gets the width
	 * @return
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * sets the width
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * returns the depth
	 * @return
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * sets the depth
	 * @param depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth; 
	}

}
