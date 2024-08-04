package applicationFolder;

import java.io.File;
import java.util.Scanner;

/**
 * Program that exemplify the process of creating and managing folders from the File Class.
 */
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\newDirectory").mkdir();
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
