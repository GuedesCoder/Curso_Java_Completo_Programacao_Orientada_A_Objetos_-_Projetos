package application_Secao_08_Exercicio_Fixacao_01;

import java.util.Locale;
import java.util.Scanner;

import util_Secao_08_Exercicio_Fixacao_01.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double amountToAcquire;
		double dollarUnitCost;

		System.out.print("What's the dollar price? ");
		dollarUnitCost = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		amountToAcquire = sc.nextDouble();
		System.out.printf("Amount to be paid in BRL = %.2f\n",
				CurrencyConverter.dollarFinalPrice(amountToAcquire, dollarUnitCost));

		sc.close();
	}

}
