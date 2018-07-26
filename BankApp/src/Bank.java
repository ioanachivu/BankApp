import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	
	List<Account> accList = new LinkedList<Account>();
	
//	file reading method
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
	
// add account method
	public void addAccount() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please specify the type of account that you want to open (Savings/ Current):");
		String type = in.nextLine();
		
		System.out.println("Please insert the name of the account holder:");
		String name = in.nextLine();
		System.out.println("Please insert the SSN:");
		String ssn = in.nextLine();
		System.out.println("Please insert the initial deposit:");
		double initDeposit = in.nextDouble(); 
		
		if(type.equals("Savings")) {
			accList.add(new Saving(name,ssn,initDeposit));
			Account acc = accList.get(accList.size() - 1);
			acc.showInfo();
		} 
		else if(type.equals("Current")) {
			accList.add(new Current(name,ssn,initDeposit));	
			Account acc = accList.get(accList.size() - 1);
			acc.showInfo();
		}
		else System.out.println("Incorrect selection");
	}
	
// delete account method using the account #
	public void deleteAccount() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert the account number:");
		String accNo = in.nextLine();
		
		for(Account a: accList) {
			if(a.getAccNumber().equals(accNo)) {
				accList.remove(a);
				break;
			}
		}
		System.out.println("Account: "+ accNo + " has been deleted");
	}
	
// update account method
	
	
// search account method	
	
	
// deposit funds methods
	public void deposit(String accNo,double amount) {
		for(Account a: accList) {
			if(a.getAccNumber().equals(accNo)) {
				a.setBalance(a.getBalance() + amount);
				System.out.println("Depositing: $" + amount);
				a.printBalance();
			}
		}
	}
	
// withdraw funds method
	public void withdraw(String accNo,double amount) {
		for(Account a: accList) {
			if(a.getAccNumber().equals(accNo)) {
				a.setBalance(a.getBalance() - amount);
				System.out.println("Withdrawing: $" + amount);
				a.printBalance();
			}
		}
	}

// transfer funds method
	public void transfer(String fromWhere, String toWhere, double amount) {
		for (Account a : accList) {
			if (a.getAccNumber().equals(fromWhere)) {
				for (Account b : accList) {
					a.setBalance(a.getBalance() - amount);
					b.setBalance(b.getBalance() + amount);
				}
			}
			System.out.println("Transferring $" + amount + " to " + toWhere);
			a.printBalance();
			break;
		}
	}
	
	
// set a random password method
		public String setPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYW0123456789!#$";
			char[] p = new char[length];

			for (int i = 0; i < length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				p[i] = passwordSet.charAt(rand);
			}
			return new String(p);
		}
}
