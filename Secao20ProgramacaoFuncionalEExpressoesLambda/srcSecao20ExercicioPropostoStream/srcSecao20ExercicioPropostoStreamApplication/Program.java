package srcSecao20ExercicioPropostoStreamApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import srcSecao20ExercicioPropostoStreamEntities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> employees = new ArrayList<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salaryReported = sc.nextDouble();
			
			
			List<String> emailAddress = employees.stream()
					.filter(x -> x.getSalary() > salaryReported)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());

			System.out.printf("Email of people whose salary is more than %.2f\n", salaryReported);
			
			emailAddress.forEach(System.out::println);
			
			double salarySum = employees.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x , y) -> x + y);
					
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", salarySum));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
