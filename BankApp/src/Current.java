
public class Current extends Account {
	
	String debitCardNo;
	int debitCardPIN;
	
	public Current (String name, String ssn, int initialDeposit) {
		super(name,ssn,initialDeposit);
		accNumber = "2"+accNumber;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Account type: Current");
	}
}
