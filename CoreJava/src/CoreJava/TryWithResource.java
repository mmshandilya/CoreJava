package CoreJava;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {

		// Try block to check for exceptions
		// In a try-with-resources statement, 
		//catch or finally block executes after closing of the declared resources.
		try (
			// Adding resource
			FileOutputStream fos = new FileOutputStream("gfgtextfile.txt")) {
			String text = "Hello World. This is my java program";
			byte arr[] = text.getBytes();
			fos.write(arr);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resource are closed and message has been written into the gfgtextfile.txt");
	}
}
