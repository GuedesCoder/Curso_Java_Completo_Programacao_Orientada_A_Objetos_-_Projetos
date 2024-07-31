package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class Program_Sec_08_Ex_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to incrase salary: ");
		System.out.println();
		double percent = sc.nextDouble();
		employee.incraseSalary(percent);
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
