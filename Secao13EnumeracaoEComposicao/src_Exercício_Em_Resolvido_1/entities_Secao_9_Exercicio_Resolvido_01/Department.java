package entities_Secao_9_Exercicio_Resolvido_01;

public class Department {
	private String name;
	
	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departmentos [departmento=" + name + "]";
	}
	
	
}
