import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Bank {
	
	List<Account> accList = new LinkedList<Account>();

	public void fileReading() {
		
        File file = new File("C:\\Users\\ChivuIoanaAlexandra\\git\\BankApp\\BankApp\\src\\bankFile.csv");
		String string;

	    
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	        while((string = br.readLine()) != null) {
	            
	        	String[] v = string.split(",");
	        	String name = v[0];
				String ssn = v[1];
				String accType = v[2];
				double initDeposit = Double.parseDouble(v[3]);
				
				if(accType.equals("Savings")) {
					accList.add(new Saving(name,ssn,initDeposit));
				} 
				else if(accType.equals("Current")) {
					accList.add(new Current(name,ssn,initDeposit));
				}
				else System.out.println("Error reading account type");
	            }     System.out.println("The accounts have been loaded into the system");
	        } catch (FileNotFoundException ex) {
	            System.out.println("File not found");
	        } catch (IOException ex) {
	            System.out.println("Can't read file");
	        } 
	    }
}
