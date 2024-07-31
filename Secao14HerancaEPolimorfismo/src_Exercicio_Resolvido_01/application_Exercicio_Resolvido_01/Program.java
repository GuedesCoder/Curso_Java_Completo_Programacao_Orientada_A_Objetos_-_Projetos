package application_Exercicio_Resolvido_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_Exercicio_Resolvido_01.Employee;
import entities_Exercicio_Resolvido_01.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmplpoyees = sc.nextInt();
		
		for(int i = 1; i <= numberOfEmplpoyees; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n): ");
			char outsourcedEmployee = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Hours: ");
			int employeeHours = sc.nextInt();
			System.out.print("Value Per Hour: ");
			double employeeValuePerHour = sc.nextDouble();
			if(outsourcedEmployee == 'y') {
				System.out.print("Additional charge: ");
				double employeeAdditionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour, employeeAdditionalCharge));
			} else {
				employees.add(new Employee(employeeName, employeeHours, employeeValuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		
		sc.close();
	}

}
