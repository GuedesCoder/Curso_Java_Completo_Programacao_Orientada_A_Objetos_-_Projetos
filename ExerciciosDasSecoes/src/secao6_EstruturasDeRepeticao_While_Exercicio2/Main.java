package secao6_EstruturasDeRepeticao_While_Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
}