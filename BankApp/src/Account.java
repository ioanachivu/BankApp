
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
		
		// set account# method called
		index++;
		this.accNumber = setAccNo();
		System.out.println("Account#: "+ accNumber);
	}
	
	private String setAccNo() {
		String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randNo = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randNo;
	}
}

