package secao5_EstruturaCondicional_Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = 0.0;
		
		switch(codigo) {
		
		case 1:
			valor = 4.00;
			break;
		case 2:
			valor = 4.50;
			break;
		case 3:
			valor = 5.00;
			break;
		case 4:
			valor = 2.00;
			break;
		case 5:
			valor = 1.50;
			break;
		}
		
		double conta = quantidade * valor;
		
		System.out.printf("Total: R$ %.2f%n", conta);
		
		sc.close();
	}
}
