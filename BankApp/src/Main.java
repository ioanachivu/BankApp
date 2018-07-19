
public class Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.fileReading();
		
		for(Account a: bank.accList) {
			a.showInfo();
		}
		
		bank.deposit("13810001257",150);
		bank.withdraw("28310002257", 22);
		bank.transfer("27510003257", "13810001257", 452);
		
		/*
		Current cracc1 = new Current("John Snow","25789634",1500);
		Saving svacc1 = new Saving("Dwane Johnson","15697453",2100);
		
		*/
		

}
}
