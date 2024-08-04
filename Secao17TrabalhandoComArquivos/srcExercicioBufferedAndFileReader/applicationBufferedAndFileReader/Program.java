package applicationBufferedAndFileReader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Program that exemplify and implements BufferedReader with FileReader in it's constructor.
 */
public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\leand\\Desktop\\resumo história age.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
