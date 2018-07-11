
public abstract class Account implements IBaseRate {

	String name;
	String ssn;
	double balance;
	String accNumber;
	double rate;
	static int index = 10000;
	
	
	public Account (String name, String ssn, int initialDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initialDeposit;
		index++;
		// set account# method called
		this.accNumber = setAccNo(); 
	}
	
	private String setAccNo() {
		String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
		int randNo = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + index + randNo;
	}
	
	public void showInfo() {
		System.out.println(
				"Name: "+ name +
				"\nAcc#: "+accNumber +
				"\nBalance: "+balance);
	}
}

