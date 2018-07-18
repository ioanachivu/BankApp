
public class Saving extends Account {

	private int safetyBoxID;
	private int safetyBoxKey;
	
	public Saving (String name,String ssn, int initialDeposit) {
		super(name,ssn,initialDeposit);
		accNumber = "1"+accNumber;
		// set the deposit box
		setSafetyBox();
	}
	
	private void setSafetyBox() {
		safetyBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account has been created :"+
				"\nSafety Depositbox ID: "+ safetyBoxID+
				"\nSafety Depositbox Key: "+ safetyBoxKey);
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
}
