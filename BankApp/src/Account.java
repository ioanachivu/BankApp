import java.util.HashSet;
import java.util.Set;

public abstract class Account implements IBaseRate {

	private String name;
	private String ssn;
	private double balance;
	protected String accNumber;
	protected double rate;
	private static int index = 10000;
	private double accruedInterest;
	

	public Account(String name, String ssn, int initialDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initialDeposit;
		index++;
		// set account# method called
		this.accNumber = setAccNo();
		// set base rate
		setRate();
		// find out the accrue interest
		compound();
	}

	private String setAccNo() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int randNo = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + index + randNo;
	}

	public abstract void setRate();

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing: $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing: $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void compound() {
		accruedInterest = balance* (rate/100);
		balance += accruedInterest;
	}
	
	public void printBalance() {
		System.out.println("Your balance is: $"+ balance);
	}

	public void showInfo() {
		System.out.println("Name: " + name + 
						"\nAcc#: " + accNumber + 
						"\nBalance: " + balance + 
						"\nRate: " + rate + "%" +
						"\nAccrued Interest: $" + accruedInterest);
	}

	// set a random password method
	public String setPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYW0123456789!#$";
		char[] p = new char[length];

		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			p[i] = passwordSet.charAt(rand);
		}
		return new String(p);
	}
}
