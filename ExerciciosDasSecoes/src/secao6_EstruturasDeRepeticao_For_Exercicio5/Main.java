package secao6_EstruturasDeRepeticao_For_Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}

		System.out.println(fatorial);
		sc.close();
	}
}