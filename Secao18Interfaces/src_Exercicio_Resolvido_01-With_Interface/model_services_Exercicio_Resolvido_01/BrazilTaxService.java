package model_services_Exercicio_Resolvido_01;

public class BrazilTaxService implements TaxService {

	public double tax(double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		} else {
			return amount * 0.15;
		}
	}
}