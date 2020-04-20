package assignment5;

//reference this link https://stackoverflow.com/questions/1725904/getting-a-text-file-into-a-two-dimensional-ragged-array-in-java
//reference https://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-java
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors

public class TwoDimRaggedArrayUtility {

	public static void absolute() {
		File testFile = new File("");
		String currentPath = testFile.getAbsolutePath();
		System.out.println("current path is: " + currentPath);
	}

	/**
	 * TwoDimRaggedArrayUtility constructor
	 */
	public TwoDimRaggedArrayUtility() {

	}

	public static double[][] readFile(File file) throws java.io.FileNotFoundException {
		double counter = 0;
		int rowIndex = 0;
		String[][] newArray = new String[0][0];
		File newFile = new File("file");
		Scanner sc = new Scanner(newFile);
		String element = sc.nextLine();

		while (sc.hasNextLine()) {
			if (element != null) {
				counter++;
			}

			String[] row = sc.nextLine().trim().split(" ");
			newArray[rowIndex] = new String[row.length];
			for (int i = 0; i < row.length; i++) {
				newArray[rowIndex][i] = row[i];
			}
			rowIndex++;
		}
		// starts converting the String[][] array into a double[][] array
		double[][] doubleArray = new double[rowIndex][];
		for (int i = 0; i < rowIndex; i++) {
			doubleArray[i] = new double[newArray[i].length];
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.println(newArray[i][j] + " ");
				// dirty way to convert String to double
				doubleArray[i][j] = Double.parseDouble(newArray[i][j]);
			}

		}
		return doubleArray;
	}

	public static void writeToFile(double[][] data, File outputFile) throws IOException {
		FileWriter file = new FileWriter(outputFile);

		for (int i = 0; i <= data.length; i++) {
			for (int j = 0; j <= data[i].length; j++) {
				file.write(data[i][j] + " ");
			}
		}

		file.close();
	}

	public static double getTotal(double[][] data) {
		double total = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];

			}

		}
		return total;
	}

	public static double getAverage(double[][] data) {
		int counter = 0;
		double total = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
				counter++;
			}

		}
		return total / counter;
	}

	public static double getRowTotal(double[][] data, int row) {
		double total = 0;

		for (int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}
		return total;
	}

	// come back to this one
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;

		for (int i = 0; i < data.length; i++) {
			if (col > data[i].length) {
				continue;
			} else {
				total += data[i][col];
			}

		}
		return total;

	}

	// add to design when there are no rows
	public static double getHighestInRow(double[][] data, int row) {
		double highest = 0;

		if (row <= 0) {
			return 0;
		}

		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
			}

		}
		return highest;
	}

	// add to design when there are no rows
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = 0;
		int index = 0;

		if (row <= 0) {
			return 0;
		}

		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}

		}
		return index;
	}

	public static double getLowestInRow(double[][] data, int row) {
		double lowest = 0;

		if (row <= 0) {
			return 0;
		}

		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
			}

		}
		return lowest;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = 0;
		int index = 0;

		if (row <= 0) {
			return 0;
		}

		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}

		}
		return index;
	}

	public static double getHighestInColumn(double[][] data, int col) {
		double highest = 0;

		if (col < 0) {
			return 0;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i][col] > highest) {
				highest = data[i][col];
			}

		}
		return highest;
	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highest = 0;
		int index = 0;

		if (col < 0) {
			return 0;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i][col] > highest) {
				highest = data[i][col];
				index = i;
			}

		}
		return index;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = 0;
		int index = 0;

		if (col < 0) {
			return 0;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i][col] < lowest) {
				lowest = data[i][col];
			}

		}
		return lowest;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = 0;
		int index = 0;

		if (col < 0) {
			return 0;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i][col] < lowest) {
				lowest = data[i][col];
				index = i;
			}

		}
		return index;

	}

	public static double getHighestInArray(double[][] data) {
		double highest = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > highest) {
					highest = data[i][j];
				}
			}

		}
		return highest;
	}

	public static double getLowestInArray(double[][] data) {
		double lowest = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; i < data[i].length; j++) {
				if (data[i][j] < lowest) {
					lowest = data[i][j];
				}
			}

		}
		return lowest;
	}

}
