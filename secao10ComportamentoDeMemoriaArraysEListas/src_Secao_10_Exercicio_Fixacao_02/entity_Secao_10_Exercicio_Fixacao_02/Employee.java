package entity_Secao_10_Exercicio_Fixacao_02;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return getId() + ", " + name + ", " + String.format("%.2f", salary);
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
}
