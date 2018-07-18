import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> fileReading(String file) {
		String string;
		List<String[]> data = new LinkedList<String[]>();
	    
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	        while((string = br.readLine()) != null) {
	            
	        	String[] v = string.split(",");
	            data.add(v);
	            }     System.out.println("The accounts have been loaded into the system");
	        } catch (FileNotFoundException ex) {
	            System.out.println("File not found");
	        } catch (IOException ex) {
	            System.out.println("Can't read file");
	        } 
	        return data;
	    }
}
