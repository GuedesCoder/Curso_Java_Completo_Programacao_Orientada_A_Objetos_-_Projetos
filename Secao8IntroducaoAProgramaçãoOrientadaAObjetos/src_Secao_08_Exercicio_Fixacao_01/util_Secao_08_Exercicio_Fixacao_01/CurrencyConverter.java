package util_Secao_08_Exercicio_Fixacao_01;

public class CurrencyConverter {

	public static final double TAX = 0.06;

	public static double dollarFinalPrice(double amountToAcquire, double dollarUnitCost) {
		amountToAcquire += (amountToAcquire * TAX);
		return amountToAcquire * dollarUnitCost;
	}
}
