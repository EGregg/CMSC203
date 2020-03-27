/**
 * Class: CMSC203 Spring 2020
 * Program: lab9
 * Instructor: Prof. Gregoriy Grinberg
 * Description: a Java program to demonstrate inheritance using a bank account
 * Due: 03/29/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edward Gregg
 */

public class CheckingAccount extends BankAccount{
	private final double FEE = .15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}

	
	  public boolean withdraw(double amount) {   
		    return super.withdraw(amount+FEE);
		  }
}
