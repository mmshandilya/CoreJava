package CoreJava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			readFile("mm.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found !!");
			//e.printStackTrace();
		}
	}
	private static void readFile(String fileName) throws FileNotFoundException 
	{
		FileReader reader=new FileReader(fileName);
	}
}
