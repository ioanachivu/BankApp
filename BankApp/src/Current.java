
public class Current extends Account {
	
	String debitCardNo;
	int debitCardPIN;
	
	public Current (String name, String ssn, int initialDeposit) {
		super(name,ssn,initialDeposit);
		System.out.println("New Current Account");
		
	}
}
