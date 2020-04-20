package assignment5;

import java.io.*;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Assignment5Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
	    File testFile = new File("");
	    String currentPath = testFile.getAbsolutePath();
	    System.out.println("current path is: " + currentPath);
	    
	    File nf = new File("C:\\Users\\Gregg\\eclipse-workspace_1_8\\assignment5\\src\\assignment5\\dataSet1.txt");
	    Scanner sc = new Scanner(nf);
	    while (sc.hasNextLine()) {
	    	String line = sc.nextLine();
	    	System.out.println(line + " ");
	    }
	    double[][] dataSetSTUDENT = {
				{1,2,3} , {3,5} , {8,8,9,0}
		};
	    File f = new File("test.txt");
	    TwoDimRaggedArrayUtility.absolute();
	    //TwoDimRaggedArrayUtility.readFile(nf);
	    //TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT,f);
	    HolidayBonus.calculateHolidayBonus(dataSetSTUDENT, 3000, 1000, 200);

	    
	     /*Scanner sc = new Scanner(new BufferedReader(new FileReader("dataSet1.txt")));
	      int rows = 4;
	      int columns = 4;
	      int [][] myArray = new int[rows][columns];
	      while(sc.hasNextLine()) {
	          for (int i=0; i<myArray.length; i++) {
	             String[] line = sc.nextLine().trim().split(" ");
	             for (int j=0; j<line.length; j++) {
	                myArray[i][j] = Integer.parseInt(line[j]);
	             }
	          }
	       }
	       System.out.println(Arrays.deepToString(myArray));
		*/
		//System.out.println(TwoDimRaggedArrayUtility.readFile(obj));
		 
		 
	    System.out.println("waiting:");
	    Scanner sc2 = new Scanner(System.in);
	}
	

}
