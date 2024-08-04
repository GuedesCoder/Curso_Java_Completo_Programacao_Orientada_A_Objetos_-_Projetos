package entities_Services_Exercicio_Fixacao_01;

public class PaypalService implements IONlinePaymentService{

	@Override
	public double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(Double amount, Integer month) {
		return amount * 0.01 * month;
	}

}
