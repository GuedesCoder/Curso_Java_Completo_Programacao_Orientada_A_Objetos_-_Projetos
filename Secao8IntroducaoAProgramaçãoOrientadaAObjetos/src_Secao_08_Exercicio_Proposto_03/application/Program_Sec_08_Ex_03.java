package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class Program_Sec_08_Ex_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.print("Aluno: ");
		student.name = sc.nextLine();
		for (int i = 0; i <= 2; i++) {
			System.out.printf("Nota %d: ", i+1);
			student.grade[i] = sc.nextDouble();
		}

		System.out.printf("FINAL GRADE: %.2f\n", student.finalGrade());

		if (student.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
