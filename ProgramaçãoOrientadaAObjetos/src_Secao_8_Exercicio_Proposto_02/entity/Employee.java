package entity;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	public void incraseSalary(double percentagem) {
		grossSalary += grossSalary * (percentagem / 100);
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f",netSalary());
	}
}
