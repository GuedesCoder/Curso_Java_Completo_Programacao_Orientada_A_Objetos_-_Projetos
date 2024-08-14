package srcSecao19ExercicioFixacaoMapApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//C:\Users\leand\Desktop\votes.txt
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votesAmount = Integer.parseInt(fields[1]);
				if(votes.containsKey(name)) {
					int accumulatedVotes = votes.get(name);
					votes.put(name, votesAmount+accumulatedVotes);
				} else {
					votes.put(name, votesAmount);
				}
				line = br.readLine();
			}
			
			for(String vote : votes.keySet()) {
				System.out.println(vote + ": " + votes.get(vote));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
