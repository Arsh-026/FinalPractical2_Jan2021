package examPractical;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DoesFileExist {

	public static void main(String[] args) throws IOException {
		
		String path = "src\\main\\java\\config\\config.properties";
		FileInputStream input = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(input);
		
		//System.out.println(prop.getProperty("Apple"));
		
		doesFileExist(path);
		
	}
	
	public static void doesFileExist(String path) {
			
		try {
		FileInputStream input = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(input);
		
		String[] FirstWord = prop.getProperty("Apple").split(",");
		System.out.println("Apple");
		System.out.println("Meaning 1: " + FirstWord[0]);
		System.out.println("Meaning 2: " + FirstWord[1]);
		String[] SecondWord = prop.getProperty("Table").split(",");
		System.out.println("Table");
		System.out.println("Meaning 1: " + SecondWord[0]);
		System.out.println("Meaning 2: " + SecondWord[1]);
		String[] ThirdWord = prop.getProperty("Orange").split(",");
		System.out.println("Orange");
		System.out.println("Meaning 1: " + ThirdWord[0]);
		System.out.println("Meaning 2: " + ThirdWord[1]);
				
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
