package applicationBufferedAndFileWritter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Program that exemplify and implements BufferedWritter with FileWritter in it's constructor.
 */
public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		String path = "C:\\Users\\leand\\Desktop\\greatting.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
