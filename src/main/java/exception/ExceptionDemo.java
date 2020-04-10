package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
	
	//error -- cannot be handled (memory error/ JVM is not running)
	//exception -- can handle (Throwable class)

	//checked exception (compile time exception) --Exception
	//unchecked exception (Run time exception) -- RuntimeException
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("test.txt");
		FileReader fr=null;
		
		try {
			fr = new FileReader(file);			
		} catch (FileNotFoundException e) {
			System.out.println("File not found"+file.toString());
		} catch (IOException e) {
			System.out.println("This is multi catch block");
		} finally {
			fr.close();
		}
	}
}
