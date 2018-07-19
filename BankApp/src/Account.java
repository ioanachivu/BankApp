
public abstract class Account implements IBaseRate {

	private String name;
	private String ssn;
	private double balance;
	protected String accNumber;
	protected double rate;
	private static int index = 10000;
	private double accruedInterest;
	
	public Account(String name, String ssn, double initialDeposit) {
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
		// int randNo = (int) (Math.random() * Math.pow(10, 3)); 
		// commented this out so that the accounts have the same accNo every thine the app runs
		int randNo = 123;
		return lastTwoOfSSN + index + randNo;
	}

	public abstract void setRate();
	
	public void compound() {
		accruedInterest = balance* (rate/100);
		balance += accruedInterest;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccNumer() {
		return accNumber;
	}
	
	public String getSsn() {
		return ssn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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
}
