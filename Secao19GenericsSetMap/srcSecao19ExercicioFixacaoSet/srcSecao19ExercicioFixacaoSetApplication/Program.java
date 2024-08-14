package srcSecao19ExercicioFixacaoSetApplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> a = new HashSet<>();
		Set<String> b = new HashSet<>();
		Set<String> c = new HashSet<>();
		
		System.out.print("Insert the number of students for course A: ");
		int studentsInCourseA = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < studentsInCourseA; i++) {
			String student = sc.nextLine();
			a.add(student);
		}
		
		System.out.print("Insert the number of students for course B: ");
		int studentsInCourseB = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < studentsInCourseB ; i++) {
			String student = sc.nextLine();
			b.add(student);
		}
		
		System.out.print("Insert the number of students for course C: ");
		int studentsInCourseC = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < studentsInCourseC ; i++) {
			String studentA = sc.nextLine();
			c.add(studentA);
		}
		
		Set<String> students = new HashSet<>(a);
		students.addAll(b);
		students.addAll(c);
		
		System.out.println("Total of students" + students.size());
		System.out.println();
		System.out.println("The List contain the students below:");
		for(String student : students) {
			System.out.println(student);
		}
		
		sc.close();
	}

}
