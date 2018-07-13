import java.util.Random;

public class Current extends Account {
	
	String debitCardNo = "";
	int debitCardPIN;
	
	public Current (String name, String ssn, int initialDeposit) {
		super(name,ssn,initialDeposit);
		accNumber = "2"+accNumber;
		// set debit card method
		setDebitCard();
	}
	
	private void setDebitCard() {
		for(int i=0;i<12;i++) {
			Random rand = new Random();
			String value = String.valueOf(rand.nextInt(9));
			debitCardNo = debitCardNo + value;
		}
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Current Account has been created :"+
				"\nDebit Card#: "+ debitCardNo+
				"\nCard PIN: "+ debitCardPIN);
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
}
