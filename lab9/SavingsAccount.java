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

public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount) {
	    super(name,amount);
	    this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
	    super(oldAccount, amount);
	    this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public void postInterest() {
		super.deposit(super.getBalance()*(rate/12));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
