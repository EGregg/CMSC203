/**
 * 
 */
package assignment5;

/**
 * @author Gregg
 *
 */
public class HolidayBonus {

	public HolidayBonus() {

	}

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double storeBonus[] = new double[data.length];
		double highestBonus = 0;
		double lowestBonus = 0;
		int maxCol = 0;
		
		// total number of columns
		for (int i = 0; i <= data.length; i++) {
				if (data[i].length > maxCol) {
					maxCol = data[i].length;
					System.out.println(maxCol);
				}
			
		}

		for (int i = 0; i < maxCol; i++) {
			if (TwoDimRaggedArrayUtility.getHighestInColumn(data, i) > 0) {
				highestBonus = TwoDimRaggedArrayUtility.getHighestInColumn(data, i);
				System.out.println(highestBonus);
			}
			if (TwoDimRaggedArrayUtility.getLowestInColumn(data, i) > 0
					&& TwoDimRaggedArrayUtility.getLowestInColumn(data, i) != highestBonus) {
				lowestBonus = TwoDimRaggedArrayUtility.getLowestInColumn(data, i);
			}
			storeBonus[(int) highestBonus] += high;
			storeBonus[(int) lowestBonus] += low;

		}

		for (int i = 0; i < maxCol - 1; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] != highestBonus || data[i][j] != lowestBonus || data[i][j] >= 0) {
					storeBonus[i] = other;
				}
			}

		}
		return storeBonus;
	}
	
	  public static double calculateTotalHolidayBonus(double[][] data, double high,
	  double low, double other) {
		  
		 double total = 0;
		 double bonus[] = HolidayBonus.calculateHolidayBonus(data, high, low, other);
	  
		 for (int i = 0; i < bonus.length; i++) {
			 total += bonus[i];
		 }
		 
		 return total;
	  }
	 
}
