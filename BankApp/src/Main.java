import java.util.List;

public class Main {
	public static void main(String[] args) {
	 
		List<String[]> newAccountHolder = CSV.fileReading("C:\\Users\\ChivuIoanaAlexandra\\git\\BankApp\\BankApp\\src\\bankFile.csv");
		
		for(String[] v: newAccountHolder) {
			System.out.println("New Account:");
			System.out.println(v[0]);
			System.out.println(v[1]);
			System.out.println(v[2]);
			System.out.println(v[3]);
		}
		
		/*
		Current cracc1 = new Current("John Snow","25789634",1500);
		Saving svacc1 = new Saving("Dwane Johnson","15697453",2100);
		
		cracc1.showInfo();
		System.out.println("---------------------------------");
		
		svacc1.deposit(100);
		cracc1.withdraw(1000);
		*/
		

}
}
