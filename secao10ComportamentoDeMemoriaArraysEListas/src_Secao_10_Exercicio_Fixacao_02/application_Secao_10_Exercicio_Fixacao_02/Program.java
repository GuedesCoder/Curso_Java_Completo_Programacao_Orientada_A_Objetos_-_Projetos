package application_Secao_10_Exercicio_Fixacao_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity_Secao_10_Exercicio_Fixacao_02.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employeeList = new ArrayList<>();

		System.out.print("How many employees will be registered?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(idInUse(employeeList, id)) {
				System.out.println("Id already taken! Try again.");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			employeeList.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee id that wil have salary incrase: ");
		Integer idToIncrementSalary = sc.nextInt();
		Employee employee = employeeList.stream().filter(x -> x.getId() == idToIncrementSalary).findFirst()
				.orElse(null);
		if (employee != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id)
				return i;
		}
		return null;
	}

	public static boolean idInUse(List<Employee> employeeList, int id) {
		Employee employee = employeeList.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
		return employee != null;
	}

}
