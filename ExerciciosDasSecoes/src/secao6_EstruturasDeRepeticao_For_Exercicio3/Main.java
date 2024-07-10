package secao6_EstruturasDeRepeticao_For_Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		for(int i = 1; i <= N; i++) {
			double valor1 = sc.nextDouble() * peso1;
			double valor2 = sc.nextDouble() * peso2;
			double valor3 = sc.nextDouble() * peso3;
			double media = (valor1+valor2+valor3)/(peso1+peso2+peso3);
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}
}