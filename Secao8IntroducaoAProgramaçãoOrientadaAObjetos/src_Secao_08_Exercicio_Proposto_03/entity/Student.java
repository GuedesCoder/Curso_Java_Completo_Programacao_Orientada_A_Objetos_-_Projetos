package entity;

public class Student {
	public String name;
	public double[] grade = new double[3];

	public double finalGrade() {
		return grade[0] + grade[1] + grade[2];
	}

	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		} else {
			return 0.00;
		}
	}
}
