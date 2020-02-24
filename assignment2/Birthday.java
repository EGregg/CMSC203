package assignment2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 * @author Edward Gregg 
 * CMSC 203 20200223
 *
 */

public class Birthday {

	public static void main(String args[]) {

		// VARIABLE DECLARATIONS
		String userName, userToy;
		String userAge;
		int age;
		double total = 0;
		String anotherGift;
		String balloon, card;

		DecimalFormat dollar = new DecimalFormat("#,##0.00"); // format cost

		System.out.println("Project: BIRTHDAY GIFTS");

		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company \nto choose gifts for young children");

		do {

			// call empty toy constructor
			Toy toy1 = new Toy();

			// get user name choice
			userName = JOptionPane.showInputDialog("Enter the name of the child");

			// get user toy choice
			userToy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			toy1.setToy(userToy);

			// set cost of toy
			toy1.setCost(userToy);

			// get user age and validate that the toy is age appropriate
			do {
				userAge = JOptionPane.showInputDialog("How old is the child?");
				age = Integer.parseInt(userAge);
				toy1.setAge(age);

				toy1.ageOK();

				// use this to check toy1.ageOK() validation
				// System.out.println(toy1.ageOK());
			} while (!toy1.ageOK());

			// learned about .equalsIgnoreCase(String) method
			balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			if (balloon.equalsIgnoreCase("yes")) {
				toy1.addBalloon(balloon);
			}

			card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			if (balloon.equalsIgnoreCase("yes")) {
				toy1.addCard(card);
			}

			System.out.println(userName + toy1);

			total += toy1.getCost();

			// checking total cost
			// System.out.println(total);

			anotherGift = JOptionPane.showInputDialog("Would you like to purchase another gift? Yes or No");

		} while (anotherGift.toLowerCase().charAt(0) == 'y');

		System.out.println("Total cost for the order is $" + dollar.format(total) + ". Order number is "
				+ (Math.round(Math.random() * 89999) + 10000));

		System.out.println("Programmer: Edward Gregg");
	}

}
