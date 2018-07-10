
public class Saving extends Account {

	int safetyBoxID;
	int safetyBoxKey;
	
	public Saving (String name,String ssn, int initialDeposit) {
		super(name,ssn,initialDeposit);
		System.out.println("New Saving Account");
		
	}
}
