package secao5_EstruturaCondicional_Exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if (X > 0.0 && Y > 0.0) {
			System.out.println("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();
	}
}