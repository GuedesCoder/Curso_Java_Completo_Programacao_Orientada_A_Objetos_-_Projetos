package secao4_ExerciciosSobreEstruturaSequencial_Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int quantidadePecas1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		int codigoPeca2 = sc.nextInt();
		int quantidadePecas2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		double totalPecas1 = quantidadePecas1 * valorUnitarioPeca1;
		double totalPecas2 = quantidadePecas2 * valorUnitarioPeca2;
		double totalAPagar = totalPecas1 + totalPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",  totalAPagar);
		
		sc.close();
	}

}
