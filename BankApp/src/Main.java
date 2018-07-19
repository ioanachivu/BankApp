
public class Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.fileReading();
		
		for(Account a: bank.accList) {
			a.showInfo();
		}
		
		bank.deposit("13810001123",150);
		//bank.withdraw(accNo, amount);
		
		/*
		Current cracc1 = new Current("John Snow","25789634",1500);
		Saving svacc1 = new Saving("Dwane Johnson","15697453",2100);
		
		cracc1.showInfo();
		System.out.println("---------------------------------");
		
		svacc1.deposit(100);
		cracc1.withdraw(1000);
		
		deposit(100,13810001696)
		*/
		

}
}
