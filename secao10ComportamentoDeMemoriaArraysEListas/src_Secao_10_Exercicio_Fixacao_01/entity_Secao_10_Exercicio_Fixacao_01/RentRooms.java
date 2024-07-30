package entity_Secao_10_Exercicio_Fixacao_01;

public class RentRooms {
	private String studentName;
	private String studentEmail;

	public RentRooms() {
	}

	public RentRooms(String studentName, String studentEmail) {
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String toString() {
		return studentName + ", " + studentEmail;
	}

}
